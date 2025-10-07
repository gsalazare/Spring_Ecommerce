package com.proyecto.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringBootSecurity {

    @Autowired
    private UserDetailsService userDetailService;

    @Autowired
    private BCryptPasswordEncoder bCrypt;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .requestMatchers("/css/**", "/images/**", "/js/**", "/vendor/**").permitAll()  // Permitir acceso a archivos estáticos
                .requestMatchers("/administrador/**").hasRole("ADMIN")  // Restringir acceso a rutas de administrador solo a usuarios con rol ADMIN
                .requestMatchers("/productos/**").hasRole("ADMIN")  // Restringir acceso a rutas de productos solo a usuarios con rol ADMIN
                .and().formLogin().loginPage("/usuario/login")  // Configurar página de login
                .permitAll().defaultSuccessUrl("/usuario/acceder");  // Redirigir a una URL de éxito tras login

        return http.build();
    }

    // Configuración de AuthenticationManager para el login
    @Bean
    public AuthenticationManager authManager(HttpSecurity http) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder =
                http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.userDetailsService(userDetailService)
                .passwordEncoder(bCrypt);
        return authenticationManagerBuilder.build();
    }

    @Bean
    public BCryptPasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
    }
}

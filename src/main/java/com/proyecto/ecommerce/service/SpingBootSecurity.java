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
public class SpingBootSecurity {

    @Autowired
    private UserDetailsService userDetailService;

    @Autowired
    private BCryptPasswordEncoder bCrypt;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/css/**", "/images/**", "/js/**", "/vendor/**").permitAll()  // Permitir acceso a recursos estáticos
                .requestMatchers("/**").permitAll()  // Permitir acceso a todas las rutas sin restricción
                .and().formLogin().loginPage("/usuario/login")  // Página de login personalizada
                .permitAll().defaultSuccessUrl("/usuario/acceder");  // Redirigir a la página después del login exitoso

        return http.build();
    }

    // Configuración de AuthenticationManager para el login
    @Bean
    public AuthenticationManager authManager(HttpSecurity http) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder =
                http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.userDetailsService(userDetailService)
                .passwordEncoder(bCrypt);  // Codificador de contraseñas
        return authenticationManagerBuilder.build();
    }

    @Bean
    public BCryptPasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();  // Codificador de contraseñas
    }
}
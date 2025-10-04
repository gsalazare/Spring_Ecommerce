package com.proyecto.ecommerce.service;

import com.proyecto.ecommerce.model.Orden;
import com.proyecto.ecommerce.model.Usuario;

import java.util.List;

public interface IOrdenService {
    List<Orden> findAll();
    Orden save(Orden orden);
    String generarNumeroOrden();
    List<Orden> findByUsuario(Usuario usuario);
}

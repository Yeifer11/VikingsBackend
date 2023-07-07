package com.viking.viking.service;

import org.springframework.stereotype.Service;

import com.viking.viking.model.Usuario;

@Service
public class RegistroService {

	public String registrarUsuario(Usuario usuario) {
		System.out.println(" Hola "+ usuario.getNombre() + " Desde el service");
		return "La informacion ha llegado al service";
	}
	
}

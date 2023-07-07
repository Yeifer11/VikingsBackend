package com.viking.viking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.viking.viking.model.Usuario;
import com.viking.viking.service.RegistroService;

@RestController
public class RegistroController {

	@GetMapping("/registro")
	public String registrarUsuario(@RequestBody Usuario usuario) {
		System.out.println(usuario.getNombre());
		System.out.println(usuario.getApellido());
		System.out.println(usuario.getCorreo());
		System.out.print(usuario.getContraseña());
		RegistroService registroService = new RegistroService();		
		String respuesta = registroService.registrarUsuario(usuario);
		return respuesta;
		
	}
	
}

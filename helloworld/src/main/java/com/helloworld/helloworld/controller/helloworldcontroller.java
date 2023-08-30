package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello-world")

public class helloworldcontroller {

	@GetMapping
	public String hellowworld() {
		return "hello world";
			
		
	}
	@GetMapping("/BSM")
	public String ListaBSM() {
		return "\"Lista de BSM da Generation\\n\" +\r\n"
				+ "                \"Mentalidade de Crescimento\\n\" +\r\n"
				+ "                \"Persistência\\n\" +\r\n"
				+ "                \"Responsabilidade Pessoal\\n\" +\r\n"
				+ "                \"Orientação ao Futuro\\n\" +\r\n"
				+ "                \"Comunicação\\n\" +\r\n"
				+ "                \"Orientação ao Detalhe\\n\" +\r\n"
				+ "                \"Proatividade\\n\" +\r\n"
				+ "                \"Trabalho em Equipe\\n\" +\r\n";
	}
	
	 @GetMapping("/objetivos")
	    public String ListaObjetivos() {
	        return  "Meus Objetivos de Aprendizagem da Semana\n" +
	                "Revisar todo o conteúdo de MySQL/Spring boot \n" +
	                "Fazer exercicios praticos de Spring\n" +
	                "Criar um projeto para praticar minhas habilidades com Spring\n" ;
	                
		}
}
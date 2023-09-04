package br.com.sa4.grupoSA4.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sa4.grupoSA4.modelo.Pessoa;

@RestController
public class Controle {
	
	@GetMapping("")
	public String mensagem(){
		return "Hello World!";
	}
	
	@GetMapping("/boasvindas")
	public String boasVindas() {
		return "Seja bem vindo!";
	}
	
	@PostMapping("/pessoa")
	public Pessoa pessoa(@RequestBody Pessoa p) {
		return p;
	}
}

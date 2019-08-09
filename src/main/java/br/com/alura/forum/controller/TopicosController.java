package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<Topico> list(){
		Topico topico = new Topico("Duvida", "Duvida de Spring", new Curso("Spring", "Programacao"));
		return Arrays.asList(topico, topico, topico);
	}

}

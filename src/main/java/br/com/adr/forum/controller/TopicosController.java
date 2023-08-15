package br.com.adr.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adr.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		Topico topico = new Topico("Duvida", "Duvida com Spring Boot", new Curso("Spring", "Programação") );
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}
}

package com.bookingAgency.agencyHotel.rest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bookingAgency.agencyHotel.dto.PessoaDTO;
import com.bookingAgency.agencyHotel.model.Pessoa;
import com.bookingAgency.agencyHotel.repository.PessoaRepository;
import com.bookingAgency.agencyHotel.service.PessoaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PessoaController {
	
	@Autowired
	PessoaService pessoaService;
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@RequestMapping(method=RequestMethod.POST)
 	public ResponseEntity<Void> insert(@RequestBody PessoaDTO objDto) {
		Pessoa obj = pessoaService.fromDTO(objDto);
		obj = pessoaService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	
	
	
}
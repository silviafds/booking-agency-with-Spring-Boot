package com.bookingAgency.agencyHotel.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bookingAgency.agencyHotel.repository.PessoaRepository;
import com.bookingAgency.agencyHotel.rest.dto.PessoaDTO;
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
	
	@PostMapping("/addPerson")
	@ResponseStatus(HttpStatus.CREATED)
	public Integer addPerson(final @RequestBody PessoaDTO pessoa) {
		String senhaCriptografada = passwordEncoder.encode(pessoa.getSenha());
        pessoa.setSenha(senhaCriptografada);
        return pessoaService.addPerson(pessoa);
	}
	
	
	
	
}
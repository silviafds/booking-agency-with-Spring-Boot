package com.bookingAgency.agencyHotel.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookingAgency.agencyHotel.service.PessoaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PessoaController {
	
	@Autowired
	PessoaService pessoaService;
	
	
	
	
	
	
}
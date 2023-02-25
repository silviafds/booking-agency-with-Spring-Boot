package com.bookingAgency.agencyHotel.service;

import org.springframework.stereotype.Service;

import com.bookingAgency.agencyHotel.rest.dto.PessoaDTO;

@Service
public interface PessoaService {
	
	public Integer addPerson(PessoaDTO pessoaDTO);

	
	
}

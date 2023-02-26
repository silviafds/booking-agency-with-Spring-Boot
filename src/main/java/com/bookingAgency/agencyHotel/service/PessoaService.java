package com.bookingAgency.agencyHotel.service;

import org.springframework.stereotype.Service;

import com.bookingAgency.agencyHotel.dto.PessoaDTO;
import com.bookingAgency.agencyHotel.model.Pessoa;

@Service
public interface PessoaService {
	
	public Pessoa insert(Pessoa obj);
	public Pessoa fromDTO(PessoaDTO objDto);

}
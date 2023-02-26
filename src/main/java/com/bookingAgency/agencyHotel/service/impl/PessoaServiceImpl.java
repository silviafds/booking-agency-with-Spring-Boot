package com.bookingAgency.agencyHotel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookingAgency.agencyHotel.dto.PessoaDTO;
import com.bookingAgency.agencyHotel.model.Pessoa;
import com.bookingAgency.agencyHotel.repository.PessoaRepository;
import com.bookingAgency.agencyHotel.service.PessoaService;


@Component
public class PessoaServiceImpl implements PessoaService {
	
	@Autowired
	PessoaRepository pessoaRepository;

	public Pessoa insert(Pessoa obj) {
		return pessoaRepository.save(obj);
	}
	
	public Pessoa fromDTO(PessoaDTO objDto) {
		return new Pessoa(objDto.getId(), objDto.getName(), objDto.getEmail(), objDto.getPhone(), 
				objDto.getPapel());
	}
	

}

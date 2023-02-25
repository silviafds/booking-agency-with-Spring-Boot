package com.bookingAgency.agencyHotel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookingAgency.agencyHotel.model.Pessoa;
import com.bookingAgency.agencyHotel.repository.PessoaRepository;
import com.bookingAgency.agencyHotel.rest.dto.PessoaDTO;
import com.bookingAgency.agencyHotel.service.PessoaService;

import jakarta.transaction.Transactional;

@Component
public class PessoaServiceImpl implements PessoaService {
	
	@Autowired
	PessoaRepository pessoaRepository;

	@Transactional
	@Override
	public Integer addPerson(PessoaDTO pessoaDTO) {
		Pessoa pessoa = new Pessoa();
		pessoa.setName(pessoaDTO.getName());
		pessoa.setCpf(pessoaDTO.getCpf());
		pessoa.setEmail(pessoaDTO.getEmail());
		pessoa.setPhone(pessoaDTO.getPhone());
		pessoa.setPassword(pessoa.getPassword());
		return pessoa.getId();
	}

}

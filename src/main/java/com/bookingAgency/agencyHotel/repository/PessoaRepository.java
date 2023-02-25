package com.bookingAgency.agencyHotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
   
import com.bookingAgency.agencyHotel.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}

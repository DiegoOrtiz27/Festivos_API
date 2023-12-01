package com.festivos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.festivos.model.Festivo;

@Repository
public interface FestivoRepositorio extends JpaRepository<Festivo, Long>{

}

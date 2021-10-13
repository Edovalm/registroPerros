package com.edovalm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edovalm.models.entity.Raza;

@Repository
public interface RazaRepository extends JpaRepository<Raza, Integer>{

}

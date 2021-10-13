package com.edovalm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edovalm.models.entity.Perro;

@Repository
public interface PerroRepository extends JpaRepository<Perro, Integer>{

}

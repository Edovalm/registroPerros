package com.edovalm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edovalm.models.entity.Dueño;

@Repository
public interface DueñoRepository extends JpaRepository<Dueño, Integer>{

}

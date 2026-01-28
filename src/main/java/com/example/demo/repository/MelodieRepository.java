package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Melodie;

public interface MelodieRepository extends JpaRepository<Melodie, Long>{}
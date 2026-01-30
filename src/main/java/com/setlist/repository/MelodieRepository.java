package com.setlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setlist.entity.Melodie;

public interface MelodieRepository extends JpaRepository<Melodie, Long>{}
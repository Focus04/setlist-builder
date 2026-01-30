package com.setlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setlist.entity.Musician;

public interface MusicianRepository extends JpaRepository<Musician, Long>{}
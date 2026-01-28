package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Musician;

public interface MusicianRepository extends JpaRepository<Musician, Long>{}
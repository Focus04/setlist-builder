package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Concert;

public interface ConcertRepository extends JpaRepository<Concert, Long>{}
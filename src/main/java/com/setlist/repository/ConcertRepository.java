package com.setlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setlist.entity.Concert;

public interface ConcertRepository extends JpaRepository<Concert, Long>{}
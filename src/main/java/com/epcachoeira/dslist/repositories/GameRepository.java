package com.epcachoeira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epcachoeira.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

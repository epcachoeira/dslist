package com.epcachoeira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epcachoeira.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

package com.f1.f1list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.f1.f1list.models.ResultRaceModel;

@Repository
public interface IResultRace extends JpaRepository<ResultRaceModel,Long> {

    
}

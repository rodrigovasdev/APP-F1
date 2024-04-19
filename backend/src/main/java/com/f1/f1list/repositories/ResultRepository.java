package com.f1.f1list.repositories;

import com.f1.f1list.models.ResultRaceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ResultRepository extends JpaRepository<ResultRaceModel, Long> {
    Optional<ResultRaceModel> findFirstByOrderByIdAsc();
}
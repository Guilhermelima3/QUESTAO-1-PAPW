package com.example.dev.repository;

import com.example.dev.domain.Dinossauro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DinossauroRepository extends JpaRepository<Dinossauro, Long> {
}

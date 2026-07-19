package com.crm.backend.repository;

import com.crm.backend.entity.MotivoPerdida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivoPerdidaRepository extends JpaRepository<MotivoPerdida, Long> {

}
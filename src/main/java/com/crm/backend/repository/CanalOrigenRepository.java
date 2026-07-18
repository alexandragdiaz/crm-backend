package com.crm.backend.repository;

import com.crm.backend.entity.CanalOrigen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanalOrigenRepository extends JpaRepository<CanalOrigen, Long> {

}

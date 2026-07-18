package com.crm.backend.repository;

import com.crm.backend.entity.EtapaEmbudo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtapaEmbudoRepository extends JpaRepository<EtapaEmbudo, Long> {

}
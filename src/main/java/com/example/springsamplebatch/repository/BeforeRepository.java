package com.example.springsamplebatch.repository;

import com.example.springsamplebatch.entity.BeforeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeforeRepository extends JpaRepository<BeforeEntity, Long> {
}

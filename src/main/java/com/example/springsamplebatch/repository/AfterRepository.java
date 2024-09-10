package com.example.springsamplebatch.repository;

import com.example.springsamplebatch.entity.AfterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfterRepository extends JpaRepository<AfterEntity, Long> {
}

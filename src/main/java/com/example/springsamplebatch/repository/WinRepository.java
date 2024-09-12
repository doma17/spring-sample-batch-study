package com.example.springsamplebatch.repository;

import com.example.springsamplebatch.entity.WinEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WinRepository extends JpaRepository<WinEntity, Long> {
    Page<WinEntity> findByWinGreaterThanEqual(Long win, Pageable pageable);
}

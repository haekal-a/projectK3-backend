package com.example.demo.repo.dbpenaridesa;

import com.example.demo.domain.dbpenaridesa.PeminjamanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Repository
@Transactional
public interface IPeminjamanRepo extends JpaRepository<PeminjamanEntity, BigDecimal> {
}
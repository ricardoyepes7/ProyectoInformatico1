package com.innovasoft.PO2Academy.infrastructure.output.jpa.repository;

import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.DataPolicesEntity;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.DataPolicesEntityPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IDataPolicesRepository extends JpaRepository<DataPolicesEntity, DataPolicesEntityPk> {
    @Query(value = "SELECT * FROM politica_de_datos WHERE username = ?1 AND fecha BETWEEN ?2 AND ?3", nativeQuery = true)
    List<DataPolicesEntity> findByUsernameAndFechaBetween(String username, LocalDateTime startDate, LocalDateTime endDate);

}

package com.innovasoft.PO2Academy.repository;

import com.innovasoft.PO2Academy.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial,Long> {
}

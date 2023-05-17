package com.innovasoft.PO2Academy.repository;

import com.innovasoft.PO2Academy.entity.Glossary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlossaryRepository extends JpaRepository<Glossary,String> {
}

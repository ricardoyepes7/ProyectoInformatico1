package com.innovasoft.PO2Academy.service;

import com.innovasoft.PO2Academy.entity.Glossary;
import com.innovasoft.PO2Academy.repository.GlossaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GlossaryService {
    @Autowired
    private GlossaryRepository glossaryRepository;

    public List<Glossary> getAll(){
        return glossaryRepository.findAll();
    }
}

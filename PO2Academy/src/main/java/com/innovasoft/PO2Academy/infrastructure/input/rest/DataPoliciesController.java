package com.innovasoft.PO2Academy.infrastructure.input.rest;

import com.innovasoft.PO2Academy.application.handler.interfaces.IDataPoliciesHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/data-policies")
public class DataPoliciesController {
    private final IDataPoliciesHandler dataPoliciesHandler;
    @PostMapping
    public ResponseEntity<HttpStatus> saveDataPolice(Principal principal){
        dataPoliciesHandler.saveDataPolice(principal.getName());
        return ResponseEntity.ok().build();
    }
}

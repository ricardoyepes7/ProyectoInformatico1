package com.innovasoft.PO2Academy.domain.model;


public class Glossary {
    private final String word ;
    private final String definition;

    public Glossary(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }

}

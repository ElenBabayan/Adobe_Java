package com.aca.week12.Homework09.carregistery;

public class Document {

    private String documentNumber;

    public Document() {
    }

    public Document(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentNumber='" + documentNumber + '\'' +
                ", personId=" +
                '}';
    }
}

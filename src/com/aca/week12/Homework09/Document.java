package com.aca.week12.Homework09;

/*
Create a Database Car Registery
which need to have
1.Person Table with columns Name, Surname,Passport number
2.Document table with columns, Person_id(which refers To one person in person table)
Document number (Generate Random Numeric String )
3.Car Table
With columns Mark Name ,Model name,Document id(which refers to one document in Document table )

Create Repositories for all previously marked Entities with methods create and getById

Create 100 examples of each Entity and then print Entities with Id 54 ,60 ,92
 */
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

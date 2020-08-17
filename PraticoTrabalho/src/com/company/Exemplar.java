package com.company;

public class Exemplar {
//    atributos
    private String nome;
    private String ISBN;
    private int cod;

//    construtores
    public Exemplar() {
    }

    public Exemplar(String nome, String ISBN, int cod) {
        this.nome = nome;
        this.ISBN = ISBN;
        this.cod = cod;
    }

//    Get and Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
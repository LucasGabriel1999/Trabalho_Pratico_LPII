package com.company;

public class Exemplar {

    private String nome;
    private String ISBN;
    private int cod;
    private Emprestimo emprestimoPertencente;

    public Exemplar() {
        this.emprestimoPertencente = new Emprestimo();
    }

    public Exemplar(String nome, String ISBN, int cod) {
        this.nome = nome;
        this.ISBN = ISBN;
        this.cod = cod;
        this.emprestimoPertencente = new Emprestimo();
    }

    public Emprestimo getEmprestimoPertencente() {
        return emprestimoPertencente;
    }

    public void setEmprestimoPertencente(Emprestimo emprestimoPertencente) {
        this.emprestimoPertencente = emprestimoPertencente;
    }

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

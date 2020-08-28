package com.company;

import java.util.ArrayList;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private String CPF;

    private ArrayList<Emprestimo> listaEmprestimos;

    public Pessoa() {
        this.listaEmprestimos = new ArrayList<>();
    }

    public Pessoa(String nome, int idade, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.listaEmprestimos = new ArrayList<>();
    }

    //falta implementar
    public void bemVindo() {
        System.out.println("Bem vindo " + this.nome);
    }

    public ArrayList<Emprestimo> getListaEmprestimos() {
        return listaEmprestimos;
    }

    public void setListaEmprestimos(ArrayList<Emprestimo> listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}

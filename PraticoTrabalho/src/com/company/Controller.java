package com.company;

import java.util.ArrayList;

public class Controller {

    private ArrayList<Pessoa> listaPessoas;
    private ArrayList<Emprestimo> listaEmprestimo;
    private ArrayList<Exemplar> listaExemplar;

    public Controller() {
        this.listaPessoas = new ArrayList();
        this.listaEmprestimo = new ArrayList();
        this.listaExemplar = new ArrayList();
    }

    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public ArrayList<Emprestimo> getListaEmprestimo() {
        return listaEmprestimo;
    }

    public void setListaEmprestimo(ArrayList<Emprestimo> listaEmprestimo) {
        this.listaEmprestimo = listaEmprestimo;
    }

    public ArrayList<Exemplar> getListaExemplar() {
        return listaExemplar;
    }

    public void setListaExemplar(ArrayList<Exemplar> listaExemplar) {
        this.listaExemplar = listaExemplar;
    }

}

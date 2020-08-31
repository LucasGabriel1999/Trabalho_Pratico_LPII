package com.company;

import java.util.ArrayList;

public class Emprestimo implements IEmprestimo{
    private Pessoa pessoaSolicitante;
    private Funcionario funcinarioEncarregado;
    private ArrayList<Exemplar> listaExemplares;
    
    public Emprestimo(){
        this.listaExemplares = new ArrayList<>();
        this.funcinarioEncarregado = new Funcionario();
    }
    
    @Override
    public void addExemplar(Exemplar exemplar) {
    }

    @Override
    public boolean devolverLivros() {
        return true;
    }

    @Override
    public void definirDataDeDevolucao() {
    }

    public Pessoa getPessoaSolicitante() {
        return pessoaSolicitante;
    }

    public void setPessoaSolicitante(Pessoa pessoaSolicitante) {
        this.pessoaSolicitante = pessoaSolicitante;
    }

    public Funcionario getFuncinarioEncarregado() {
        return funcinarioEncarregado;
    }

    public void setFuncinarioEncarregado(Funcionario funcinarioEncarregado) {
        this.funcinarioEncarregado = funcinarioEncarregado;
    }

    public ArrayList<Exemplar> getListaExemplares() {
        return listaExemplares;
    }

    public void setListaExemplares(ArrayList<Exemplar> listaExemplares) {
        this.listaExemplares = listaExemplares;
    }
    
    
    
}

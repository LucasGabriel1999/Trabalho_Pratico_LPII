package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Emprestimo implements IEmprestimo {

    private Pessoa pessoaSolicitante;
    private Funcionario funcinarioEncarregado;
    private ArrayList<Exemplar> listaExemplares;
    private GregorianCalendar dataDeDevolucao;
    private int qtdDeLivrosPorEmprestimo = 0;

    public Emprestimo() {
        this.listaExemplares = new ArrayList<>();
        this.funcinarioEncarregado = new Funcionario();
        this.definirDataDeDevolucao();
    }

    public Emprestimo(Pessoa pessoaSolicitante, Funcionario funcinarioEncarregado, ArrayList<Exemplar> listaExemplares) {
        this.pessoaSolicitante = pessoaSolicitante;
        this.funcinarioEncarregado = funcinarioEncarregado;
        this.listaExemplares = listaExemplares;
        this.dataDeDevolucao = new GregorianCalendar();
        this.definirDataDeDevolucao();
    }

    @Override
    public void addExemplar(Exemplar exemplar) {
        if (this.qtdDeLivrosPorEmprestimo < 3) {
            this.listaExemplares.add(exemplar);
            this.qtdDeLivrosPorEmprestimo++;
        } else {
            throw new Error("Quantidade de Exemplares ultrapassou 3!");

        }
    }

    @Override
    public boolean devolverLivros() {
        this.qtdDeLivrosPorEmprestimo = 0;
        this.listaExemplares.clear();
        return true;
    }

    @Override
    public void definirDataDeDevolucao() {
        this.dataDeDevolucao.add(this.dataDeDevolucao.MONTH, 1);

    }
    
    public String getDataFormatada(){
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY"); //criando uma mascara
        String data = sdf1.format(this.dataDeDevolucao.getTime());
       
        return data;
    }

    public GregorianCalendar getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(GregorianCalendar dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public int getQtdDeLivrosPorEmprestimo() {
        return qtdDeLivrosPorEmprestimo;
    }

    public void setQtdDeLivrosPorEmprestimo(int qtdDeLivrosPorEmprestimo) {
        this.qtdDeLivrosPorEmprestimo = qtdDeLivrosPorEmprestimo;
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

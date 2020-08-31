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
    
     public void addEmprestimo(Emprestimo emprestimo) {
        this.listaEmprestimos.add((emprestimo));
    }

    public Emprestimo excluiEmprestimo(Emprestimo emprestimo) {
        Emprestimo emprestimoExcluido = null;
        String cpfAtual;
        String cpfParaExcluir = emprestimo.getPessoaSolicitante().getCPF();
        int indiceLista;

        for (Emprestimo emp : this.listaEmprestimos) {
            cpfAtual = emp.getPessoaSolicitante().getCPF();
            indiceLista = this.listaEmprestimos.indexOf(emp);

            if (cpfAtual.equals(cpfParaExcluir)) {
                emprestimoExcluido = this.listaEmprestimos.remove(indiceLista);
            }
        }

        return emprestimoExcluido;
    }

    public Emprestimo consultaEmprestimo(Emprestimo emprestimo) {
        String cpfAtual;
        String cpfParaConsulta = emprestimo.getPessoaSolicitante().getCPF();

        for (Emprestimo emp : this.listaEmprestimos) {

            cpfAtual = emp.getPessoaSolicitante().getCPF();

            if (cpfAtual.equals(cpfParaConsulta)) {
                return emp;
            }
        }
        
        return null;
    }
    
    public boolean atualizaEmprestimo(String cpf, Emprestimo emprestimoAtualizado){
        String cpfAtual;
        int indiceLista;

        for (Emprestimo emp : this.listaEmprestimos) {
            cpfAtual = emp.getPessoaSolicitante().getCPF();
            indiceLista = this.listaEmprestimos.indexOf(emp);

            if (cpfAtual.equals(cpf)) {
                this.listaEmprestimos.set(indiceLista, emprestimoAtualizado);
                return true;
            }
        }
        return false;
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

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", CPF=" + CPF + ", listaEmprestimos=" + listaEmprestimos + '}';
    }
    
    

}

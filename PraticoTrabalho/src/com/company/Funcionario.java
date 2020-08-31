package com.company;

import java.util.ArrayList;

public class Funcionario extends Pessoa implements HorarioDeTrabalho{
    private String funcao;
    private double salarioFuncionario;
    private int cargaHoraria;
    
    private ArrayList<Emprestimo> listaEmprestimos;

    public Funcionario(){
        super();
        this.listaEmprestimos= new ArrayList<>();
    }

    public Funcionario(String funcao, double salarioFuncionario, int cargaHoraria) {
        this.funcao = funcao;
        this.salarioFuncionario = salarioFuncionario;
        this.cargaHoraria = cargaHoraria;
    }

    public Funcionario(String nome, int idade, String CPF, String funcao, double salarioFuncionario, int cargaHoraria) {
        super(nome, idade, CPF);
        this.funcao = funcao;
        this.salarioFuncionario = salarioFuncionario;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void definirHorario(int horario){//Define Horario de trabalho do funcionario a partir da interface
        this.cargaHoraria = horario;
    }
     
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "funcao=" + funcao + ", salarioFuncionario=" + salarioFuncionario + ", cargaHoraria=" + cargaHoraria + ", listaEmprestimos=" + listaEmprestimos + '}';
    }
  
}

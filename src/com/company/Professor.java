package com.company;

public class Professor extends Pessoa{
//    atributos
    private String cargo;
    private double salarioProf;

//    construtores
    public Professor(){
        super();
    }

    public Professor(String cargo, double salarioProf) {
        this.cargo = cargo;
        this.salarioProf = salarioProf;
    }

    public Professor(String nome, int idade, String CPF, String cargo, double salarioProf) {
        super(nome, idade, CPF);
        this.cargo = cargo;
        this.salarioProf = salarioProf;
    }

//    Get and Set
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioProf() {
        return salarioProf;
    }

    public void setSalario(double salarioProf) {
        this.salarioProf = salarioProf;
    }

}

package com.company;

public class Aluno extends Pessoa {
//    atributos
    private String matricula;
    private String curso;

//    construtores
    public Aluno(){
        super();
    }

    public Aluno(String matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String nome, int idade, String CPF, String matricula, String curso) {
        super(nome, idade, CPF);
        this.matricula = matricula;
        this.curso = curso;
    }

//    Get and Set

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

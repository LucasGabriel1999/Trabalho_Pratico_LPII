package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
 
    Scanner scanner = new Scanner(System.in);
    
    public static ArrayList<Aluno> alunos = new ArrayList<>();
    public static ArrayList<Exemplar> exemplares = new ArrayList<>();
    public static ArrayList<Funcionario> funcionarios = new ArrayList<>();            
    public static ArrayList<Professor> professores = new ArrayList<>();
    
    /**
     *
     * @param op
     */
    public void novoCadastro(String op){//Cadastra nas listas;
        String nome;
        String CPF;
        int idade;
        
        if(op.equals("A")){//Aluno
           Aluno aluno = new Aluno();
           String matricula;
           String curso;  
           
           System.out.println("--- ALUNO ---\n");
           System.out.println("Informe o nome:\n"); aluno.setNome(nome = scanner.next());
           System.out.println("Informe o CPF:\n"); aluno.setCPF(CPF = scanner.next());
           System.out.println("Informe a idade:\n"); aluno.setIdade(idade = scanner.nextInt());
           System.out.println("Informe a matricula:\n"); aluno.setMatricula(matricula = scanner.next());
           System.out.println("Informe o curso:\n"); aluno.setCurso(curso = scanner.next());
          
           alunos.add(aluno);
        
        }
        
        if(op.equals("E")){//Exemplar
           Exemplar exemplar = new Exemplar();  
           
           String ISBN;
           int cod;
           
           System.out.println("--- EXEMPLAR ---\n");
           System.out.println("Informe o nome:\n"); exemplar.setNome(nome = scanner.next());
           System.out.println("Informe o ISBN:\n"); exemplar.setISBN( ISBN  = scanner.next());
           System.out.println("Informe o codigo:\n"); exemplar.setCod(cod = scanner.nextInt());
          
           exemplares.add(exemplar);
           
        }
        
        if(op.equals("F")){//Funcionario
           Funcionario funcionario = new Funcionario();
           
           String funcao;
           double salarioFuncionario;
           int cargaHoraria;
    
           System.out.println("--- FUNCIONARIO ---\n");
           System.out.println("Informe o nome:\n"); funcionario.setNome(nome = scanner.next());
           System.out.println("Informe o CPF:\n"); funcionario.setCPF(CPF = scanner.next());
           System.out.println("Informe a idade:\n"); funcionario.setIdade(idade = scanner.nextInt());
           System.out.println("Informe a função:\n"); funcionario.setFuncao(funcao = scanner.next());
           System.out.println("Informe o salario:\n"); funcionario.setSalarioFuncionario(salarioFuncionario = scanner.nextDouble());
            System.out.println("Informe a carga horaria:\n"); funcionario.setCargaHoraria(cargaHoraria = scanner.nextInt());
          
           funcionarios.add(funcionario);
           
        }
        
        if(op.equals("P")){//Professor
           Professor professor = new Professor();
           
           String cargo;
           double salarioProf;
    
           System.out.println("--- FUNCIONARIO ---\n");
           System.out.println("Informe o nome:\n"); professor.setNome(nome = scanner.next());
           System.out.println("Informe o CPF:\n"); professor.setCPF(CPF = scanner.next());
           System.out.println("Informe a idade:\n"); professor.setIdade(idade = scanner.nextInt());
           System.out.println("Informe o cargo:\n"); professor.setCargo(cargo = scanner.next());
           System.out.println("Informe o salario:\n"); professor.setSalario(salarioProf = scanner.nextDouble());
                    
           professores.add(professor);
        }
        
        
    }
    
    public void excluiNaLista(String op){
    
    }

}
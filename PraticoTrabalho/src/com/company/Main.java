/*---------*---------*---------*---------*---------*---------*---------*-------
* --------- TRABALHO PRÁTICO FINAL - LINGUAGEM DE PROGRAMAÇÃO II ---------
* --------- TURMA: 5ºPERIODO BCC ---------
* --------- PROFESSOR: FERNANDO ROBERTO PROENÇA ---------
* --------- ALUNO(S) ---------
*
*   => CARLOS ANTONIO DE SOUZA PADILHA
*   => FABIANO REIS FALEIROS
*   => LUCAS GABRIEL LEITE DA SILVA
*
* ---------*---------*---------*---------*---------*---------*---------*-------
* --------- Sistema para Controle de Empréstimos de Livros e Revistas ---------
* ---------*---------*---------*---------*---------*---------*---------*-------
* */
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//    Listas
    public static ArrayList<Aluno> alunos = new ArrayList<>();
    public static ArrayList<Exemplar> exemplares = new ArrayList<>();
    public static ArrayList<Funcionario> funcionarios = new ArrayList<>();            
    public static ArrayList<Professor> professores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        
        String opcao;
        int op =-1;
        
        while(op != 0){
            System.out.println("--- TRABALHO PRÁTICO FINAL - LINGUAGEM DE PROGRAMAÇÃO II ---");
            System.out.println("1 - Cadastrar\n");
            System.out.println("2 - Excluir\n");
            op = scanner.nextInt();
            
            switch(op){
//                case 1:{
//
//                    System.out.println("---Olá, que bom que deseja se cadastrar!---\n");
//                    System.out.println("Para se cadstarar nas classes escolha uma letra referente a classe desejada:");
//                    System.out.println("[A] => Aluno\n[E] => Exemplar\n[F] => Funcionario\n[P] => Professor");
//                    opcao = scanner.next();
//                    opcao = opcao.toUpperCase();
//                    
//                    
//                    
//                    break;
//                }
//                
//                case 2:{
//                    
//                    System.out.println("---Olá, vamos excluir!---\n");
//                    System.out.println("Para excluir nas classes escolha uma letra referente a classe desejada:");
//                    System.out.println("[A] => Aluno\n[E] => Exemplar\n[F] => Funcionario\n[P] => Professor");
//                    opcao = scanner.next();
//                    opcao = opcao.toUpperCase();
//                    
//                    
//                    break;
//                }
            }
        }


    }
}


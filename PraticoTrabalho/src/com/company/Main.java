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
        
        int op =-1;
       
        System.out.println("--- TRABALHO PRÁTICO FINAL - LINGUAGEM DE PROGRAMAÇÃO II ---");
        while(op != 0){
            System.out.println("\n------------------------------------------\n");
            System.out.println("1 - Cadastrar lista pronta (PESSOAS)\n");
            System.out.println("2 - Cadastrar lista pronta (EXEMPLARES)\n");
            System.out.println("3 - Criar uma nova Pessoa\n");
            System.out.println("4 - Criar um novo Exemplar\n");
            System.out.println("5 - Mostar lista de Pessoas\n");
            System.out.println("6 - Mostar lista de Exemplares\n");
            System.out.println("7 - Remover uma Pessoa\n");
            System.out.println("8 - Remover um Exemplar\n");
            System.out.println("0 - Encerrar\n");
            op = scanner.nextInt();
            
            switch(op){
                case 1:{
                    controller.leitorPessoas();
                    break;
                }
                
                case 2:{
                    controller.leitorExemplares();       
                    break;
                }
                
                case 3:{
                    controller.criaPessoa();
                    break;
                }
                
                case 4:{
                    controller.criaExemplar();
                    break;
                }
                
                case 5:{
                    
                    for (int i = 0; i < controller.getListaPessoas().size(); i++) {
                        System.out.println("\n-------------------");
                        System.out.println("\nNome:" + controller.getListaPessoas().get(i).getNome());
                        System.out.println("\nCPF:"+ controller.getListaPessoas().get(i).getCPF());
                        System.out.println("\nIdade:" + controller.getListaPessoas().get(i).getIdade());
                    }
                    
                    break;
                }
                
                case 6:{
                    
                    for (int i = 0; i < controller.getListaExemplar().size(); i++) {
                        System.out.println("\n-------------------");
                        System.out.println("\nNome:" + controller.getListaExemplar().get(i).getNome());
                        System.out.println("\nIsbn:"+ controller.getListaExemplar().get(i).getISBN());
                        System.out.println("\ncod:" + controller.getListaExemplar().get(i).getCod());
                    }
                    
                    break;
                }
                
                case 7: {
                    controller.exclusaoPessoa();
                    break;
                }
                
                case 8: {
                    controller.exclusaoExemplar();
                    break;
                }
            }
        }
    }
}

package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private ArrayList<Pessoa> listaPessoas;
    private ArrayList<Emprestimo> listaEmprestimo;
    private ArrayList<Exemplar> listaExemplar;
    
    Scanner scanner = new Scanner(System.in);
    boolean flag = false;
    int i = 0;

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
    
    public void inserePessoa(Pessoa pessoa){
        this.listaPessoas.add(pessoa);
    }
    
    public void insereExemplar(Exemplar exemplar){
        this.listaExemplar.add(exemplar);
    }

    public void leitorPessoas (){//le um arquivo com algumas pessoas, já com valores de seus atributos
              
        String nomeArq = "Pessoa.txt";
        int nL;
        
        try {
            FileReader arq = new FileReader(nomeArq);
            BufferedReader lerArq = new BufferedReader(arq);
            
            String linha= lerArq.readLine(); //Vai ler a primeira linha do TXT, que no caso contém o numero de usuarios.
            nL = Integer.parseInt(linha);
            
            String informacao[];
            String nome;
            int idade;
            String cpf;
            
            for (i = 0; i < nL; i++) {
                linha = lerArq.readLine();
                informacao = linha.split(" ");//Para separar as informações
                nome = informacao[0];
                idade = Integer.parseInt(informacao[1]);
                cpf = informacao[2];

                this.inserePessoa(new Pessoa(nome, idade, cpf) {});
            }
            System.out.println("\nLista adicionada!\n");
            
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo!");
        }
    }
    
        public void leitorExemplares (){// le um arquivo com alguns exemplares, já com valores de seus atributos

        String nomeArq = "Exemplares.txt";
        int nL;
        
        try {
            FileReader arq = new FileReader(nomeArq);
            BufferedReader lerArq = new BufferedReader(arq);
            
            String linha= lerArq.readLine(); //Vai ler a primeira linha do TXT, que no caso contém o numero de usuarios.
            nL = Integer.parseInt(linha);
            
            String informacao[];
            String nome;
            String isbn;
            int cod;
            
            for (i = 0; i < nL; i++) {
                linha = lerArq.readLine();
                informacao = linha.split(", ");//Para separar as informações
                nome = informacao[0];
                isbn = informacao[1];
                cod = Integer.parseInt(informacao[2]);
                           
                this.insereExemplar(new Exemplar(nome, isbn, cod));
            }
            System.out.println("\nLista adicionada!\n");
            
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo!");
        }
    }
        
    public void criaPessoa(){//Solicitado para criar uma pessoa fora da lista txt
        
        String nome;
        int idade;
        String cpf;
        
        System.out.println("\n*** Nova Pessoa ***");
        System.out.println("\n Informe o nome:"); nome = scanner.next();
        System.out.println("\n Informe a idade: "); idade = scanner.nextInt();
        System.out.println("\n Informe o CPF: "); cpf = scanner.next();
        System.out.println("\n*********************\n");
        
        this.inserePessoa(new Pessoa(nome, idade, cpf) {});
        System.out.println("\nPessoa criada!");
        System.out.println("\n*********************\n");
    }
    
    public void criaExemplar(){//Solicitado para criar um exemplar fora da lista txt
        
        String nome;
        String isbn;
        int cod;
        
        System.out.println("\n*** Novo Exemplar ***");
        System.out.println("\n Informe o nome:"); nome = scanner.next();
        System.out.println("\n Informe o codigo: "); cod = scanner.nextInt();
        System.out.println("\n Informe o ISBN: "); isbn = scanner.next();
                
        this.insereExemplar(new Exemplar(nome, isbn, cod));
        System.out.println("\nExemplar criado!");
        System.out.println("\n*********************\n");
    }
    
    public void exclusaoPessoa(){
        String cpf; 
        
        System.out.println("\n*** Remover uma pessoa da lista ***");
        System.out.println("\n Informe o CPF da pessoa que deseja remover da lista: "); cpf = scanner.next();
        
        for ( i = 0; i < this.listaPessoas.size(); i++) {
            if(this.listaPessoas.get(i).getCPF().equals(cpf)){
                this.listaPessoas.remove(i);
                System.out.println("\nRemoção cocluida!\n");
            }
        }
    }
    
    public void exclusaoExemplar(){
        String isbn; 
        
        System.out.println("\n*** Remover uma pessoa da lista ***");
        System.out.println("\n Informe o ISBN do exemplar que deseja remover da lista: "); isbn = scanner.next();
        
        for ( i = 0; i < this.listaExemplar.size(); i++) {
            if(this.listaExemplar.get(i).getISBN().equals(isbn)){
                this.listaExemplar.remove(i);
                System.out.println("\nRemoção cocluida!\n");
            }
        }
    }
}

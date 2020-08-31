package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    private ArrayList<Pessoa> listaPessoas;
    private ArrayList<Emprestimo> listaEmprestimo;
    private ArrayList<Exemplar> listaExemplar;

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

    public void leitorPessoas (){//le um arquivo com algumas pessoas, já com valores de seus atributos
        Pessoa pessoa = new Pessoa() {};
        
        String nomeArq = "Entrada.txt";
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
            
            for (int i = 0; i < nL; i++) {
                linha = lerArq.readLine();
                informacao = linha.split(" ");//Para separar as informações
                nome = informacao[0];
                idade = Integer.parseInt(informacao[1]);
                cpf = informacao[2];
                
                pessoa.setNome(nome);
                pessoa.setIdade(idade);
                pessoa.setCPF(cpf);
                
                this.listaPessoas.add(pessoa);
            }
            
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo!");
        }
    }
    
        public void leitorExemplares (){// le um arquivo com alguns exemplares, já com valores de seus atributos
        Exemplar exemplar = new Exemplar();
        
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
            
            
            for (int i = 0; i < nL; i++) {
                linha = lerArq.readLine();
                informacao = linha.split(",");//Para separar as informações
                nome = informacao[0];
                isbn = informacao[1];
                cod = Integer.parseInt(informacao[2]);
                
                exemplar.setNome(nome);
                exemplar.setISBN(isbn);
                exemplar.setCod(cod);
                
                this.listaExemplar.add(exemplar);
            }
            
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo!");
        }
    }
}

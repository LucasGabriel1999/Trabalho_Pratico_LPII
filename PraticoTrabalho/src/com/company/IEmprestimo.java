package com.company;

public interface IEmprestimo {
    public int qtdLivrosPorEmprestimo = 3;
    
    public void addExemplar(Exemplar exemplar);
    public boolean devolverLivros();
    public void definirDataDeDevolucao();
}

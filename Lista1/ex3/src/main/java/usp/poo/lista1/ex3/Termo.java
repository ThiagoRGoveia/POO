package usp.poo.lista1.ex3;
/*
* Classe define o Termo utilizado na classe
* Polinomio, possui um grau e um valor como
* variáveis de instancia
*/
public class Termo {
    public int grau;
    public double valor;
    // Construtor recebe um valor e os armazena nas variáveis de instância
    Termo(int grau, double valor) {
        this.grau = grau;
        this.valor = valor;
    }
}

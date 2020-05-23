/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

/**
 *
 * @author Dell
 */
public class Conta {

    private int numeroConta;
    private String nome;
    private double saldo;

    public Conta(int conta, String nome) {
        this.numeroConta = conta;
        this.nome = nome;

    }

    //costrutor tres parametros com o deposito inicial
    public Conta(int conta, String nome, double inicialDeposito) {
        this.numeroConta = conta;
        this.nome = nome;
        deposito(inicialDeposito);

    }

    public Conta() {
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double deposito) {

        this.saldo += deposito;
    }

    public void saque(double saque) {
        this.saldo -= saque + 5;
    }

    public String toString() {

        return "Numero da conta\n" + numeroConta
                + "\nNome do titular\n"
                + nome
                + "\nSaldo em conta\n"
                + "$ " + String.format("%.2f", saldo);
    } 

}

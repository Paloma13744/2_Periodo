package contabanco;

import java.util.Scanner;

public class Conta {

    private int numConta;
    private String tipo;
    private double saldo;
    private String titular;
    private Boolean status;
    private String planos_cc = "b,i,p";
    private String planos_cp = "pb,pn";

    public void exibirConta() {
        System.out.println("Número da conta:" + this.getNumConta());
        System.out.println("Nome do títular:" + this.getTitular());
        System.out.println("Tipo de conta:" + this.getTipo());
        System.out.println("Status da conta:" + this.getStatus());
        System.out.println("Saldo da conta:" + this.getSaldo());

    }

    public void abriConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            System.out.println("Conta corrente de número:" + this.getNumConta() + " foi aberta com sucesso!");
        } else if (t == "CP") {
            System.out.println("Conta poupança de número:" + this.getNumConta() + " foi aberta com sucesso!");
        } else {
            System.out.println("Erro,ao criar conta!");
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada,pois ainda contém saldo positivo");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, pois está com saldo negativo,por favor quite o valor devido");
        } else {
            System.out.println("Conta encerrada com sucesso!");
            this.setStatus(false);
        }
    }

    public void depositar(double v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Valor depósito com sucesso!");
        } else {
            System.out.println("Conta não existe");
        }

    }

    public void sacar(double v) {
        if (this.getStatus()) {
            if (this.getSaldo() > 0) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println(this.getSaldo());
            } else if (this.getSaldo() < 0) {
                System.out.println("Saldo insuficiente");
            } else {
                System.out.println("Impossível retirar valor de uma conta fechada");
            }
        }
    }

    public double Mensal(String t) {  // codigo com erro
        this.setTipo(t);
        double mcc = 22.10;
        double mcp = 15 ;
           if(this.getStatus()){
               if(t=="CC"){
                   this.setSaldo(this.getSaldo() - mcc);
                   return this.getSaldo();
               }
               else if(t =="CP"){
                   this.setSaldo(this.getSaldo() - mcp);
                    return this.getSaldo();
               }
               else{
                   System.out.println("Tipo da conta não foi selecionada");
               }
           }
        return this.getSaldo();
    }

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

 
 
   
   

}

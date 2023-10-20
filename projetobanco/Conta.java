
package projetobanco;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private boolean contaespecial;
    private double lim_chequeespecial;
    private boolean retirar = true;
    private boolean creditar = true;

    public Conta() {
        
        
    }

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
   
    
    public void debitar(boolean retirar,double valor){
        if(retirar==true){
            saldo = saldo - valor;
        }
        else{
            saldo = saldo;
        }
        
    }
    
    public void creditar(boolean creditar ,double valor){
        if(creditar==true){
            saldo = saldo + valor;
        }
        else{
            saldo = saldo;
        }
    }
  
    public void imprimir(){
        System.out.println("Conta:" + numero + "| Titular:"+ titular + " |Saldo disponível:" + saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isContaespecial() {
        return contaespecial;
    }

    public void setContaespecial(boolean contaespecial) {
        this.contaespecial = contaespecial;
    }

    public double getLim_chequeespecial() {
        return lim_chequeespecial;
    }

    public void setLim_chequeespecial(double lim_chequeespecial) {
        this.lim_chequeespecial = lim_chequeespecial;
    }
    
    


    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", titular=" + titular + ", contaespecial=" + contaespecial + ", lim_chequeespecial=" + lim_chequeespecial + '}';
    }
    
    
    
            
}

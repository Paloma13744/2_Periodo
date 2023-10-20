
package contabanco;

public class ContaBanco {

    public static void main(String[] args) {
       Conta c1 = new Conta();
      // System.out.println("Informe CC  para conta corrente e CP para poupança");
       c1.setNumConta(1555);
       c1.setTipo("CC");
       c1.setTitular("Maria");
       c1.abriConta("CC");
       //System.out.println("Escolha um tipo de plano para conta corrente ou poupança");
       // b , i ou p
       // pn ou pn
      
       c1.depositar(650);
       c1.exibirConta();
       c1.sacar(50);
      c1.exibirConta();
       

    }
    
}

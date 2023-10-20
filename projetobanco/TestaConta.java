
package projetobanco;

public class TestaConta {

    public static void main(String[] args) {
      
        Conta c1 = new Conta(1,"Gabrielly V.C.Assunção",5000);
        c1.debitar(true,200);
        c1.imprimir();
        System.out.println("-----------------");
        c1.creditar(true, 100000);
        c1.imprimir();
        
        
        //Conta c2 = new Conta(3,"Paulo",600);
        //c2.imprimir();
        
    }
    
}

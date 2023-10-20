
package teste;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import ponto.Ponto;
import helper.ConjuntoHelper;


import ponto.Conjunto;

public class TestarPonto {

    public static void main(String a[]) {
        
        ConjuntoHelper conjuntoHelper=ConjuntoHelper.getInstance();

        Conjunto c1=new Conjunto(1, "c1");
        System.out.println(c1);        
        Ponto p1=new Ponto("p1", 5, 10);        
        if (c1.adicionar(p1)>=0){
            System.out.println("Sucesso!");
        }
        else{
            System.out.println("Erro");
        }        
        System.out.println(c1);
        c1.adicionar(new Ponto("p2", 55, 11));
        System.out.println(c1);
        c1.listarPontos();

        conjuntoHelper.addConjunto(c1);

        ArrayList lista = conjuntoHelper.getListaConjunto();
        Conjunto temp=null;
        for (int i=0; i<lista.size();i++){
            temp=(Conjunto)lista.get(i);
            System.out.println(temp);
        }
    }
}

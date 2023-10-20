/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import modelo.LivroVO;
import modelo.PrateleiraVO;

/**
 *
 * @author geraldo
 */
public class TesteLivraria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PrateleiraVO prateleira = new PrateleiraVO(1, "Matemática básica");
        
        LivroVO l1=new LivroVO(1, "Física 1", "Halliday", 100);
        prateleira.adicionarLivro(l1);
        prateleira.imprimirLivros();
                
    }
    
}

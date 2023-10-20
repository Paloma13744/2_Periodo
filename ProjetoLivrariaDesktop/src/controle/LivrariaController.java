/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.SQLException;

/**
 *
 * @author geraldo
 */
public class LivrariaController {
   
        private static LivrariaController instance;

	private LivrariaController()
	{
	}
	
        /**
         * Implementa o singleton.
         * @return
         * @throws SQLException 
         */
	public static LivrariaController getInstance(){
		
		if (instance==null){
                    instance = new LivrariaController();
		}
		return instance;
	}    
    
}



package helper;

import ponto.Conjunto;
import java.util.ArrayList;

public class ConjuntoHelper {

        private ArrayList listaConjunto;

        private static ConjuntoHelper instance;

	private ConjuntoHelper() {
            listaConjunto=new ArrayList();
	}

	public static synchronized ConjuntoHelper getInstance() {
		if (instance == null)
			instance = new ConjuntoHelper();

		return instance;
	}

        public ArrayList getListaConjunto(){
            return listaConjunto;
        }

        public void addConjunto(Conjunto conjunto){
            listaConjunto.add(conjunto);
        }
        
}

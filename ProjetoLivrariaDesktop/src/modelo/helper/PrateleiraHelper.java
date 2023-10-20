/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.helper;

import java.util.ArrayList;
import modelo.PrateleiraVO;

/**
 *
 * @author geraldo
 */
public class PrateleiraHelper {
    
    /** Implementa o singleton */
    private static PrateleiraHelper instance;
    
    /* */
    private ArrayList<PrateleiraVO> listaPrateleiras;
    
    private PrateleiraHelper(){
        listaPrateleiras = new ArrayList<PrateleiraVO>();
    }
    
    /**
     * Retorna o singleton.
     * @return 
     */
    public static PrateleiraHelper getInstance(){
        if (instance==null){
            instance=new PrateleiraHelper();
        }
        return instance;
    }    

    public ArrayList<PrateleiraVO> getListaPrateleiras() {
        return listaPrateleiras;
    }

    public void setListaPrateleiras(ArrayList<PrateleiraVO> listaPrateleiras) {
        this.listaPrateleiras = listaPrateleiras;
    }
    
    public int adicionarPrateleira(PrateleiraVO prateleiraVO){
        listaPrateleiras.add(prateleiraVO);
        return 1;
    }
    
    public int removerPrateleira(PrateleiraVO prateleiraVO){
        int contador=0;
        for (int i=0; i<listaPrateleiras.size();i++){
            if(listaPrateleiras.get(i).getCodigo()==prateleiraVO.getCodigo()){
                if (listaPrateleiras.remove(listaPrateleiras.get(i))){
                    contador++;
                }
            }
        }
        return contador;        
    }
    public PrateleiraVO pesquisarPrateleira(int codigo){

        for (int i=0; i<listaPrateleiras.size();i++){
            if(listaPrateleiras.get(i).getCodigo()==codigo){
                return listaPrateleiras.get(i);
            }
        }
        return null;
    }
    
    public int atualizarPrateleira(PrateleiraVO prateleiraVO){
        PrateleiraVO temp=null;
        int numeroRegistrosAlterados=0;
        for (int i=0; i<listaPrateleiras.size();i++){
            temp=listaPrateleiras.get(i);
            if(temp.getCodigo()==prateleiraVO.getCodigo()){
                temp.setDescricao(prateleiraVO.getDescricao());
                numeroRegistrosAlterados=1;
            }
        }
        return numeroRegistrosAlterados;
    }
    
    public String[] getCodigos(){

        String[] listaCodigos = new String[listaPrateleiras.size()];
        for (int i=0; i<listaPrateleiras.size();i++){
            listaCodigos[i]=""+listaPrateleiras.get(i).getCodigo();
        }
        return listaCodigos;
    }  
    
    
}

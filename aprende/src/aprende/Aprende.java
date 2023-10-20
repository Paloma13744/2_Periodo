
package aprende;

import java.util.ArrayList;


public class Aprende {

    private double codigo;
    private String descricao;
    private ArrayList listaDeInfo;

    public Aprende() {
    }
    
    
    public Aprende(double codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        listaDeInfo = new ArrayList();
        
    }
    
    public void adicionarAluno(Alunos estudante){
        listaDeInfo.add(estudante);
    }
    
    public void excluirAluno(Alunos estudante){
        
        for (int i = 0; i < listaDeInfo.size() ; i++) {
            if(estudante.equals(listaDeInfo.get(i))){
                listaDeInfo.remove(i);
            }
        }
    }
    
    public void listarAlunos(){
        Alunos listando = null;
        System.out.println("Iniciar Lista");
        for (int i = 0; i < listaDeInfo.size(); i++) {
            listando = (Alunos) listaDeInfo.get(i);
            System.out.println(listando.getNome());
        }
        System.out.println("Fim da Lista ");
        
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList getListaDeInfo() {
        return listaDeInfo;
    }

    public void setListaDeInfo(ArrayList listaDeInfo) {
        this.listaDeInfo = listaDeInfo;
    }
    
    
    
}




package aprende;


public class Rodar {
    
    public static void main(String[] args) {
        
        Alunos Thiago = new Alunos("Thiago", "0056515");
        Alunos Paloma = new Alunos("Paloma", "0056518");
        Alunos Joao = new Alunos("João", "0056518");
        Alunos Maria = new Alunos("Maria", "0056518");
        Alunos Pedro = new Alunos("Pedro", "0056518");
      
        
        Aprende classe = new Aprende(1, "Matemática");
        
        classe.adicionarAluno(Thiago);
        classe.adicionarAluno(Paloma);
        classe.adicionarAluno(Maria);
        classe.adicionarAluno(Joao);
        classe.adicionarAluno(Pedro);
        
        classe.listarAlunos();
        
        classe.excluirAluno(Pedro);
        
        classe.listarAlunos();
    }
    
}

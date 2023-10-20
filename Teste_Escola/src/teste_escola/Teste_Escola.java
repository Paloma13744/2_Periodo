package teste_escola;

public class Teste_Escola {

    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.setCod("1A");
        turma1.setAno(2023);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Paloma");
        aluno1.setRA(5618);
        aluno1.setDatanas(10112000);
        aluno1.setTurma(turma1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Thiago");
        aluno2.setRA(5615);
        aluno2.setDatanas(28111999);
        aluno2.setTurma(turma1);

        System.out.println("Dados do aluno1:");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getDatanas());
        System.out.println(aluno1.getTurma().getCod());
        
        System.out.println("______________________________________________________");

        System.out.println("Dados do aluno2:");
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getDatanas());
        System.out.println(aluno2.getTurma().getCod());

    }

}

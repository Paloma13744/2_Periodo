package filaencadeada;

import java.util.Scanner;

public class FilaEncadeada {

    public static void main(String[] args) {
        Fila fila = new Fila();
        
        /*O algoritmo deve seguir a regra clássica da fila(first - in”, “first - out
        ),
          porém deve
        -se permitir a entrada de prioridades
        .
• A fila deve conter a “senha
        ” de cada atendimento
        • As senhas de prioridade devem entrar no inicio da fila e devem ser desinfileiradas (chamadas
        ) antes dos demais.
• Lembre - se que podem ter varias senhas de prioridade e dentre estas vale a
        regra first-in”, “first - out
        , ou seja, o primeiro a entrar na prioridade é o primeiro a ser desinfileirado.
        • Somente quando todos os prioritários forem atendidos deve
        -se atender as demais senhas.Na main
        :
• Pergunte se o atendimento é prioritário ou não
        • Enfileire cada senha
        • Desinfileire(depois de enfileirar todas as senhas
        )
• Imprima a ordem de acordo com desenfileiramento Observações:
• Pode - se utilizar mais de uma fila para resolução
        • Caso escolha a implentação estática considere uma fila com 10 senhas
                */
        
        Scanner sc = new Scanner(System.in);
        String senha;
        String fila_comum;
        String prioridade = "sim,não";
        System.out.println("Para finalizar , digite .");
        do{
            System.out.println("Infome sua senha:");
            senha = sc.nextLine();
            System.out.println("Você possui prioridade na fila?");
            prioridade = sc.nextLine();
            if(prioridade.equals("sim")){
                System.out.println("Fila com prioridade");
                fila.enfileirar(senha);
            }
            else if(senha.equals("não")){
                System.out.println("Fila comum");
                fila.enfileirar(senha);        
            }
        
    }while(!senha.equals(".") && prioridade.equals("sim, não"));
        
        fila.imprime();
        
        

}
}

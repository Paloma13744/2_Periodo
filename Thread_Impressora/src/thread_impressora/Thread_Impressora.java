package thread_impressora;

public class Thread_Impressora extends Thread{

    public int codigo;
    public String nome;

    public Thread_Impressora() {
        this.codigo = -1;
        this.nome = "Defacult";
    }

    public Thread_Impressora(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void run() {
        System.out.println("Inicio da thread" + codigo);

        for (int i = 0; i < 20; i++) {
            try {
                int tempo = (int) (Math.random() * 10000);
                System.out.println("Impressora " + codigo + " dormindo por " + tempo + " segundos");
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                System.out.println("Erro!");
            }

        }

    }

    /*
    Defina uma classe em Java, que seja uma thread e que se chama
Impressora. A classe deve conter um atributo chamado código (tipo int e pode
ter valores como 1, 2, 3, etc;) e nome (nome da thread: ex: Thread,
Impressora, etc). A classe deve conter 3 construtores para que o usuário
forneça o valor dos parâmetros. O valores default para os parâmetros são:
código -1 e nome ”Default”.
O código da Thread deve conter um loop que varia de 1 a 20 e imprime a
seguinte mensagem:

Thread 1, dormindo por 5 segundos
Thread 1, dormindo por 3 segundos
Thread 1, dormindo por 8 segundos

Obs: O tempo entre as impressões deve ser aleatório.
Inclua um método main na classe para testar as construções criadas. Exemplo
de método main:
public static void main(String[] a){
System.out.println(“Início da Thread principal!!!”);
Impressora p1 = new Impressora(1, “Impressora A”);
Impressora p2 = new Impressora(1, “Impressora B”);
Impressora p3 = new Impressora(1, “Impressora C”);
Impressora p4 = new Impressora(1, “Impressora D”);
p1.start();
p2.start();
p3.start();
p4.start();
System.out.println(“Fim da Thread principal!!!”);
     */
}

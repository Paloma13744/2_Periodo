package thread_impressora;

public class Thread_Impressora_Main {

    public static void main(String[] args) {

        System.out.println("Início da Thread principal!!!");
        Thread_Impressora p1 = new Thread_Impressora(1, "Impressora A");
        Thread_Impressora p2 = new Thread_Impressora(2, "Impressora B");
        Thread_Impressora p3 = new Thread_Impressora(3, "Impressora C");
        Thread_Impressora p4 = new Thread_Impressora(4, "Impressora D");
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        System.out.println("Fim da Thread principal");

    }

}

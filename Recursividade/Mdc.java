package recursiv_aedi;

public class Mdc {

    public static void main(String[] args) {
        System.out.println("Mdc:" + mdc(12,18));
        /*
        Crie um programa que calcula o máximo divisor comum entre dois números
        usando a recursão.

         */
    }

    public static int mdc(int x, int y) {
        if (y != 0) {
            return mdc(y, x % y);
        } else {
            return x;
        }
    }
}


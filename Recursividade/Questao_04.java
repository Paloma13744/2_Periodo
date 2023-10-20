package recursiv_aedi;

public class Questao_04 {

    public static void main(String[] args) {
        int v[] = {1, 2, 3,4,5};
        Inverter(v,0,4);
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
        
       /*
Dado um array de inteiros e o seu número de elementos, inverta a posição dos
seus elementos.
 Caso base? Tamanho do array menor ou igual a 1
 Passo da recursão:
 Troca 1o. e último elementos e inverte resto do array.
                 */
    }

    public static void Inverter(int[] v, int ant, int tras) {
        int p = 0;
        if (ant >= tras){ 
            return;
        }
            p = v[ant];
            v[ant] = v[tras];
            v[tras] = p;
            Inverter(v, ant + 1, tras - 1);
          
        }
     

    }




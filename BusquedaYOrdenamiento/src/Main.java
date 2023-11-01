
public class Main {
    public static void main(String[] args) {

    /* SHELL */

      int [] arreglo = {15,47,3,9,10,78,2,1,140,25,5,26,34,100,7};
      int inta, i, aux;
      boolean band;
      inta = arreglo.length;
    /* Mostramos el arreglo */
        System.out.println("Arreglo: ");
        for (int elemento:
             arreglo) {
            System.out.print(elemento + " ");
        }
            while(inta > 0){
                inta = inta / 2;
                band = true;
                while(band){
                    band = false;
                    i = 0;
                    while ((i+inta) <=arreglo.length-1){//2.1.1
                        if (arreglo[i] > arreglo[i + inta]){
                            aux = arreglo[i];
                            arreglo[i] = arreglo[i+inta];
                            arreglo[i+inta] = aux;
                            band = true;
                        }
                        i = i +1;
                    }
                }
            }
    /* Mostramos el arreglo ordenado*/
        System.out.println("\nArreglo ordenado: ");
        for (int elemento:
                arreglo) {
            System.out.print(elemento + " ");
        }
        }
    }

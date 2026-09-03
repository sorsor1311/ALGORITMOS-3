import java.util.Scanner;
public class Arrays {

     public static void main(String[] args) {
        try(Scanner teclado = new Scanner(System.in)){
            System.out.println("INGRESE EL TAMAÑO DEL ARREGLO:");
            int tam = teclado.nextInt();
            int []Array = new int[tam];

            System.out.println("INGRESE LOS ELEMENTOS DEL ARREGLO:");
            for(int i = 0;i<tam;i++){
                Array[i]= teclado.nextInt();
            }
            System.out.println("LOS ELEMENTOS DEL ARREGLO SON:");
            for(int i =0; i<tam; i++){
                System.out.println(Array[i] + " ");
            }
        }
     }
    
}
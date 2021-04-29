package actividad3;

import java.util.Scanner;

/**
 *
 * @author ÁNGEL_HIDALGO
 */
public class ACTIVIDAD3 {

    static void encabezados() {
        System.out.println("UNIVERSIDAD AUTÓNOMA DE CAMPECHE");
        System.out.println("FACULTAD DE INGENIERÍA");
        System.out.println("INGENIERÍA EN SISTEMAS COMPUTACIONALES");

    }

    static void separador() {
        System.out.println("[-----------------------------------------------]");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        encabezados();
        separador();

        /*/1.- Imprimir la suma consecutiva del 0 al 102.
        System.out.println("[----------EJERCICIO 1-------------]");
       
        int num = 0;
        int suma = 0;
       
        while (num <= 10) {
 
            System.out.println("EL NÚMERO ES:" + num);
            suma += num;
            num++;

        }
       System.out.println("LA SUMA DE TODOS LOS NÚMRROS ES:" + suma);
        separador();
        System.out.println(" ");*/

 /*2.Calcular el factorial del 1 al 103.
        System.out.println("[----------EJERCICIO 2-------------]");
        
        System.out.println("EL FACTORIAL ES : ");
        int nuM = 1;
        int fact = 1;
        for (int i = 0; i <= 10; i++) {
            fact = fact * nuM;
            nuM++;
            System.out.println(fact);
        }*/
 /* separador();
        System.out.println(" ");

        //3.Calcular el factorial de un número que sea introducido por el usuario
        System.out.println("[----------EJERCICIO 3-------------]");
        int numE;
        int contador = 1;
        int oper = 1;

        System.out.println("Ingrese un numero: ");
        numE = teclado.nextInt();

        for (int i = 1; i < numE; i++) {
            contador = contador + 1;
            oper = oper * contador;

        }
        System.out.println("El factorial es: " + oper);*/
        separador();
        System.out.println(" ");

        //4.- Calcular la media de la suma del 0 hasta el número introducido por el usuario
        System.out.println("[----------EJERCICIO 4-------------]");
        
        System.out.println("INGRESE UN NÚMERO PARA ENCONTRAR SU MEDIA:");
        
        int suMa = 0;
        int nuMe = 0;
        int cont = teclado.nextInt();
        for (int i = cont; i >=0 ; i--) {
            suMa= suMa + nuMe;
            nuMe++;
        }
        float media = suMa/cont;
        System.out.println("LA MEDIA ES:" + media);
        
        
        
        
        
        
        
        
    }
}

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
 /*separador();
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
        System.out.println("LA MEDIA ES:" + media);*/
 /*separador();
        System.out.println(" ");
        
        //5.- Pedir un número y leer n veces números, realizar la suma de los numeros,
        //sacar el promedio y determinar cual número introducido es el mayor y cual el menor, y la distancia númerica entre ellos.
        
        System.out.println("[----------EJERCICIO 5-------------]");
        
        int num [] = new int [3];
        System.out.println("INGRESE LOS NÚMEROS A SUMAR Y A PROMEDIAR:");
        int sum = 0; 
        for (int i = 0; i < 3; i++) {
            num[i] = teclado.nextInt();
            sum = sum+ num[i];
            System.out.println("suma="+sum);
        }
        int mayor = num[0];
        int menor = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>mayor) {
                mayor = num[i];
            }
            if (num[i]<menor) {
                menor = num[i];
            }

        }
        int distacia = mayor-menor;
        float promedio = sum/3;
        System.out.println("EL PROMEDIO ES: "+ promedio );
        System.out.println("EL NÚMERO MAYOR ES: " + mayor +" Y EL NÚMERO MENOR ES: "+ menor );
        System.out.println("LA DISTANCIA ENTRE LOS NÚMEROS ES: "+ distacia );*/
 /*separador();
        System.out.println(" ");
        
        //6.- Imprima un arreglo que tenga los nombres de los días de la semana.
        System.out.println("[----------EJERCICIO 6-------------]");       
 
 
        System.out.println("DÍAS DE LA SEMANA");
        String[] diasSem;
        diasSem = new String[7];
        diasSem [0] = "LUNES";
        diasSem [1] = "MARTES";
        diasSem [2] = "MIÉRCOLES";
        diasSem [3] = "JUEVES";
        diasSem [4] = "VIERNES";
        diasSem [5] = "SÁBADO";
        diasSem [6] = "DOMINGO";
        for (String diasSem1 : diasSem) {
            System.out.println(diasSem1);

        } */
 /* separador();
        System.out.println(" ");

        //7.- Imprima utilizando los ciclos for el arreglo de dos dimensiones de los personajes de Star War.
        System.out.println("[----------EJERCICIO 7-------------]");
        System.out.println("LOS PERSONAJES SON:");
        
        String starW[][] = new String[16][3];
        starW = new String[16][3];
        starW[0][0] = "Luke Skywalker";
        starW[0][1] = "172";
        starW[0][2] = "male";
        starW[1][0] = "R2-D2";
        starW[1][1] = "96";
        starW[1][2] = "n/a";
        starW[2][0] = "C-3PO";
        starW[2][1] = "167";
        starW[2][2] = "n/a";
        starW[3][0] = "Darth Vader";
        starW[3][1] = "202";
        starW[3][2] = "male";
        starW[4][0] = "Leia Organa";
        starW[4][1] = "150";
        starW[4][2] = "female";
        starW[5][0] = "Owen Lars";
        starW[5][1] = "178";
        starW[5][2] = "male";
        starW[6][0] = "Beru Whitesun lars";
        starW[6][1] = "165";
        starW[6][2] = "female";
        starW[7][0] = "R5-D4";
        starW[7][1] = "97";
        starW[7][2] = "n/a";
        starW[8][0] = "Biggs Darklighter";
        starW[8][1] = "183";
        starW[8][2] = "male";
        starW[9][0] = "Obi-Wan Kenobi";
        starW[9][1] = "182";
        starW[9][2] = "male";
        starW[10][0] = "Yoda";
        starW[10][1] = "66";
        starW[10][2] = "male";
        starW[11][0] = "Jek Tono Porkins";
        starW[11][1] = "180";
        starW[11][2] = "male";
        starW[12][0] = "Jabba Desilijic Tiure";
        starW[12][1] = "175";
        starW[12][2] = "hermaphrodite";
        starW[13][0] = "Han Solo";
        starW[13][1] = "180";
        starW[13][2] = "male";
        starW[14][0] = "Chewbacca";
        starW[14][1] = "228";
        starW[14][2] = "male";
        starW[15][0] = "Anakin Skywalker";
        starW[15][1] = "188";
        starW[15][2] = "male";
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+i+"]["+j+"]="+starW[i][j]+"   ");
            }
            System.out.println("");
            System.out.println("");
        }*/
        separador();
        System.out.println(" ");

        //8.- Imprima un arreglo de 2 dimensiones de 3 X 3 que dibuje el modelo del juego gato.
        System.out.println("[----------EJERCICIO 8-------------]");

        System.out.println("JUEGO DEL GATO");
        char cat[][] = new char[3][3];
        cat[0][0] = 'O';
        cat[0][1] = 'X';
        cat[0][2] = 'X';
        cat[1][0] = 'O';
        cat[1][1] = 'X';
        cat[1][2] = 'O';
        cat[2][0] = 'O';
//        cat[2][1] = 'O';
        cat[2][2] = 'x';
        for (int i = 0; i < cat.length; i++) {
            System.out.println("|" + cat[i][0] + "|" + cat[i][1] + "|" + cat[i][2] + "|");
        }
    }

}

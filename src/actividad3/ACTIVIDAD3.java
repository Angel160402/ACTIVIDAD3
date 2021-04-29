package actividad3;

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
        encabezados();
        separador();

        //1.- Imprimir la suma consecutiva del 0 al 102.
        System.out.println("[----------EJERCICIO 1-------------]");

        int num = 0;
        int suma = 0;

        while (num <= 102) {
            System.out.println("EL NÚMERO ES:" + num);
            suma += num;
            num++;
        }
        System.out.println("LA SUMA DE TODOS LOS NÚMRROS ES:" + suma);

    }

}

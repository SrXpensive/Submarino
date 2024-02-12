/**
 * Ejercicio Submarino
 * @author Eduardo Caro
 * @version 1.0
 *
 */
public class Main {
    /**
     * Menú desde el que se llama a las funciones
     * @param args Opciones pedidas al usuario por pantalla
     */
    public static void main(String[] args) {
        int opcion;
        System.out.println("LA CAZA DEL SUBMARINO\n");
        System.out.println();
        do{
            System.out.println("Menú principal");
            System.out.println("--------------");
            System.out.println("1. Jugar");
            System.out.println("2. Ayuda");
            System.out.println("0. Salir");
            System.out.println("--------------");
            opcion = Leer.leerEntero("Introduce una opción: ");
            System.out.println("--------------");
            switch(opcion){
                case 1:
                    Funciones.jugar();
                    break;
                case 2:
                    Funciones.ayuda();
                    break;
            }
        }while(opcion !=0);
    }
}
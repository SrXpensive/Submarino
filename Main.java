
public class Main {
    public static void main(String[] args) {
        String [][] tablero;
        int dimension;
        int opcion = 0;

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
            switch(opcion){
                case 1:
                    dimension = Leer.leerEntero("¿Cuánto quieres que mida el lado del mar?: ");
                    tablero = new String [dimension][dimension];
                    System.out.println("Tu tablero será este:");
                    Funciones.imprimirTablero(tablero);
                    System.out.println("--------------");
            }
        }while(opcion !=0);
    }
}
public class Main {
    public static void main(String[] args) {
        String [][] tablero;
        int dimension;
        int opcion;
        int intentos;
        int coordX;
        int coordY;

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
                    dimension = Leer.leerEntero("¿Cuánto quieres que mida el lado del mar?: ");
                    System.out.println("--------------");
                    tablero = new String [dimension][dimension];
                    System.out.println("Tu tablero será este:");
                    Funciones.imprimirTableroVacio(tablero);
                    System.out.println("--------------");
                    intentos = Leer.leerEntero("¿Cuantos intentos quieres?: ");
                    System.out.println("--------------");
                    for(int i=1;i<=intentos;i++){

                        System.out.println("Intento "+i+" de "+intentos);
                        System.out.println("--------------");
                        coordX = Leer.leerEntero("Introduce la coordenada X (fila): ");
                        System.out.println("--------------");
                        coordY = Leer.leerEntero("Introduce la coordenada Y (columna): ");
                        System.out.println("--------------");
                        if(Funciones.leerSonar(tablero,dimension,coordX,coordY)){
                            System.out.println("GANASTE LA PARTIDA");
                            System.out.println("--------------");
                            break;
                        }
                    }
            }
        }while(opcion !=0);
    }
}
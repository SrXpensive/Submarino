import java.util.Arrays;

/**
 * Funciones del proyecto Submarino
 * @author Eduardo Caro
 * @version 1.0
 */
public class Funciones {
    /**
     * Imprime el tablero de dimensión seleccionada
     * por el usuario.
     * @param array Array generado con las dimensiones solicitadas por teclado desde el menú.
     */
    public static void imprimirTableroVacio(String [][] array) {
        System.out.print(" ");
        for(int i=0;i< array.length;i++){
            System.out.print("  "+i);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d",i);
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("[ ]");
            }
            System.out.println();
        }
    }

    /**
     * Genera aleatoriamente una posición para el submarino.
     * @param size El tamaño del lado del tablero.
     * @return La posición del submarino en forma de array.
     */
    public static int[] iniciarSubmarino(int size){
        int x = (int)(Math.random()*size);
        int y = (int)(Math.random()*size);
        int []submarino = new int []{x,y};
        return submarino;
    }

    /**
     * Recoge la posición indicada por el usuario.
     * @return El punto escogido por el usuario en forma de array.
     */
    public static int[] posicionCalibrar(){
        int x = Leer.leerEntero("Introduce la coordenada X (fila): ");
        System.out.println("--------------");
        int y = Leer.leerEntero("Introduce la coordenada Y (columna): ");
        System.out.println("--------------");
        int [] pos = new int []{x, y};
        return pos;
    }

    /**
     * Interpreta el resultado relativo entre la posición del submarino y
     * la posición dada por el usuario.
     * @param array El tablero de juego para poder imprimirlo con la función
     *              imprimirTablero.
     * @param size El tamaño del lado del tablero, para llamar a iniciarSubmarino.
     * @param pos Posición indicada por el usuario en forma de Array.
     * @return Booleano que identifica si termina el usuario gana la partida o
     *         debe seguir intentándolo.
     */
    public static boolean leerSonar(String [][]array,int size, int[]pos){
        int[] sub = iniciarSubmarino(size);

        if(Arrays.equals(sub,pos)){
            imprimirTablero(array,sub,pos);
            System.out.println("¡HAS DADO EN EL CLAVO!");
            System.out.println("--------------");
            return true;
        }else if(((pos[0]== sub[0]-1)&&(pos[1]==sub[1]-1))
                ||((pos[0]== sub[0]-1)&&(pos[1]==sub[1]))
                ||((pos[0]== sub[0]-1)&&(pos[1]==sub[1]+1))
                ||((pos[0]== sub[0])&&(pos[1]==sub[1]-1))
                ||((pos[0]==sub[0])&&(pos[1]==sub[1]+1))
                ||((pos[0]==sub[0]+1)&&(pos[1]==sub[1]-1))
                ||((pos[0]==sub[0]+1)&&(pos[1]==sub[1]))
                ||((pos[0]==sub[0]+1)&&(pos[1]==sub[1]+1))){
            imprimirTablero(array,sub,pos);
            System.out.println("CASI");
            System.out.println("--------------");
        }else{
            System.out.println("AGUA");
            System.out.println("Coordenadas del submarino: ("+sub[0]+", ?)");
            System.out.println("--------------");
        }
        System.out.println("El submarino estaba en "+Arrays.toString(sub));
        System.out.println("Tu posición fue "+Arrays.toString(pos));
        return false;
    }

    /**
     * Imprime el tablero con el resultado gráfico del turno.
     * @param array El tablero de juego para poder acceder a él.
     * @param sub Array que contiene la posición del submarino, generada por
     *            iniciarSubmarino.
     * @param pos Array que contiene la posición escogida por el usuario, generada por
     *            posicionCalibrar.
     */
    public static void imprimirTablero(String [][] array, int []sub, int []pos){
        System.out.print(" ");
        for(int i=0;i< array.length;i++){
            System.out.print("  "+i);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d",i);
            for (int j = 0; j < array[0].length; j++) {
                if(pos[0]==sub[0] && pos[1]==sub[1]){
                    if(sub[0]==i && sub[1]==j) {
                        System.out.print("[X]");
                    }else{
                        System.out.print("[-]");
                    }
                }else if(((i== sub[0]-1)&&(j==sub[1]-1))
                        ||((i== sub[0]-1)&&(j==sub[1]))
                        ||((i== sub[0]-1)&&(j==sub[1]+1))
                        ||((i==sub[0])&&(j== sub[1]-1))
                        ||((i==sub[0])&&(j==sub[1]+1))
                        ||((i==sub[0]+1)&&(j==sub[1]-1))
                        ||((i==sub[0]+1)&&(j==sub[1]))
                        ||((i==sub[0]+1)&&(j==sub[1]+1))){
                            System.out.print("[*]");
                        }
                else{
                    System.out.print("[-]");
                }
            }
            System.out.println();
        }
    }

    /**
     * Imprime por pantalla el funcionamiento del juego, instrucciones y algunas
     * indicaciones.
     */
    public static void ayuda(){
        System.out.println("EXPLICACIÓN");
        System.out.println("--------------");
        System.out.println("- El juego consiste en encontrar la posición del submarino en un mar 'cuadrado',");
        System.out.println("  es decir, que sus lados miden lo mismo.");
        System.out.println("- La posición de éste se determinará de forma aleatoria en cada turno");
        System.out.println("  y viene dada por las coordenadas X e Y.");
        System.out.println("--------------");
        System.out.println("¿CÓMO JUGAR?");
        System.out.println("--------------");
        System.out.println("- Tras seleccionar la opción 'jugar', se pedirá al jugador que introduzca");
        System.out.println("  el tamaño del mar cuadrado, que viene indicado por el tamaño de casillas");
        System.out.println("  que tiene un lado.");
        System.out.println("- Seguidamente se le preguntará al jugador de cuántos intentos quiere disponer");
        System.out.println("  siendo éstas las rondas del juego.");
        System.out.println("  NOTA: En cada ronda el submarino puede permanecer en su lugar o moverse a otra");
        System.out.println("  casilla aleatoria.");
        System.out.println("- Finalmente dará comienzo la primera de las rondas, pidiendo al jugador que ");
        System.out.println("  introduzca la posición en la que cree que está el submarino, en primer lugar ");
        System.out.println("  el número de la fila y luego el número de la columna.");
        System.out.println("- Si el jugador acierta, se mostrará una 'X' en la posición del submarino y un");
        System.out.println("  mensaje de enhorabuena.");
        System.out.println("- Si el jugador selecciona una casilla adyacente al submarino, se mostrarán todas las");
        System.out.println("  casillas adyacentes marcadas con '*'.");
        System.out.println("- Si el jugador selecciona otra casilla que no es adyacente, ni la posición exacta del");
        System.out.println("  submarino, se mostrará el mensaje 'AGUA', así como la fila en la que se encontraba");
        System.out.println("  el submarino (recuerda que en el siguiente turno puede cambiar de posición).");
        System.out.println("- El juego terminará cuando se acierte la posición del submarino, o cuando se agoten");
        System.out.println("  los turnos.");
        System.out.println("--------------");
        System.out.println("¡A JUGAR!");
        System.out.println("--------------");
        System.out.println("- ¡Espero que lo pases muy bien jugando!");
        System.out.println("--------------");
    }

    /**
     * Método para iniciar la partida
     * Realiza las llamadas necesarias al resto de métodos
     */
    public static void jugar(){
        int size = Leer.leerEntero("¿Cuánto quieres que mida el lado del mar?: ");
        System.out.println("--------------");
        String[][] sea = new String[size][size];
        System.out.println("Tu tablero será este:");
        Funciones.imprimirTableroVacio(sea);
        System.out.println("--------------");
        int tries = Leer.leerEntero("¿Cuantos intentos quieres?: ");
        System.out.println("--------------");
        for(int i = 1; i<= tries; i++){
            System.out.println("Intento "+i+" de "+ tries);
            System.out.println("--------------");
            if(Funciones.leerSonar(sea, size,Funciones.posicionCalibrar())){
                System.out.println("GANASTE LA PARTIDA");
                System.out.println("--------------");
                break;
            }
        }
    }
}



import java.sql.SQLOutput;
import java.util.Arrays;

public class Funciones {
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
    public static int[] iniciarSubmarino(int size){
        int x = (int)(Math.random()*size);
        int y = (int)(Math.random()*size);
        int []submarino = new int []{x,y};
        return submarino;
    }
    public static int[] posicionCalibrar(int x, int y){
        int [] pos = new int []{x, y};
        return pos;
    }
    public static boolean leerSonar(String [][]array,int size, int x, int y){
        int[] sub = iniciarSubmarino(size);
        int[] pos = posicionCalibrar(x, y);
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
}



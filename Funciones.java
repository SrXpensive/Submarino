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
    public static boolean leerSonar(int size, int x, int y){
        int[] sub = iniciarSubmarino(size);
        int[] pos = posicionCalibrar(x, y);
        if(Arrays.equals(sub,pos)){
            System.out.println("¡HAS DADO EN EL CLAVO!");
            System.out.println("--------------");
            return true;
        }else if((pos[0]== sub[0]-1)||(pos[0]== sub[0]+1)||(pos[1]== sub[1]-1)||(pos[1]== sub[1]+1)){
            System.out.println("CASI");
            System.out.println("--------------");
        }else{
            System.out.println("AGUA");
            System.out.println("--------------");
        }
        System.out.println("El submarino estaba en "+Arrays.toString(sub));
        System.out.println("Tu posición fue "+Arrays.toString(pos));
        return false;
    }
}



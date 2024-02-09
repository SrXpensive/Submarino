public class Funciones {
    public static void imprimirTablero(String [][] array) {
        System.out.print(" ");
        for(int i=0;i< array.length;i++){
            System.out.print("  "+i);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(String.format("%2d",i));
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("[ ]");
            }
            System.out.println();
        }
    }
}




package misrc;

public class Main1 {
    
    public static void main(String[] args) {
        int matriz[][] = new int [5][4];
        
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                int numero = (int)(Math.random()*10);
                System.out.print(numero + " ");
               }
            System.out.println();
        }
    }
    
}

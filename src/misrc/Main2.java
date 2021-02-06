
package misrc;

public class Main2 {
    
    public static void main(String[] args) {
        
        char matriz[][] = new char [5][4];
        
        
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                int codigoAscii = (int)Math.floor(Math.random()*(122 - 97)+97); 
                char letra = (char)(codigoAscii);
                System.out.print(letra + " ");
               }
            System.out.println(); 
        }
    }
    
}
    
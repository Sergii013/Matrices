
package misrc;

public class Main3 {
    
    public static void main(String[] args) {
        int filas = 5;
        int columnas = 4;
        char matriz[][] = new char [filas][columnas];
        
        int 
                contadorA = 0, contadorB = 0, contadorC = 0, contadorD = 0, contadorE = 0, contadorF = 0, contadorG = 0, contadorH = 0, contadorI = 0, contadorJ = 0, 
                contadorK = 0, contadorL = 0, contadorM = 0, contadorN = 0, contadorÑ = 0, contadorO = 0, contadorP = 0, contadorQ = 0, contadorR = 0, 
                contadorS = 0, contadorT = 0, contadorU = 0, contadorV = 0, contadorW = 0, contadorX = 0, contadorY = 0, contadorZ = 0;
        
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                int codigoAscii = (int)Math.floor(Math.random()*(122 - 97)+97); 
                char letra = (char)(codigoAscii);
                matriz[x][y] = letra;
                System.out.print(letra + " ");
               }
            System.out.println(); 
        }
        
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                switch (matriz[x][y]) 
        {
            case 'a':
                    contadorA++;
                    break;
            case 'b':
                    contadorB++;
                     break;
            case 'c':
                    contadorC++;
                    break;
            case 'd':
                    contadorD++;
                     break;
            case 'e':
                    contadorE++;
                     break;
            case 'f':
                    contadorF++;
                     break;
            case 'g':
                    contadorG++;
                     break;
            case 'h':
                    contadorH++;
                     break;
            case 'i':
                    contadorI++;
                     break;
            case 'j':
                    contadorJ++;
                     break;
            case 'k':
                    contadorK++;
                     break;
            case 'l':
                    contadorL++;
                     break;
            case 'm':
                    contadorM++;
                     break;
            case 'n':
                    contadorN++;
                     break;
            case 'ñ':
                    contadorÑ++;
                     break;
            case 'o':
                    contadorO++;
                     break;
            case 'p':
                    contadorP++;
                     break;
            case 'q':
                    contadorQ++;
                     break;
            case 'r':
                    contadorR++;
                     break;
            case 's':
                    contadorS++;
                     break;
            case 't':
                    contadorT++;
                     break;
            case 'u':
                    contadorU++;
                     break;
            case 'v':
                    contadorV++;
                     break;
            case 'w':
                    contadorW++;
                     break;
            case 'x':
                    contadorX++;
                     break;
            case 'y':
                    contadorY++;
                     break;
            case 'z':
                    contadorZ++;
                     break;
        }
        } 
    }
            System.out.println("Letra a: "+contadorA);
            System.out.println("Letra b: "+contadorB);
            System.out.println("Letra c: "+contadorC);
            System.out.println("Letra d: "+contadorD);
            System.out.println("Letra e: "+contadorE);
            System.out.println("Letra f: "+contadorF);
            System.out.println("Letra g: "+contadorG);
            System.out.println("Letra h: "+contadorH);
            System.out.println("Letra i: "+contadorI);
            System.out.println("Letra j: "+contadorJ);
            System.out.println("Letra k: "+contadorK);
            System.out.println("Letra l: "+contadorL);
            System.out.println("Letra m: "+contadorM);
            System.out.println("Letra n: "+contadorN);
            System.out.println("Letra ñ: "+contadorÑ);
            System.out.println("Letra o: "+contadorO);
            System.out.println("Letra p: "+contadorP);
            System.out.println("Letra q: "+contadorQ);
            System.out.println("Letra r: "+contadorR);
            System.out.println("Letra s: "+contadorS);
            System.out.println("Letra t: "+contadorT);
            System.out.println("Letra u: "+contadorU);
            System.out.println("Letra v: "+contadorV);
            System.out.println("Letra w: "+contadorW);
            System.out.println("Letra x: "+contadorX);
            System.out.println("Letra y: "+contadorY);
            System.out.println("Letra z: "+contadorZ);
           
        
 }       
    
}
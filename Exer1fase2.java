package exer1fase2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exer1fase2 {
    public static void main(String[] args) {
        // Declaració de les sis variables String buides
        String primeraCiutat, segonaCiutat, terceraCiutat, quartaCiutat,
            cinquenaCiutat, sisenaCiutat;
        
        // Inicialització de Scanner
        Scanner lector = new Scanner(System.in);
        
        // Demanen per consola el nom de les sis ciutats
        System.out.print("Escriu el nom de la primera ciutat: ");
        primeraCiutat = lector.next();
        lector.nextLine();
        
        System.out.print("Escriu el nom de la segona ciutat: ");
        segonaCiutat = lector.next();
        lector.nextLine();
        
        System.out.print("Escriu el nom de la tercera ciutat: ");
        terceraCiutat = lector.next();
        lector.nextLine();
        
        System.out.print("Escriu el nom de la quarta ciutat: ");
        quartaCiutat = lector.next();
        lector.nextLine();
        
        System.out.print("Escriu el nom de la cinquena ciutat: ");
        cinquenaCiutat = lector.next();
        lector.nextLine();
        
        System.out.print("Escriu el nom de la sisena ciutat: ");
        sisenaCiutat = lector.next();
        lector.nextLine();
        System.out.println();
        
        // Declaració de l´array que conte els noms de les ciutats
        ArrayList<String> arrayCiutats = new ArrayList<String>();
        
        // Afegeix el nom de les ciutats a l´array
        arrayCiutats.add(primeraCiutat);
        arrayCiutats.add(segonaCiutat);
        arrayCiutats.add(terceraCiutat);
        arrayCiutats.add(quartaCiutat);
        arrayCiutats.add(cinquenaCiutat);
        arrayCiutats.add(sisenaCiutat);
        
        /* Bucle for each per recorre i mostrar per consola les ciutats, 
           ordenades per el mètode sort de la classe Collections */
        System.out.println("Es mostren les ciutats per ordre alfabètic!");
        Collections.sort(arrayCiutats);
        for (String i : arrayCiutats){
            System.out.println(i);
        }
    }
}

    
    



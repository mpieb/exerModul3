package exer1fase3;
import java.util.*;
public class Exer1fase3 {
    public static void main(String[] args) {
        // Declaració de les sis variables String 
        String primeraCiutat = "BARCELONA";
        String segonaCiutat = "BERLIN";
        String terceraCiutat = "LISBOA";
        String quartaCiutat = "MADRID";
        String cinquenaCiutat = "NAPOLES";
        String sisenaCiutat = "ROMA";
        
        // Declaració de l´array que conte els noms de les ciutats
        ArrayList<String> arrayCiutatsModificades = new ArrayList<String>();
        
        // Afegeix el nom de les ciutats a l´array i es modifica amb set
        arrayCiutatsModificades.add(primeraCiutat);
        arrayCiutatsModificades.set(0, "B4RCELON4");
        arrayCiutatsModificades.add(segonaCiutat);
        arrayCiutatsModificades.add(terceraCiutat);
        arrayCiutatsModificades.set(2, "LISBO4");
        arrayCiutatsModificades.add(quartaCiutat);
        arrayCiutatsModificades.set(3, "M4DRID");
        arrayCiutatsModificades.add(cinquenaCiutat);
        arrayCiutatsModificades.set(4, "N4POLES");
        arrayCiutatsModificades.add(sisenaCiutat);
        arrayCiutatsModificades.set(5, "ROM4");
        
        /* Bucle for each per recorre i mostrar per consola les ciutats, 
           ordenades per el mètode sort de la classe Collections */ 
        System.out.println("Es mostren les ciutats per ordre " +
                "alfabètic i modificades!");
        Collections.sort(arrayCiutatsModificades);
        for (String i : arrayCiutatsModificades){
            System.out.println(i);
        }
    }
}


    
    



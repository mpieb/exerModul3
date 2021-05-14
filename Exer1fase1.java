package exer1fase1;
import java.util.*;
public class Exer1fase1 {
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
        
        // Es mostra per consola els noms de les sis ciutats
        System.out.println("Es mostra el nom de les sis ciutats!");
        System.out.print(primeraCiutat + ", ");
        System.out.print(segonaCiutat + ", ");
        System.out.print(terceraCiutat + ", ");
        System.out.print(quartaCiutat + ", ");
        System.out.print(cinquenaCiutat + ", ");
        System.out.print(sisenaCiutat + ".");
        System.out.println();
    }
}


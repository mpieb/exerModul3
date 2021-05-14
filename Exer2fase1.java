package exer2fase1;
import java.util.Scanner;
public class Exer2fase1 {
    public static final int NUM_ALUMNES = 1;
    public static final int NUM_NOTES = 3;
    public static void main(String[] args) {
        // Declaració de variables globals
        float suma = 0f;
        float mitja = 0f;
        
        //Declaració de l´array que conté alumnes i notes
        float[][] arrayNotes = new float[NUM_ALUMNES][NUM_NOTES];
        
        // Inicialització del mètode Scanner
        Scanner lector = new Scanner(System.in);
        
        System.out.println("NOTES ALUMNE!");
        // Bucle anidats for per omplir l´array
        for (int i = 0; i < arrayNotes.length; i++) {
            float aux = 0f;
            for (int j = 0; j <arrayNotes[i].length; j++) {
                System.out.print("Escriu la nota: ");
                aux = lector.nextFloat();
                arrayNotes[i][j] = aux + i + j;
                }
            lector.nextLine();
        }
        
        // Bucle anidats for per sumar les notes de l´array
        for (int i = 0; i < arrayNotes.length; i++) {
            for (int j = 0; j < arrayNotes[i].length; j++) {
                suma = suma + arrayNotes[i][j];
            }
        }
        // Càlcul de la mitja de les tres notes
        mitja = suma / (float)NUM_NOTES;
        
        // Sortida per consola alumne aprovat o alumne suspès
        if (mitja >= 5.0) {
            System.out.println("L´alumne ha aprovat!");
            } else {
            System.out.println("L´alumne ha suspès!");
        }
    }
}   
        
        
        
        


    
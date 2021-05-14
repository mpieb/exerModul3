package exer3fase1;
import java.util.Scanner;
public class Exer3fase1 {
    public static void main(String[] args) {
        // Declaració de variables per generar la sèrie
        int actual = 0;
        int seguent = 1;
        
        // Inicialització Scanner
        Scanner lector = new Scanner(System.in);
        
        // Demanem un nombre per el teclat
        int nombre = 0;
        System.out.print("Escriu un nombre: ");
        nombre = lector.nextInt();
        lector.nextLine();
        
        // Inicialtzació de l´array per guardar els nobres de la sèrie
        int[] arrayFibonacci = new int[nombre];
        
        // Inicialització del bucle while per generar la sèrie
        int i = 1;
        // Bucle
        while (i < arrayFibonacci.length) {
            int seguentDos = actual + seguent;
            actual = seguent;
            seguent = seguentDos;
            arrayFibonacci[i] = seguentDos;
            i = i + 1;
        }
        
        // Bucle fer per recorrer la seqüència i mostrar per consola
        for (int j = 0; j < arrayFibonacci.length; j++) {
            System.out.print(arrayFibonacci[j] + " ");
        }
        System.out.println();
    }
}

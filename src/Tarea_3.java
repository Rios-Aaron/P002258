package POO_2258;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca cadena de 9 caracteres: ");
        String entrada = teclado.nextLine();
        System.out.println("La cadena fue: " + entrada);
        if (entrada.length() != 9) {
            System.out.println("La cadena debe tener 9 caracteres.");
            return;
        }
        String[] jugadas = entrada.split("");
        System.out.println("| " + jugadas[0] + " | " + jugadas[1] + " | " + jugadas[2] + " |");
        System.out.println("----+---+----");
        System.out.println("| " + jugadas[3] + " | " + jugadas[4] + " | " + jugadas[5] + " |");
        System.out.println("----+---+----");
        System.out.println("| " + jugadas[6] + " | " + jugadas[7] + " | " + jugadas[8] + " |");
    }
}
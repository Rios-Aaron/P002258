import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System. in);
        System.out.println("Programa de validacion");
        String caracteres = teclado.nextLine();
        char uno = caracteres.charAt(0);
        int decimal1 = (int) uno;
        char dos = caracteres.charAt(1);
        int decimal2 = (int) dos;
        char tres = caracteres.charAt(2);
        int decimal3 = (int) tres;
        if (decimal1+1==decimal2 & decimal2+1==decimal3){
            System.out.println("Cadena" +caracteres +"Es consecutiva");
        }
        else {
            System.out.println("Cadena" +caracteres+ "No es consecutiva");
        }
    }
}
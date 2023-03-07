import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre, Profesión, País:");
        String entrada = teclado.nextLine();
        String[] salida = entrada.split(" ");
        System.out.println("Nombre:" + salida[0].toUpperCase());
        System.out.println("Profesión:" + salida[1].toUpperCase());
        System.out.println("País:" + salida[2].toUpperCase());
    }
}
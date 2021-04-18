import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un caracter en la consola");
        Character caracter;
        caracter = sc.next().charAt(0);
        System.out.println((int)+caracter);
    }

}

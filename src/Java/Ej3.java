import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un precio en la consola(Puede ser decimal)");
        double num = sc.nextDouble();
        final double iva = 21;
        double valorAñadido = (num/100*iva);
        double precioFinal = num+valorAñadido;
        System.out.println("El precio final será de : " + precioFinal);
        //No entiendo porque cuando inserto un double salta error
    }

}
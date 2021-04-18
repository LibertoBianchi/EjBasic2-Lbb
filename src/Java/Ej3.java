import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un precio en la consola(Puede ser decimal)");
        float num = sc.nextFloat();
        final float iva = 21;
        float valorAñadido = (num/100*iva);
        float precioFinal = num+valorAñadido;
        System.out.println("El precio final será de : " + precioFinal);
        //No entiendo porque cuando inserto un float salta error
    }

}
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un numero de productos vendidos");
        int numProd = sc.nextInt();
        float valorProductos = 0;
        for (int i = 1; i < numProd+1; i++) {
            float valorProducto=0;
            System.out.println("Inserta el valor del producto "+i);
            valorProducto=sc.nextFloat();
            valorProductos += valorProducto;
        }
        System.out.println("El valor total es = " +valorProductos);
    }
//No entiendo porque cuando inserto un float salta error
}
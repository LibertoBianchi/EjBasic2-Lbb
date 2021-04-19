import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un numero en la consola");
        int num = sc.nextInt();
        String longitud = num + "";
        if (num>=0){
            if(longitud.length()==1){
        System.out.println("El numero tiene "+longitud.length()+" cifra");}
            else if(longitud.length()>1){
            System.out.println("El numero tiene "+longitud.length()+" cifras");}}

        else {
            System.out.println("Introduce un numero positivo");
        }
    }

}
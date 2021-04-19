import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Inserta un numero en la consola");
            num = sc.nextInt();
        }while(num<0);
        System.out.println(num);
    }

}

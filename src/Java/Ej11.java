import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta el primer numero en la consola");
        int num1 = sc.nextInt();
        System.out.println("Inserta el segundo numero en la consola");
        int num2 = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (num1 > num2) {
                double numeroRandom = ((Math.random() * (num1 - num2)) + num2);
                System.out.println(numeroRandom);
            }
            else if (num1 <= num2) {
                double numeroRandom =((Math.random() * (num2 - num1)) + num1);
                System.out.println(numeroRandom);
            }
        }

    }
}

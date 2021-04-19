import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        String constraseña = "pepe";
        Scanner sc = new Scanner(System.in);
        String intentoContraseña;
        int vidas = 3;
        for (int i = vidas; i > 0; i--) {
            System.out.println("Inserta la contraseña");
            intentoContraseña = sc.nextLine();
            if (intentoContraseña.equals(constraseña)) {
                System.out.println("Enhorabuena, la has acertado");
                break;
            } else {
                System.out.println("Intentalo de nuevo");
            }
        }

    }

}
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta el numero de un dia de la semana y se te mostrará si es laborable o no");
        System.out.println("[1] Lunes");
        System.out.println("[2] Martes");
        System.out.println("[3] Miercoles");
        System.out.println("[4] Jueves");
        System.out.println("[5] Viernes");
        System.out.println("[6] Sabado");
        System.out.println("[7] Domingo");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Laborable");
                break;
            case 2:
                System.out.println("Laborable");
                break;
            case 3:
                System.out.println("Laborable");
                break;
            case 4:
                System.out.println("Laborable");
                break;
            case 5:
                System.out.println("Laborable");
                break;
            case 6:
                System.out.println("No laborable");
                break;
            case 7:
                System.out.println("No laborable");
                break;
            default:
                System.out.println("No has seleccionado una opción valida");
                break;
        }
    }

}

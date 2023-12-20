import java.util.Scanner;

public class main {

    public static void linea(int l) {
        for (int i = 0; i < l; i++) {
            System.out.print("*");
        }
    }

    public static void cuadrado(int l, int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangulo(int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        do {

            int option = sc.nextInt();
            switch (option) {

                case 1:
                    System.out.print("Largo: ");
                    int largoL = sc.nextInt();
                    linea(largoL);
                    break;

                case 2:
                    System.out.print("Largo: ");
                    int largoC = sc.nextInt();
                    System.out.print("Alto: ");
                    int altoC = sc.nextInt();
                    cuadrado(largoC,altoC);
                    break;

                case 3:
                    System.out.println("Alto: ");
                    int altoT = sc.nextInt();
                    triangulo(altoT);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;

            }

        } while (!exit);

    }
}

import java.util.Scanner;

public class Main {

    /**
     * Desarrolla un programa que de acuerdo a la calificación númerica ingresada,
     * indique en qué categoría se encuentra la nota.
     * El número que se debe ingresar debe ser en el rango de 1 a 10,
     * Tenga en cuanta los siguientes datos de acuerdo al número ingresado:
     * - Si es 1 o 2 imprime "Su calificación es: F"
     * - Si es 3 o 4 imprime "Su calificación es: D"
     * - Si es 5 o 6 imprime "Su calificación es: C"
     * - Si es 7 o 8 imprime "Su calificación es: B"
     * - Si es 9 o 10 imprime "Su calificación es: A"
     * - Si es diferente al rango imprime "Número no válido, por favor verifique"
     * <p>
     * Para esto debe usar switch.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la nota en un rango de 1 a 10");
        int nota = scanner.nextInt();
        if (nota > 10 || nota < 1) {
            System.out.println("la nota no esta en el rango requerido");
        }

        switch (nota) {
            case 1:
            case 2:
                System.out.println("Su calificacion es F");
                break;
            case 3:
            case 4:
                System.out.println("Su calificacion es D");
                break;
            case 5:
            case 6:
                System.out.println("Su calificacion es C");
                break;
            case 7:
            case 8:
                System.out.println("Su calificacion es B");
                break;
            case 9:
            case 10:
                System.out.println("Su calificacion es A");
                break;

        }


    }

}
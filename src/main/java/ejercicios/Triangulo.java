package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Triangulo {

    public static String evaluar(double a, double b, double c) {
        // TODO: Coloca aquí el código del ejercicio 7: Triángulos
        if (a <= 0 || b <= 0 || c <= 0) {
            return "No es un triángulo válido";
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "No es un triángulo válido";
        }
        if (a == b && b == c) {
            return "El triángulo es equilátero";
        }
        if ((a == b && c != a) || (b == c && a != b) || (a == c && b != a)) {
            return "El triángulo es isósceles";
        }
        if (a != b && a != c && c != b) {
            return "El triángulo es escaleno";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("a:");
        double a = lector.nextDouble();
        System.out.print("b:");
        double b = lector.nextDouble();
        System.out.print("c:");
        double c = lector.nextDouble();

        String respuesta = evaluar(a, b, c);
        System.out.println(respuesta);
    }
}

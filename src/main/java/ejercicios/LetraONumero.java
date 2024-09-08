
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {

    public static String evaluar(char caracter) {
        // TODO: Coloca aquí el código del ejercicio 4: Letra o número
        int ascii = (int) caracter;
        if (ascii >= 65 && ascii <= 90) {
            return "Es letra mayúscula";
        }
        if (ascii >= 97 && ascii <= 122) {
            return "Es letra minúscula";
        }
        if (ascii >= 48 && ascii <= 57) {
            return "Es número";
        }
        return "No es letra ni número";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);

        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}

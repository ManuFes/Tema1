import java.util.Locale;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Introduzca la nota del primer examen: ");
        double nota=sc.nextDouble();
        System.out.print("¿Qué nota quiere sacar en el trimestre? ");
        double objetivo=sc.nextDouble();
        double notaNecesaria=(objetivo-0.4*nota)/0.6;
        if (notaNecesaria > 10) {
            System.out.println("No es posible sacar la nota que quieres en el trimestre porque la nota necesaria en el segundo examen supera el 10.");
        } else {
            System.out.println("Para tener un " + objetivo + " en el trimestre necesita sacar un " + notaNecesaria + " en el segundo examen.");
        }
        sc.close();
    }
}
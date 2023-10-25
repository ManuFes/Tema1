import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Introduzca el número de Kb: ");
        double kb = sc.nextDouble();
        double mb=kb/1024;
        System.out.print(kb+"Kb son "+mb+"Mb");
        sc.close();
    }
}
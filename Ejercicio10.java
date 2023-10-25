import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Introduzca el número de Mb: ");
        double mb = sc.nextDouble();
        double kb=mb*1024;
        System.out.print(mb+"Mb son "+kb+"Kb");
        sc.close();
    }
}
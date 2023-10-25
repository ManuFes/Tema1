import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        double horas = sc.nextDouble();
        double salario=horas*12;
        System.out.print("Su salario semanal es de "+salario+" euros.");
        sc.close();
    }
}
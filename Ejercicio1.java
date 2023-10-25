import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Este programa multiplica dos números enteros.");
        System.out.print("Por favor, introduzca el primer número: ");
        double primernum = sc.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        double segunnum = sc.nextDouble();
        double multiplicacion=primernum*segunnum;
        System.out.print(primernum+"*"+segunnum+"="+multiplicacion);
        sc.close();
    }
}
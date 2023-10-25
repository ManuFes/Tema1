import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        //introducir chcp 65001 en la terminal antes de iniciar
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Introduzca la base imponible (precio del articulo sin IVA): ");
        double base = sc.nextDouble();
        double iva;
        double total;
        iva= 21*base/100;
        total=iva+base;
        System.out.println("Base imponible\t "+base+"€");
        System.out.println("IVA\t\t "+iva+"€");
        System.out.println("---------------------------");
        System.out.println("Total\t\t "+total+"€");
        sc.close();
    }
}
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        double proporcion=166.386;
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH); //Leemos desde la entrada genérica
        System.out.print("Introduzca la cantidad de euros que desea convertir: ");
        int pesetas;
        double euros = sc.nextDouble();
        pesetas=(int) (euros*proporcion);
        System.out.println(euros+" euros son "+pesetas+" pesetas");
        sc.close();
    }
}
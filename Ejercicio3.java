import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        double proporcion=166.386;
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH); //Leemos desde la entrada genérica
        System.out.print("Introduzca la cantidad de pesetas que desea convertir: ");
        double euros;
        int pesetas = sc.nextInt();
        euros= (pesetas/proporcion);
        System.out.println(pesetas+" pesetas son "+euros+" euros");
        sc.close();
    }
}
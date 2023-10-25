import java.util.Locale;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Volumen de un cono");
        System.out.println("----------------------");
        System.out.print("Introduzca la altura (cm): ");
        double h=sc.nextDouble();
        System.out.print("Introduzca el radio de la base (cm): ");
        double r = sc.nextDouble();
        double v=(0.33)*3.14*(r*r)*h;
        
        System.out.println("El volumen del cono es "+v);
        
        
        sc.close();
    }
}
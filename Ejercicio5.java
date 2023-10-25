import java.util.Locale;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Este programa calcula el area de un rectángulo");
        System.out.print("Introduzca la base (cm): ");
        double base = sc.nextDouble();
        System.out.print("Introduzca la altura (cm): ");
        double altura=sc.nextDouble();
        double area=base*altura;
        
        
        System.out.println("El área del rectángulo es "+area);
        
        
        sc.close();
    }
}

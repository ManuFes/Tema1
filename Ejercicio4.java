import java.util.Locale;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Este programa suma, resta, multiplica y divide los dos números que quieras");
        System.out.print("Introduzca el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        double num2=sc.nextDouble();
        double suma=num1+num2;
        double resta=num1-num2;
        double mult=num1*num2;
        double div=num1/num2;
        System.out.println("x = "+num1);
        System.out.println("y = "+num2);
        System.out.println("x + y = "+suma);
        System.out.println("x - y = "+resta);
        System.out.println("x / y = "+div);
        System.out.println("x * y = "+mult);
        
        sc.close();
    }
}
package Num1;
import java.util.Scanner;
public class Num7 {
    
    public void uoy(int x) { // метода класса с именем "uoy"
        int num = 1;
        for (int i=1;i<=x;i++){
            num = num * i;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод: " );
        int u = sc.nextInt();

        Num7 factorial = new Num7();
        factorial.uoy(u); // непонял почему нельзя написать просто Num7.uoy(u)
    }


}

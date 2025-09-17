package Num1;
import java.util.Scanner;

public class Num4
{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum1=0;
		int a;
		int[] spisok = new int[10];

		do {
		a =sc.nextInt();	
		//Тело цикла
		}while(a instanceof Integer);
		
		for (int i=0;i<10;i++){
		spisok[i]=sc.nextInt();   
		}

		System.out.println("-----------------------------");

		for (int i = 0;i<10;i++){
		System.out.println(spisok[i]);
		}

		System.out.println("-----------------------------");

		for (int i = 0;i<10;i++){
		sum1 = sum1 + spisok[i];
		System.out.println("sum1 " + sum1);
		}

	}
}
package Num1;
import java.util.Scanner;

public class Num4
{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum1=0;
		int a = 0;
		int[] spisok = new int[10];

		while (a < 10) {    // ¯\_(ツ)_/¯ for лучше
			sum1 = sc.nextInt();
			spisok[a] = sum1; 
			a++;	
		}

		System.out.println("-----------------------------");

		for (int i = 0;i<10;i++){
		System.out.println(spisok[i]);
		}

		System.out.println("-----------------------------");

		int min = 999999; //что бы найти минимальное
		int max = -99999; //что бы найти максимальное

		for (int i : spisok) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
			}

		System.out.println("min " + min);
		System.out.println("max " + max);
		
	}
}
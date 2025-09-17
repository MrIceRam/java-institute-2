package Num1;
import java.util.Scanner;

public class Num3
{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sum1=0;
		double sum2=0;
		int[] spisok = {0,23,2,1,3,4,6,2,1,5,23,};



		System.out.println("-----------------------------");

		for (int i = 0;i<10;i++){ // выводит список для удобства
		System.out.println(spisok[i]);
		}

		System.out.println("-----------------------------");

		for (int i = 0;i<spisok.length;i++){ //spisok.length длинна масива
		sum1 = sum1 + spisok[i];
		System.out.println("sum1 " + (int) sum1); //сумма
		}
		System.out.println("среднее арифметическое " + sum1/10); //среднее арифметическое

	}
}
package Num1;

import java.util.Scanner;

public class Num5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] spisok = new int[10];
        
        for(int i=0;i<10;i++){
            spisok[i] = sc.nextInt();
        }

        System.out.println("-----------------------------");

        for (int i = 0;i<10;i++){ // выводит список для удобства
		System.out.println(spisok[i]);
		}
    }
}

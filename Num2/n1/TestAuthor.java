package Num2.n1;


import java.util.Scanner;

public class TestAuthor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Author au = new Author(sc.next(),sc.next(),'m');
        System.out.println(au);
    }
}

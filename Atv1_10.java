package Atividades_IfElse;

import java.util.Scanner;

public class Atv1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int x = sc.nextInt();
        if (x >= 100 && x <= 200) {
            System.out.println(x + " está dentro do intervalo de 100 a 200");
        } else {
            System.out.println(x + " NÃO está dentro do intervalo de 100 a 200");
        }
    }
}

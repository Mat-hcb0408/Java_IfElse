package Atividades_IfElse;
import java.util.Scanner;
public class Atv4_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro lado: ");
            int lado1 = scanner.nextInt();

            System.out.print("Digite o segundo lado: ");
            int lado2 = scanner.nextInt();

            System.out.print("Digite o terceiro lado: ");
            int lado3 = scanner.nextInt();

            if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
                System.out.println("Os números podem formar um triângulo.");
            } else {
                System.out.println("Os números não podem formar um triângulo.");
            }

            scanner.close();
        }
    }


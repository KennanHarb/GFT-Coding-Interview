package gft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Por favor, informe seu sálario: ");
        Scanner userInput = new Scanner(System.in);
        float salario = userInput.nextFloat();
        System.out.println("Seu salário atual: " + salario);
        if (salario>=0 && salario<=1600){
            System.out.println("Seu percentual de aumento salarial é 25%");
            System.out.println("Valor do seu aumento: R$ " + salario*0.25);
            salario *= 1.25;
            System.out.println("Seu salário após o aumento: R$ " + salario);
        }
        else if (salario>1600 && salario<3000){
            System.out.println("Seu percentual de aumento salarial é 20%");
            System.out.println("Valor do seu aumento: R$ " + salario*0.20);
            salario *= 1.20;
            System.out.println("Seu salário após o aumento: R$ " + salario);
        }
        else if (salario>=3000 && salario<5000){
            System.out.println("Seu percentual de aumento salarial é 15%");
            System.out.println("Valor do seu aumento: R$ " + salario*0.15);
            salario *= 1.15;
            System.out.println("Seu salário após o aumento: R$ " + salario);
        }
        else if (salario>=5000){
            System.out.println("Seu percentual de aumento salarial é 10%");
            System.out.println("Valor do seu aumento: R$ " + salario*0.1);
            salario *= 1.1;
            System.out.println("Seu salário após o aumento: R$ " + salario);
        }
        else System.out.println("Valor inválido");
    }
}

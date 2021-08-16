package gft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Olá, em qual turno você trabalha: ");
        System.out.println("Digite 'M' para Manhã");
        System.out.println("Digite 'T' para Tarde");
        System.out.println("Digite 'N' para Noite");
        Scanner userInput = new Scanner(System.in);
        String turno = userInput.nextLine();
        switch (turno){
            case "M":
                System.out.println("Bom dia!");
                break;
            case "T":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}

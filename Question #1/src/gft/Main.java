package gft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int idade = 0, ate14 = 0, de15a29 = 0, de30a44 = 0, de45a59 = 0, acima60 = 0, total = 0;
        float percent1 = 0, percent2 = 0;
        for (int i = 0; i<10; i++){
            idade = userinput.nextInt();
            if (idade>=0 && idade<=14){
                ate14++;
                total++;
            }
            else if (idade>=15 && idade<=29){
                de15a29++;
                total++;
            }
            else if (idade>=30 && idade<=44){
                de30a44++;
                total++;
            }
            else if (idade>=45 && idade<=59){
                de45a59++;
                total++;
            }
            else if (idade>=60){
                acima60++;
                total++;
            }

        }
        percent1 = ate14*100/total;
        percent2 = acima60*100/total;
        System.out.println("Quantidade de pessoas até 14 anos de idade: " + ate14 + " (" + percent1 + " %)");
        System.out.println("Quantidade de pessoas de 15 a 29 anos de idade: " + de15a29);
        System.out.println("Quantidade de pessoas de 30 a 44 anos de idade: " + de30a44);
        System.out.println("Quantidade de pessoas de 45 a 59 anos de idade: " + de45a59);
        System.out.println("Quantidade de pessoas acima de 60 anos idade: " + acima60 + " (" + percent2 + " %)");

    }
}

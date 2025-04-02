package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        Switch Cases: Servem apra gerar casos especificos
        Objetivo: Deixar com o usuário a opção de escolher os Ninjas
         */

        // Pedir para o usuário
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções para o usuário
        System.out.println("Escolha um personagem:");
        System.out.println("[1] Naruto Uzumaki");
        System.out.println("[2] Sasuke Uchiha");
        System.out.println("[3] Sakura Haruno");

        // Pedir para o usuário escolher um
        int escolhaDoUser = scanner.nextInt();

        System.out.print("");
        System.out.println("Você digitou o número: " + escolhaDoUser);

        // Reação ao escolher um personagem
        switch (escolhaDoUser) {
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
            case 3:
                System.out.println("Você escolheu a Sakura Haruno");
            default:
                System.out.println("Você digitou uma resposta válida, tente novamente");
        }

        // Fechar a caixa
        scanner.close();


    }
}

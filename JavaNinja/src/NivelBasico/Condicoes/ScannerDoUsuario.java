package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        É um jeito de trazer o usuário dentro da aplicação
        Objetivo: O usuário vai criar um ninja e vamos validar os dados
         */

        // Abrir o Scanner para nome do Ninja
        System.out.print("Escreva o nome do Ninja:");
        Scanner caixaDeTexto = new Scanner(System.in);

        String nomeNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do Ninja é: " + nomeNinja);

        // Abrir o Scanner para idade do Ninja
        System.out.print("Escreva a idade do Ninja:");
        int idadeNinja = caixaDeTexto.nextInt();
        System.out.println("O Ninja " + nomeNinja + " tem " + idadeNinja + " anos");

        //Tratamento de Dados
        if (idadeNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade, ele já pode ir em \nmissões fora da aldeia");
        } else {
            System.out.println("Esse ninja é muito novo, ele precisa treinar mais");
        }

        // Sempre fechar o Scanner
        caixaDeTexto.close();
    }
}

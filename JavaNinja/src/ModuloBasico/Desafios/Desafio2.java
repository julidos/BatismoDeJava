package ModuloBasico.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        /*
        Desafio 2
         */


        // Abertura do Array dos Ninjas
        String[] nomeNinja = new String[3];

        // Inicialização do Scanner para receber os nomes e opções do menu
        Scanner caixaDeTexto = new Scanner(System.in);

        // Contador para verificar quantos ninjas foram cadastrados
        int cont = 0;

        // Booleano do While
        boolean menu = true;

        while (menu) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            String opcaoMenu = caixaDeTexto.nextLine();

            switch (opcaoMenu) {
                case "1":
                    if (cont < nomeNinja.length) {
                        System.out.println("\nDigite o nome do Ninja:");
                        nomeNinja[cont] = caixaDeTexto.nextLine();
                        cont++;
                        System.out.println("\nNinja Cadastrado com sucesso!");
                    } else {
                        System.out.println("\nNúmero máximo de ninjas atingido!");
                    }
                    break;
                case "2":
                    if (cont != 0) {
                        System.out.println("\n===== Lista de Ninjas =====");
                        for (int i = 0; i < nomeNinja.length; i++) {
                            if (nomeNinja[i] != null) {
                            System.out.println(i+1 + ". "+nomeNinja[i]);
                            } else {
                            continue;
                            }
                        }
                        System.out.println("===========================");
                    } else {
                        System.out.println("\nNenhum ninja encontrado");
                    }
                    break;
                case "3":
                    if (cont != 0) {
                        System.out.println("\n===== Lista de Ninjas =====");
                        for (int i = 0; i < nomeNinja.length; i++) {
                            if (nomeNinja[i] != null) {
                                System.out.println(i+1 + ". "+nomeNinja[i]);
                            } else {
                                continue;
                            }
                        }
                        System.out.println("\nDigite o número do ninja que deseja excluir");
                        int numNinja = caixaDeTexto.nextInt();
                        caixaDeTexto.nextLine();
                        nomeNinja[numNinja-1] = null;
                        System.out.println("\nNinja removido com sucesso!");
                        cont--;
                    } else {
                        System.out.println("\nNenhum ninja encontrado");
                    }
                    break;
                case "4":
                    menu = false;
                    break;
                default:
                    System.out.println("Nenhuma opção válida foi escolhida, tente novamente!");
                    break;
            }
        }
        caixaDeTexto.close();
    }
}

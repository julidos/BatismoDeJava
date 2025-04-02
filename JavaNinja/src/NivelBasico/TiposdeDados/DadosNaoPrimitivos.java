package NivelBasico.TiposdeDados;

public class DadosNaoPrimitivos {

    /*
    * Dados não primitivos: String, Array, CLass, enum
    * Objetivo: Criar um ninja, e atribuir metodos a ele.
    * */
    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";
        System.out.println(nome);
        String nomeUpperCase = nome.toUpperCase();
        System.out.println("Nome em CAPS: " + nomeUpperCase);

        String aldeia = "Aldeia da Folha";
        Boolean aldeiaEmpty = aldeia.isEmpty();
        System.out.println(aldeiaEmpty);

    }
}

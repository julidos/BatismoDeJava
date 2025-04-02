package NivelBasico.TiposdeDados;

public class DadosPrimitivos  {
    public static void main(String[] args) {
        /*
        *Dados primitivos - int, double, float, char, boolean, short.
        * Objetivo da aula: Criar um ninja
        *
         */
        int idade = 16; // Valor máximo int: 2 147 483 647
        double altura= 1.70;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999999L; // Valor máximo 9 223 372 036 854775 807 sempre botar L maiusculo no Long e no fim
        System.out.println(idade);
        System.out.println(saldoBancario);
        System.out.println("saldoBancario = " + saldoBancario);
        System.out.println("Minha idade é " + idade);
    }
}

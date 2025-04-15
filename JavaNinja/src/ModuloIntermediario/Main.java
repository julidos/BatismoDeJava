package ModuloIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criar o ninja Naruto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;

        // Criar ninja Sasuke Uchiha
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 29;

        // Aplicando métodos aos meus objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Naruto.anosParaSeTornarHokage(60);
        System.out.println("Você têm " + Naruto.idade + " anos então faltam no mínimo "
                +quantoTempoFalta+ " anos para você se tornar um hokage");

        // Criar ninja Sakura Haruno
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;

    }
}

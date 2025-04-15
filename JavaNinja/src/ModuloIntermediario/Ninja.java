package ModuloIntermediario;

public class Ninja {

    String nome;
    int idade;
    String aldeia;

    // Criar um método public personalizado
    // Método void não precisa retornar nada
    public void SharinganAtivado(){
        System.out.println("O sharingan ativou");
    }

    //Método String vai ter que retornar uma String
    public String euSouUmNinja() {
        return "Oi, eu sou um ninja";
    }

    //Método int via ter que retornar um int
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}

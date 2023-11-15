import animais.cachorro;

public class Main {

    public static void main(String[] args) {

        cachorro cachorro1 = new cachorro();

        cachorro1.nome = "Richas";
        cachorro1.cor = "marrom";
        cachorro1.altura = 22;
        cachorro1.peso = 5.55;
        cachorro1.temanhoDoRabo = 5;

        //cachorro1.latir();
        // System.out.println("O Cachorro Pegou Uma " + cachorro1.pegar());

        System.out.println("O Cachorro Esta " + cachorro1.interagir("vai dormir"));
        System.out.println("O Cachorro Esta " + cachorro1.interagir("carinho"));
        System.out.println("O Cachorro Esta " + cachorro1.interagir("nada"));
    }
}

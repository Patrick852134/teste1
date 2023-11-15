import animais.cachorro;

public class Main {

    public static void main(String[] args) {

        cachorro cachorro1 = new cachorro();

        cachorro1.setNome("Richas");
        cachorro1.setCor("marrom");
        cachorro1.setAltura(22);
        cachorro1.setPeso(5.55);
        cachorro1.setTemanhoDoRabo(5);

        System.out.println("O Cachorro Esta " + cachorro1.interagir("vai dormir"));
        System.out.println("O Cachorro Esta " + cachorro1.interagir("carinho"));
        System.out.println("O Cachorro Esta " + cachorro1.interagir("pisar na patinha"));
        System.out.println("O Cachorro Esta " + cachorro1.interagir("nada"));

    }
}

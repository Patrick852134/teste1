package animais;

public class cachorro {

    //Attributes

    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int temanhoDoRabo;
    public String estadoDeEspirito = "Neutro";


    //Metodos

    public void comer() {
    }

    public void latir() {
        System.out.println("AU AU");
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {

        //enum (estudar)

        switch (acao) {
            case "carinho": this.estadoDeEspirito = "Feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha" : this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro";
        }
        return estadoDeEspirito;

    }
    //        if (acao.equals("carinho")){
//            this.estadoDeEspirito = "feliz";
//        } else if (acao.equals("vai dormir")){
//            this.estadoDeEspirito = "bravo";
//        }else{
//            this.estadoDeEspirito = "neutro";
//        }
//        return estadoDeEspirito;


}
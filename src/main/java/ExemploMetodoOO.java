import models.Carro;

public class ExemploMetodoOO {
    public static void main(String[] args) {
        Carro ferrari = new Carro();

        ferrari.setOcupantes(2);

        System.out.println("Quantidade inicial de ocupantes na Ferrari: " + ferrari.getOcupantes());

        ferrari.tiraCasaco(1);

        System.out.println("Quantidade após remover ocupantes: " + ferrari.getOcupantes());

        ferrari.colocaCasaco(3);

        System.out.println("Quantidade após adicionar ocupantes: " + ferrari.getOcupantes());
    }
}

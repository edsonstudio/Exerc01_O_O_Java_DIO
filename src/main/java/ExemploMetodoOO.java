import models.Carro;

public class ExemploMetodoOO {
    public static void main(String[] args) {
        Carro ferrari = new Carro();

        ferrari.setOcupantes(2);

        System.out.println("Quantidade de ocupantes na Ferrari: " + ferrari.getOcupantes());

        ferrari.tiraCasaco(1);

        System.out.println("Quantidade atualizada de ocupantes: " + ferrari.getOcupantes());

        ferrari.colocaCasaco(3);

        System.out.println("Nova quantidade de ocupantes: " + ferrari.getOcupantes());
    }
}

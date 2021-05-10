package models;

public class Carro {

    private Integer ocupantes;

    public Integer getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(Integer ocupantes) {
        this.ocupantes = ocupantes;
    }

    public void colocaCasaco(Integer ocupantes) {
        this.ocupantes += ocupantes;
    }

    public void tiraCasaco(Integer ocupantes) {
        this.ocupantes -= ocupantes;
    }
}

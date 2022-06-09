public class Cachorro extends Animal {
    private String raca;

    public Cachorro() {}

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public void locomover() {
        System.out.println("Estou correndo!");
    }

    public final void latir() {
        System.out.println("Au au au!");
    }


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

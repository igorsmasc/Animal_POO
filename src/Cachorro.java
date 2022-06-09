public class Cachorro extends Animal {
    private String raca;

    public Cachorro() {}

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public void locomover() {

    }


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

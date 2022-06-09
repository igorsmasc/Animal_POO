public class Passaro extends Animal {
    private String corDasAsas;

    public Passaro() {
    }

    @Override
    public void locomover() {
        System.out.println("Estou voando!");
    }

    public Passaro(String nome, double peso) {
        super(nome, peso);
    }

    public String getCorDasAsas() {
        return corDasAsas;
    }

    public void setCorDasAsas(String corDasAsas) {
        this.corDasAsas = corDasAsas;
    }
}

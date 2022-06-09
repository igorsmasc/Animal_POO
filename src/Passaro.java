public class Passaro extends Animal {
    private String corDasAsas;

    public Passaro() {
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

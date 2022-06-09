public class Tartaruga extends Animal {
    private String corDoCasco;

    public Tartaruga() {
    }

    public Tartaruga(String nome, double peso) {
        super(nome, peso);
    }

    public String getCorDoCasco() {
        return corDoCasco;
    }

    public void setCorDoCasco(String corDoCasco) {
        this.corDoCasco = corDoCasco;
    }
}

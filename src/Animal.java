
// A Classe abstrata não pode ser instanciada -> Não consigo criar um objeto
// diretamente dessa classe
public abstract class Animal {

    private String nome;
    private double peso;

    public Animal() {
    }

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    // Método declarado na classe mãe, mas implementado nas classes filhas
    public abstract void locomover();

//    public void locomover() {
//        System.out.println("Estou em movimento!");
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

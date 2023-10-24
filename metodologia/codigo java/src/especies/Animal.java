package especies;

public class Animal {

    protected float peso;
    protected int idade;
    protected String membros;

    public Animal(float peso, int idade, String membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;

    }

    public void locomover() {
        System.out.print("O animal esta locomovendo");

    }

    public void alimentar() {
        System.out.print("O animal esta se alimentando");
    }

    public void emitirSom() {
        System.out.print("O animal esta emitindo som");

    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMembros() {
        return membros;
    }

    public void setMembros(String membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        return "Animal [idade=" + idade + ", peso" + peso + ", membros=" + membros + "]";
    }

}
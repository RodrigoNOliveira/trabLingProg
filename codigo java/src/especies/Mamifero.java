package especies;

public class Mamifero extends Animal {

    protected String corPelo;

    public Mamifero(float peso, int idade, String membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public void emitirSom() {
        System.out.print("O animal esta emitindo som");
    }

    @Override
    public String toString() {
        return "Mamifero [idade= " + idade + ", peso= " + peso + ", membros= " + membros + ", cor do pelo= " + corPelo
                + "]";
    }

}
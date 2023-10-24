package especies;

public class Reptil extends Animal {

    protected String corEscama;

    public Reptil(float peso, int idade, String membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return "Reptil [idade= " + idade + ", peso= " + peso + ", membros= " + membros + ", cor da escama= " + corEscama
                + "]";
    }

}
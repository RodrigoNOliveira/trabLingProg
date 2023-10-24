package especies;

public class Peixe extends Animal {

    protected String corEscama;

    public Peixe(float peso, int idade, String membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public void soltarBolha() {
        System.out.print("O animal esta fazendo bolhas");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return "Peixe [idade= " + idade + ", peso= " + peso + ", membros= " + membros + ", cor da escama= " + corEscama
                + "]";
    }

}
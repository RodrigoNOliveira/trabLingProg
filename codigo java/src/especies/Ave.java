package especies;

public class Ave extends Animal {

    protected String corPena;

    public Ave(float peso, int idade, String membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public void fazerNinho() {
        System.out.print("A ave esta fazendo o ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return "Ave [peso= " + peso + ", idade= " + idade + ",  membros= " + membros + ", cor da pena= " + corPena + "]";
    }

}
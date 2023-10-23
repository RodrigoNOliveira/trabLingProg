
import especies.*;

class App {
    public static void main(String[] args) {


        // NESSE CODIGO É IMPLEMENTADO EXEMPLOS DE UTILIZAÇÃO DE CLASSES, OBJETOS, HERANÇA E POLIMORFISMO.

        System.out.println();
        System.out.println("--------------------------");

        // CACHORRO

        Cachorro cao = new Cachorro(14.5f, 6, "patas", "preto com branco");
        System.out.println(cao);
        cao.enterrarOsso();
        System.out.println();
        cao.abanarRabo();
        System.out.println();
        cao.emitirSom();
        System.out.println();
        cao.reagir("agradavel");
        System.out.println();
        cao.reagir("agressiva");
        System.out.println();
        cao.reagir(5);
        System.out.println();
        cao.reagir(9);
        System.out.println();
        cao.reagir(15);
        System.out.println();
        cao.reagir(true);
        System.out.println();
        cao.reagir(false);
        System.out.println();
        cao.reagir(4, 16f);
        System.out.println();
        cao.reagir(3, 5f);
        System.out.println();
        cao.reagir(16, 15f);
        System.out.println();
        cao.reagir(17, 6f);

        System.out.println();
        System.out.println("--------------------");

        // CANGURU

        Canguru canguruJack = new Canguru(65f, 9, "pernas, braços e calda", "amarelo");
        System.out.println(canguruJack);
        System.out.println();
        canguruJack.usarBolsa();
        System.out.println();
        canguruJack.locomover();
        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        // LOBO

        Lobo lobin = new Lobo(33f, 6, "patas", "branco com cinza");
        System.out.println(lobin);
        lobin.emitirSom();

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        // COBRA
        Cobra croba = new Cobra(2f, 3, "não possui", "vermelho, laranja, amarelo e branco contrastantes com anéis");
        System.out.println(croba);
        croba.alimentar();
        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        // TARTARUGA

        Tartaruga tortuguita = new Tartaruga(65f, 189, "pernas", "marrom");
        System.out.println(tortuguita);
        tortuguita.emitirSom();
        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        // GoldFish
        Goldfish nemo = new Goldfish(0.06f, 2, "nadadeiras", "laranja, preto e branco");
        System.out.println(nemo);
        nemo.locomover();

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        // AVE

        Arara rio = new Arara(6f, 8, "asas", "Azul");
        System.out.println(rio);
        rio.fazerNinho();

        System.out.println();
        System.out.println("--------------------");

    }
}
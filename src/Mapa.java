public class Mapa {
    private Personagem p1;
    private Personagem p2;

    public Mapa(Personagem p1, Personagem p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void lutar() {
        while (p1.getVida() > 0 && p2.getVida() > 0) {
            p1.atacar(p2, "Golpe 1", 10);
            if (p2.getVida() <= 0) {
                break;
            }
            p2.atacar(p1, "Golpe 2", 20);
        }

        if (p1.getVida() <= 0) {
            System.out.println(p2.getNome() + " venceu a luta!");
        } else {
            System.out.println(p1.getNome() + " venceu a luta!");
        }
    }
}

public class Jogo {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Lutador 1");
        Personagem p2 = new Personagem("Lutador 2");
        Mapa mapa = new Mapa(p1, p2);
        mapa.lutar();
    }
}
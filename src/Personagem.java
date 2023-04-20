public class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void atacar(Personagem alvo, String golpe, int dano) {
        alvo.setVida(alvo.getVida() - dano);
        System.out.println(nome + " usou " + golpe + " e causou " + dano + " de dano em " + alvo.getNome());
    }
}


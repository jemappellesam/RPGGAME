import java.util.List;

public abstract class Entidade {
    private String Nome;
    private int Nivel;
    private int Saude;
    private int Energia;
    private List<Habilidade> Habilidades;

    public Entidade(String nome, int nivel, int saude, int energia, List<Habilidade> habilidades) {
        Nome = nome;
        Nivel = nivel;
        Saude = saude;
        Energia = energia;
        Habilidades = habilidades;
    }

    public String getNome() {
        return Nome;
    }

    public int getNivel() {
        return Nivel;
    }

    public int getSaude() {
        return Saude;
    }

    public int getEnergia() {
        return Energia;
    }

    public List<Habilidade> getHabilidades() {
        return Habilidades;
    }
    public void perderSaude(int dano){
        Saude -=dano;
    }
}
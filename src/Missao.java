import java.util.Arrays;

public class Missao {
    private String titulo;
    private String descricao;
    private Item recompensa;
    private String[] objetivos;
    private boolean completa;

    public String getTitulo() {
        return titulo;
    }



    public Missao(String titulo, String descricao, String[] objetivos, Item recompensa) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.objetivos = objetivos;
        this.recompensa = recompensa;
        this.completa = false;
    }

    public void iniciar(Personagem personagem) {
        System.out.println("A missão " + titulo + " foi iniciada por " + personagem.getNome());
    }

    public void completar(Personagem personagem) {
        if (!completa) {
            System.out.println("A missão " + titulo + " foi completada");
            personagem.pegarItem(recompensa);
            completa = true;
        } else {
            System.out.println("Você já completou a missão " + titulo);
        }
    }

    public boolean isCompleta() {
        return completa;
    }

    @Override
    public String toString() {
        return "Missao " +
                "Titulo='" + titulo + '\'' +
                ",Descricao='" + descricao + '\'';
    }
}

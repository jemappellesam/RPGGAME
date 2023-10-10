import java.util.ArrayList;
import java.util.List;

public class MundoVirtual implements IniciarJogo {
    public int[][] mapaDoMundo;
    private List<Personagem> personagens;
    private List<Missao> missoesAtivas;
    private List<Inimigo> inimigos;



    public void adicionarPersonagem(Personagem personagem) {
        personagens.add(personagem);
    }

    public void removerPersonagem(Personagem personagem) {
        personagens.remove(personagem);
    }

    public void adicionarMissao(Missao missao) {
        missoesAtivas.add(missao);
    }

    public void removerMissao(Missao missao) {
        missoesAtivas.remove(missao);
    }

    public void adicionarInimigo(Inimigo inimigo) {
        inimigos.add(inimigo);
    }

    public void removerInimigo(Inimigo inimigo) {
        inimigos.remove(inimigo);
    }

    public void interagir(Personagem personagem, Inimigo inimigo) {
        personagem.atacar(inimigo);
        if (inimigo.getSaude() <= 0) {
            inimigos.remove(inimigo);
            System.out.println("Você derrotou o inimigo " + inimigo.getNome());
        }
    }

    public void progressaoDoMundo() {
        for (Personagem personagem : personagens) {
            if (personagem.getSaude() <= 0) {
                System.out.println(personagem.getNome() + " foi derrotado!");
                personagens.remove(personagem);
                for(Missao missao : missoesAtivas){
                    missao.completar(personagem);
                }

            }
        }


        for (Missao missao : missoesAtivas) {
            if (missao.isCompleta()) {
                System.out.println("Missão " + missao.getTitulo() + " foi completada!");
                missoesAtivas.remove(missao);
            }
        }



    }

    @Override
    public void iniciar(int[][] coordenadas, List<Personagem> personagens, List<Inimigo> inimigos, List<Missao> missoes) {
        this.mapaDoMundo = coordenadas;
        this. personagens = personagens;
        this.inimigos = inimigos;
        this.missoesAtivas = missoes;
    }
}

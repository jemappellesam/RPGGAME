import java.util.List;

public class Inimigo extends  Entidade{
    GerenciarAcoes Gerenciador;
    public Inimigo(String nome, int nivel, int saude, int energia, List<Habilidade> habilidades){
        super(nome, nivel,saude,energia,habilidades);
    }
    public void atacar(Entidade personagem){
        Gerenciador.atacar(personagem);
    }

}

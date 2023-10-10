import java.util.ArrayList;
import java.util.List;

public class Personagem extends Entidade {
    private List<Item> itens;
    private GerenciarAcoes Gerenciador;

    public Personagem(List<Item> Itens, String nome, int nivel, int saude, int energia, List<Habilidade> habilidades) {
        super(nome, nivel, saude, energia, habilidades);
        this.itens = Itens;
        Gerenciador = new GerenciarAcoes();
    }

    public void atacar(Inimigo Inimigo) {
        Gerenciador.atacar(Inimigo);
    }

    public void pegarItem(Item item) {
        System.out.println("Você pegou o item " + item.getNome());
        itens.add(item);
    }

    public void usarItem(Item item) {
        Gerenciador.usarItem(item);
    }

    public void caminhar(double x, double y) {
        Gerenciador.caminhar(x, y);
    }

    public void usarHabilidade(Habilidade habilidade) {
        habilidade.usar(this);
    }





}
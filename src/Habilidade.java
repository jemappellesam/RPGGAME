public class Habilidade {
    private String nome;
    private String descricao;
    private int custoEnergia;

    public Habilidade(String nome, String descricao, int custoEnergia) {
        this.nome = nome;
        this.descricao = descricao;
        this.custoEnergia = custoEnergia;
    }

    public void usar(Entidade entidade) {
        if (entidade.getEnergia() >= custoEnergia) {
            System.out.println("A habilidade " + nome + " foi usada");

        } else {
            System.out.println("Você não tem energia suficiente para usar a habilidade " + nome);
        }
    }

    public String getNome() {
        return nome;
    }
}

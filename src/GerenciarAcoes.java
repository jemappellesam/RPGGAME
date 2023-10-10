public class GerenciarAcoes {
    public void atacar(Entidade Entidade){
        System.out.println("Você atacou " + Entidade.getNome());
        int dano = Entidade.getNivel();
        Entidade.perderSaude(dano);

    }

    public void usarItem(Item item){
        item.usar();
    }
    public void caminhar(double x, double y){
        System.out.println("Você foi do ponto "+ x + " para o ponto " + y);
    }


}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Habilidade> habilidades = new ArrayList<>();
        List<Item> itens = new ArrayList<>();

        Habilidade bolaDeFogo = new Habilidade("bola de fogo", "solta uma bola de fogo" , 1);
        habilidades.add(bolaDeFogo);
        String[] objetivos = new String[10];
        objetivos[1] = "matar dragao";

        MundoVirtual mundoVirtual = new MundoVirtual();

        Personagem personagem = new Personagem(itens,"1",1,10,10,habilidades);

        Item cajado = new Item("Cajado das Eras", "Cajado magico", "mago", "Efeito Incrivel :D");

        itens.add(cajado);

        Missao missao = new Missao("Derrotar dragão","Derrote o dragão",objetivos , cajado);

        Inimigo dragão = new Inimigo("Dragão",1,5,5,habilidades);


        int[][] coordenadas = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
        };

         List<Personagem> personagens = new ArrayList<>();
         List<Missao> missoesAtivas = new ArrayList<>();
         List<Inimigo> inimigos = new ArrayList<>();

         personagens.add(personagem);
         missoesAtivas.add(missao);
         inimigos.add(dragão);


         GerenciarAcoes gerenciador = new GerenciarAcoes();

        mundoVirtual.iniciar(coordenadas,personagens,inimigos,missoesAtivas);

        int aux;
        Scanner scan = new Scanner(System.in);

        mundoVirtual.adicionarPersonagem(personagem);
        mundoVirtual.adicionarMissao(missao);
        mundoVirtual.adicionarInimigo(dragão);

        missao.iniciar(personagem);

        do {
            System.out.println("Qual será sua proxima ação:");
            System.out.println("1: Atacar inimigo a sua frente");
            System.out.println("2: Mover-se");
            System.out.println("3: Verificar missões");
            System.out.println("4: Usar habilidade");
            System.out.println("5: Usar item");
            System.out.println("9: Finalizar jogo");
            aux = scan.nextInt();

            if (aux == 1){

                mundoVirtual.interagir(personagem, dragão);
                dragão.atacar(personagem);
                mundoVirtual.progressaoDoMundo();
            }
            else if(aux == 2){
                System.out.println("Ponto inicial: ");
                double x = scan.nextDouble();
                System.out.println("Ponto final: ");
                double y = scan.nextDouble();
                personagem.caminhar(x,y);
            }
            else if(aux == 3){
                System.out.println( missao.toString());
            }

            else if (aux ==4 ) {
                personagem.usarHabilidade(bolaDeFogo);

            }
            else if(aux ==5){
                personagem.usarItem(cajado);
            }


        } while (aux != 9);





    }


}
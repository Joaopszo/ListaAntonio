package ProjetoSimples;

public class Noticias {

    Lista imagens;
    Node noticiasAtual;

    void proximaNoticia(){

        noticiasAtual=noticiasAtual.next;
        System.out.println(noticiasAtual.data);

    }

    void anteriorNoticia(){

        noticiasAtual=noticiasAtual.back;
        System.out.println(noticiasAtual.data);

    }

}

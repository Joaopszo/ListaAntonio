package ProjetoSimples;

public class Imagens {

    Node imagensAtual;

    void proximaImagem(){

        imagensAtual=imagensAtual.next;
        System.out.println(imagensAtual.data);

    }

    void anteriorImagem(){

        imagensAtual=imagensAtual.back;
        System.out.println(imagensAtual.data);

    }

}

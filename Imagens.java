package ProjetoSimples;

public class Imagens {

    String caminho;

    static Node imagemAtual;
    static int indexImagemAtual;

    Imagens(String caminho){
        this.caminho = caminho;
    }

    static Imagens addImagem (String caminho){

        Imagens imagem = new Imagens(caminho);
        Lista imagensDaNoticia = Noticias.noticiaSelecionada().imagens;
        imagensDaNoticia.addData(imagem);

        if (imagensDaNoticia.tamanho == 1){
            imagemAtual = imagensDaNoticia.begin;
            indexImagemAtual = 0;
        }

        return imagem;

    }


    static void proximaImagem(){

        Lista imagensDaNoticia = Noticias.noticiaSelecionada().imagens;
        imagensDaNoticia.isEmpty();
        imagemAtual = imagemAtual.next;
        indexImagemAtual = (indexImagemAtual + 1) % imagensDaNoticia.tamanho;
        System.out.println("Imagem (" + indexImagemAtual + "):" + imagemAtual.data);

    }

    static void anteriorImagem(){

        Lista imagensDaNoticia = Noticias.noticiaSelecionada().imagens;
        imagensDaNoticia.isEmpty();
        imagemAtual = imagemAtual.back;
        indexImagemAtual = (indexImagemAtual - 1 + imagensDaNoticia.tamanho) % imagensDaNoticia.tamanho;
        System.out.println("Imagem (" + indexImagemAtual + "):" + imagemAtual.data);

    }

    static void reiniciar ( Lista imagensDaNoticia){

        if (imagensDaNoticia == null || imagensDaNoticia.begin == null){
            imagemAtual = null;
            indexImagemAtual = -1;
        } else {
            imagemAtual = imagensDaNoticia.begin;
            indexImagemAtual = 0;
        }
    }

}

package projetosimples;

public class Noticia {

    private Lista listaDeImagens;
    private int imagemAtual = 0;

    protected void addImagem ( Imagem imagem ){

        this.listaDeImagens.addData(imagem);

    }

    protected Object imagemAtual(){

        return this.listaDeImagens.procurarData(imagemAtual);

    }

    protected Object proximaImagem(){

        imagemAtual++;
        return this.listaDeImagens.procurarData(imagemAtual);

    }

    protected Object anteriorImagem(){

        imagemAtual--;
        return this.listaDeImagens.procurarData(imagemAtual);

    }

}

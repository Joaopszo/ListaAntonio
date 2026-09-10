package projetosimples;

public class Noticia extends Lista {

    private int imagemAtual = 0;

    protected void addImagem ( Imagem imagem ){

        this.addData(imagem);

    }

    protected Object imagemAtual(){

        return this.procurarData(imagemAtual);

    }

    protected Object proximaImagem(){

        imagemAtual++;
        return this.procurarData(imagemAtual);

    }

    protected Object anteriorImagem(){

        imagemAtual--;
        return this.procurarData(imagemAtual);

    }

}

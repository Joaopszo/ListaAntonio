package ProjetoSimples;

public class Noticia extends Lista {

    protected int imagemAtual = 0;
    protected String titulo;

    protected Noticia ( String titulo ){

        this.titulo = titulo;

    }

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

    protected void removerImagem(){

        this.removeData(imagemAtual);
        imagemAtual = 0;

    }

    @Override

    public String toString (){

        return String.valueOf(titulo);

    }

}
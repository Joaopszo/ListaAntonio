package projetosimples;

public class Categoria extends Lista {

    private int noticiaAtual = 0;

    protected void addNoticia ( Noticia noticia ){

        this.addData(noticia);

    }

    protected Object noticiaAtual(){

        return this.procurarData(noticiaAtual);

    }

    protected Object proximaNoticia(){

        noticiaAtual++;
        return this.procurarData(noticiaAtual);

    }

    protected Object anteriorNoticia(){

        noticiaAtual--;
        return this.procurarData(noticiaAtual);

    }
}

package projetosimples;

public class Categoria  {

    private Lista listaDeNoticias;
    private int noticiaAtual = 0;

    protected void addNoticia ( Noticia noticia ){

        this.listaDeNoticias.addData(noticia);

    }

    protected Object noticiaAtual(){

        return this.listaDeNoticias.procurarData(noticiaAtual);

    }

    protected Object proximaNoticia(){

        noticiaAtual++;
        return this.listaDeNoticias.procurarData(noticiaAtual);

    }

    protected Object anteriorNoticia(){

        noticiaAtual--;
        return this.listaDeNoticias.procurarData(noticiaAtual);

    }
}

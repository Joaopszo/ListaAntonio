package projetosimples;

public class SistemaNoticias extends Lista {

    private int categoriaAtual = 0;

    protected void addCategoria ( Categoria categoria ){

        this.addData(categoria);

    }

    protected Object categoriaAtual(){

        return this.procurarData(categoriaAtual);

    }

    protected Object proximaNoticia(){

        categoriaAtual++;
        return this.procurarData(categoriaAtual);

    }

    protected Object anteriorNoticia(){

        categoriaAtual--;
        return this.procurarData(categoriaAtual);

    }
}

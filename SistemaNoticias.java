package projetosimples;

public class SistemaNoticias extends Lista {

    protected int categoriaAtual = 0;

    protected void addCategoria ( Categoria categoria ){

        this.addData(categoria);

    }

    protected Object categoriaAtual(){

        return this.procurarData(categoriaAtual);

    }

    protected Object proximaCategoria(){

        categoriaAtual++;
        return this.procurarData(categoriaAtual);

    }

    protected Object anteriorCategoria(){

        categoriaAtual--;
        return this.procurarData(categoriaAtual);

    }
}

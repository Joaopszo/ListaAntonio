package projetosimples;

public class SistemaNoticias {

    private Lista listaDeCategorias;
    private int categoriaAtual = 0;

    protected void addCategoria ( Categoria categoria ){

        listaDeCategorias.addData(categoria);

    }

    protected Object categoriaAtual(){

        return listaDeCategorias.procurarData(categoriaAtual);

    }

    protected Object proximaNoticia(){

        categoriaAtual++;
        return listaDeCategorias.procurarData(categoriaAtual);

    }

    protected Object anteriorNoticia(){

        categoriaAtual--;
        return listaDeCategorias.procurarData(categoriaAtual);

    }
}

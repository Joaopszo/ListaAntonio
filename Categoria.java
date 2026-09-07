package ProjetoSimples;

public class Categoria {

    String nome;
    Lista noticias = new Lista();
    static Node categoriaAtual;
    static Lista listaCategorias = new Lista();
    static int indexCategoriaAtual;

    Categoria( String nome ){

        this.nome = nome;

    }

    static Categoria addCategoria ( String nome ){

        Categoria categoria = new Categoria(nome);
        listaCategorias.addData(categoria);

        if ( listaCategorias.tamanho == 1 ){

            categoriaAtual = listaCategorias.begin;
            indexCategoriaAtual = 0;

        }

        return categoria;

    }

    void proximaCategoria(){

        categoriaAtual = categoriaAtual.next;
        System.out.println(categoriaAtual.data);

    }

    void anteriorCategoria(){

        categoriaAtual = categoriaAtual.back;
        System.out.println(categoriaAtual.data);

    }

}

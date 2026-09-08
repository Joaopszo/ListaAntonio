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

    static Categoria categoriaSelecionada(){
        return (Categoria) categoriaAtual.data;
    }

    static void proximaCategoria(){

        listaCategorias.isEmpty();
        categoriaAtual = categoriaAtual.next;
        indexCategoriaAtual = (indexCategoriaAtual + 1) % listaCategorias.tamanho;
        System.out.println("Categoria(" + indexCategoriaAtual + "):" + categoriaAtual.data);

        Noticias.reiniciar(categoriaSelecionada().noticias);

    }

    static void anteriorCategoria(){

        listaCategorias.isEmpty();
        categoriaAtual = categoriaAtual.back;
        indexCategoriaAtual = (indexCategoriaAtual - 1 + listaCategorias.tamanho) % listaCategorias.tamanho;
        System.out.println("Categoria(" + indexCategoriaAtual + "):" + categoriaAtual.data);

        Noticias.reiniciar(categoriaSelecionada().noticias);
    }

}

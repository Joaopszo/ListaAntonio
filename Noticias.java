package ProjetoSimples;

public class Noticias {

        String titulo;
        Lista imagens = new Lista();
        static Node noticiaAtual;
        static int indexNoticiaAtual;

        Noticias( String titulo ){

            this.nome = nome;

        }

        static ProjetoSimples.Categoria addCategoria (String nome ){

            ProjetoSimples.Categoria categoria = new ProjetoSimples.Categoria(nome);
            listaCategorias.addData(categoria);

            if ( listaCategorias.tamanho == 1 ){

                categoriaAtual = listaCategorias.begin;
                indexCategoriaAtual = 0;

            }

            return categoria;

        }

    void proximaNoticia(){

        noticiasAtual = noticiasAtual.next;
        System.out.println(noticiasAtual.data);

    }

    void anteriorNoticia(){

        noticiasAtual = noticiasAtual.back;
        System.out.println(noticiasAtual.data);

    }

}

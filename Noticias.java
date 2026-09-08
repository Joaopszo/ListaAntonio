package ProjetoSimples;

public class Noticias {

        String titulo;
        Lista imagens = new Lista();

        static Node noticiaAtual;
        static int indexNoticiaAtual;

        Noticias( String titulo ){

            this.titulo = titulo;

        }

        static Noticias addNoticia (String titulo ){

            Noticias noticia = new Noticias(titulo);
            Lista noticiasDaCategoria = Categoria.categoriaSelecionada().noticias;
            noticiasDaCategoria.addData(noticia);

            if ( noticiasDaCategoria.tamanho == 1 ){

                noticiaAtual = noticiasDaCategoria.begin;
                indexNoticiaAtual = 0;

            }

            return noticia;

        }

        static Noticias noticiaSelecionada(){
            return (Noticias) noticiaAtual.data;
        }


        static void proximaNoticia(){

            Lista noticiasDaCategoria = Categoria.categoriaSelecionada().noticias;
            noticiasDaCategoria.isEmpty();
            noticiaAtual = noticiaAtual.next;
            indexNoticiaAtual = (indexNoticiaAtual + 1) % noticiasDaCategoria.tamanho;
            System.out.println("Noticia (" + indexNoticiaAtual + "):" + noticiaAtual.data);

        }

        static void anteriorNoticia(){

            Lista noticiasDaCategoria = Categoria.categoriaSelecionada().noticias;
            noticiasDaCategoria.isEmpty();
            noticiaAtual = noticiaAtual.back;
            indexNoticiaAtual = (indexNoticiaAtual - 1 + noticiasDaCategoria.tamanho) % noticiasDaCategoria.tamanho;
            System.out.println("Noticia (" + indexNoticiaAtual + "):" + noticiaAtual.data);
        }

        static void reiniciar (Lista noticiasDaCategoria){

            if (noticiasDaCategoria.begin == null){
                noticiaAtual = null;
                indexNoticiaAtual = -1;
                Imagens.reiniciar(null);
            } else {
                noticiaAtual = noticiasDaCategoria.begin;
                indexNoticiaAtual = 0;
                Imagens.reiniciar (noticiaSelecionada().imagens);
            }
        }
}

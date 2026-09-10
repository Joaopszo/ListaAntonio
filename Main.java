package projetosimples;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {

        SistemaNoticias sistema = new SistemaNoticias();

        int opcao;

        do {

            exibirStatus(sistema);
            exibirMenu();
            opcao = lerOpcao();
            executarOpcao(opcao);

        } while (opcao != 0);

        System.out.println("Encerrou");

    }

    private static void exibirMenu(){

        System.out.println("\n===== MENU =====");
        System.out.println(" 1 - Adicionar categoria");
        System.out.println(" 2 - Próxima categoria");
        System.out.println(" 3 - Categoria anterior");
        System.out.println(" 4 - Adicionar notícia (na categoria atual)");
        System.out.println(" 5 - Próxima notícia");
        System.out.println(" 6 - Notícia anterior");
        System.out.println(" 7 - Adicionar imagem (na notícia atual)");
        System.out.println(" 8 - Próxima imagem");
        System.out.println(" 9 - Imagem anterior");
        System.out.println(" 0 - Sair");
        System.out.print("Escolha: ");

    }


    private static void exibirStatus( SistemaNoticias sistema ) {

        System.out.println("\n--- Status atual ---");

        if (sistema.categoriaAtual == 0) {
            System.out.println("Nenhuma categoria cadastrada ainda.");
            return;
        }


        System.out.println("Categoria [" + Categoria.indexCategoriaAtual + "]: "
                + Categoria.categoriaSelecionada().nome);

        if (Noticias.noticiaAtual == null) {
            System.out.println("  (sem noticias nesta categoria)");
            return;
        }

        System.out.println("  Noticia [" + Noticias.indexNoticiaAtual + "]: "
                + Noticias.noticiaSelecionada().titulo);

        if (Imagens.imagemAtual == null) {
            System.out.println("    (sem imagens nesta noticia)");
            return;
        }

        System.out.println("    Imagem [" + Imagens.indexImagemAtual + "]: "
                + Imagens.imagemAtual.data);

    }

}
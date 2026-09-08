package ProjetoSimples;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {

        int opcao;

        do {
            exibirStatus();
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

    private static int lerOpcao(){
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void executarOpcao(int opcao) {
        try {
            switch (opcao) {
                case 1 -> adicionarCategoria();
                case 2 -> Categoria.proximaCategoria();
                case 3 -> Categoria.anteriorCategoria();
                case 4 -> adicionarNoticia();
                case 5 -> Noticias.proximaNoticia();
                case 6 -> Noticias.anteriorNoticia();
                case 7 -> adicionarImagem();
                case 8 -> Imagens.proximaImagem();
                case 9 -> Imagens.anteriorImagem();
                case 0 -> {} // sair, tratado no loop principal
                default -> System.out.println("Opção inválida.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Ação não disponível agora: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ação não disponível agora: nada selecionado ainda neste nível.");
        }
    }

    private static void adicionarCategoria() {
        System.out.print("Nome da categoria: ");
        String nome = scanner.nextLine().trim();
        Categoria.addCategoria(nome);
        System.out.println("Categoria \"" + nome + "\" adicionada.");
    }

    private static void adicionarNoticia() {
        System.out.print("Título da notícia: ");
        String titulo = scanner.nextLine().trim();
        Noticias.addNoticia(titulo);
        System.out.println("Notícia \"" + titulo + "\" adicionada.");
    }

    private static void adicionarImagem() {
        System.out.print("Caminho/nome da imagem: ");
        String caminho = scanner.nextLine().trim();
        Imagens.addImagem(caminho);
        System.out.println("Imagem \"" + caminho + "\" adicionada.");
    }

    private static void exibirStatus() {
        System.out.println("\n--- Status atual ---");

        if (Categoria.categoriaAtual == null) {
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

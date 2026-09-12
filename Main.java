package ProjetoSimples;

import ProjetoSimples.Categoria;
import ProjetoSimples.Noticia;
import ProjetoSimples.SistemaNoticias;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {

        SistemaNoticias sistema = new SistemaNoticias();
        Categoria noticiasSistema = new Categoria("lista padrão de notícias");
        Noticia imagensSistema = new Noticia("lista padrão de imagens");

        sistema.addCategoria(noticiasSistema);
        noticiasSistema.addNoticia(imagensSistema);

        statusAtual(sistema, noticiasSistema, imagensSistema);


    }

    static void statusAtual(SistemaNoticias sistema, Categoria noticiasSistema, Noticia imagensSistema ){

        System.out.println("=== STATUS DO SISTEMA ===" );

        if ( sistema == null ){

            System.out.println("A lista de categorias está vazia");

        } else {

            System.out.println("O sistema possui " + sistema.retornarTamanho()+ " categorias");

        }

        if ( noticiasSistema == null ){

            System.out.println("A lista de noticias está vazia");

        } else {

            System.out.println("O sistema possui " + noticiasSistema.retornarTamanho() + " noticias");

        }

        if ( imagensSistema == null ){

            System.out.println("A lista de imagens está vazia");

        } else {

            System.out.println("O sistema possui " + imagensSistema.retornarTamanho() + " imagens");

        }

    }

    void exibirMenu(){

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

}
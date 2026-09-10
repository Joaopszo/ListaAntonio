package projetosimples;

public class Main {

    public static void main( String[] args ){

        Categoria esportes = new Categoria();
        Noticia neymar = new Noticia();

        esportes.addNoticia(neymar);
        neymar.addImagem(new Imagem("Neymar caiu"));

        System.out.println(neymar.imagemAtual());

    }

}

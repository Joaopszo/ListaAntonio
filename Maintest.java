package projetosimples;

public class Maintest {
    static void main() {

        SistemaNoticias sistema = new SistemaNoticias();

        sistema.addCategoria(new Categoria("oi"));
        sistema.addCategoria(new Categoria("ola"));
        sistema.addCategoria(new Categoria("alo"));

        System.out.println(sistema.categoriaAtual());



    }
}

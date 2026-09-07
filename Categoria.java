package ProjetoSimples;

public class Categoria {

    Lista noticias;
    Node categoriaAtual;

    void proximaCategoria(){

        categoriaAtual=categoriaAtual.next;
        System.out.println(categoriaAtual.data);

    }

    void anteriorCategoria(){

        categoriaAtual=categoriaAtual.back;
        System.out.println(categoriaAtual.data);

    }

}

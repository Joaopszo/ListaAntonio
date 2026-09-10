package projetosimples;

public class Imagem {

    private Object dado;

    protected Imagem ( Object dado ){

        this.dado = dado;

    }

    protected Object getDado (){

        return this.dado;

    }

    @Override

    public String toString (){

        return String.valueOf(dado);

    }

}

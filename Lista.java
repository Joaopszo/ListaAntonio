package ProjetoSimples;

class Lista {

    Node begin;
    Node end;
    Node atual;

    void addData ( Object data ){

        Node novo = new Node();
        novo.data = data;

        if ( begin == null ){

            begin = novo;
            begin.next = begin;
            begin.back = begin;
            end = begin;

        } else {

            end.next = novo;
            novo.back = end;
            novo.next = begin;
            begin.back = novo;
            end = novo;

        }
    }

    void searchElement(){



    }

}

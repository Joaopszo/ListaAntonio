package projetosimples;

class Lista {

    Node begin;
    Node end;

    void addData (Object data){

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

    Object procurarData( int index ){

        Node aux = this.begin;
        int contador = 0;

        if ( index < 0 ){

            while (contador != index) {

                aux = aux.back;
                contador--;

            }

        } else {

            while (contador != index) {

                aux = aux.next;
                contador++;

            }

        }

        return aux.data;

    }
}

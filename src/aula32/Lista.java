package aula32;

public class Lista<T>{
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade){
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public Lista(){
        elementos = (T[]) new Object[10];
        tamanho = 0;
    }

    private void aumentaCapacidade(){
        if(tamanho==elementos.length){
            T[] aux = (T[]) new Object[tamanho*2];
//            System.arraycopy(elementos,0,aux,0,elementos.length);
            for(int i=0; i<elementos.length;i++){
                aux[i] = elementos[i];
            }
            elementos = aux;
        }
    }

    public void adiciona(T elemento){
        aumentaCapacidade();
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void adiciona(T elemento, int posicao){
        if (posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição "+posicao+" é inválida.");
        for(int i = tamanho - 1; i >= posicao; i--){
            elementos[i+1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    public T remove(int posicao){
        if (posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição "+posicao+" é inválida.");
        T copia = elementos[posicao];
        for(int i = posicao; i < tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
        return copia;
    }

    public boolean remove(T elemento){
        int posicao = -1;
        for(int i = 0; i < tamanho; i++){
            if(elementos[i].equals(elemento))
                posicao = i;
        }
        if(posicao == -1){
            return false;
        }else{
            for(int i = posicao; i < tamanho-1; i++){
                elementos[i] = elementos[i+1];
            }
            tamanho--;
            return true;
        }

    };


    public int posicaoDe(T elemento){
        for(int i=0; i<tamanho;i++) {
            if (elementos[i].equals(elemento))
                return i;
        }
        return -1;
    }

    public T obeter(int posicao){
        if (posicao < 0 || posicao >= tamanho)
           throw new IllegalArgumentException("Posição "+posicao+" é inválida.");
        return elementos[posicao];
    }

    public boolean contem(T elemento){
        for(int i=0; i<tamanho;i++) {
            if (elementos[i].equals(elemento))
                return true;
        }
        return false;
    };

    public void limpar(){
        tamanho = 0;
    };

    public int tamanho(){
        return tamanho;
    }

    public boolean estaVazia(){
        if(tamanho == 0){
            return true;
        }else{
            return false;
        }
    };

    /**
     * Método que retorna a Lista em formato String.
     * @return se a lista estiver vazia = [], se a lista possuir elemento retorna [1, 2, 3, 4, ...]
     */
    @Override
    public String toString(){
        String retorno = "[";
        if ( tamanho > 0 ) {
            for ( int i = 0; i < tamanho - 1; i++ ){
                retorno += elementos[i] + ", ";
            }
            retorno += elementos[tamanho-1];
        }
        return retorno + "]";
    }

}

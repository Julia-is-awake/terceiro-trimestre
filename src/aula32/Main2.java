package aula32;

public class Main2 {
    public static void main(String[] args) {
        Lista<String> l1 = new Lista();
        l1.adiciona("A");
        l1.adiciona("B");
        l1.adiciona("C");
        l1.adiciona("D");
        l1.adiciona("E");
        l1.adiciona("F");
        l1.adiciona("G");
        l1.adiciona("H");
        System.out.println(l1);
        System.out.println(l1.remove("B"));
        System.out.println(l1);
        System.out.println("A array contém 'B' "+l1.contem("B"));
        System.out.println("A array contém 'A' "+l1.contem("A"));
        System.out.println("Tamanho: "+l1.tamanho());
        l1.limpar();
        System.out.println("Está vazia: "+l1.estaVazia());
        System.out.println("Tamanho: "+l1.tamanho());
        System.out.println(l1);
        l1.adiciona("1");
        l1.adiciona("2");
        l1.adiciona("3");
        System.out.println(l1);
        System.out.println("Tamanho: "+l1.tamanho());
        System.out.println("Está vazia: "+l1.estaVazia());
    }
}

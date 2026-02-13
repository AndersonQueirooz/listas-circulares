public class Main {
    public static void main(String[] args) {
        ListaCircular<String> lista = new ListaCircular<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
    }

}

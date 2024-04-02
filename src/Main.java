import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {

        long inicioA = System.currentTimeMillis();
        Collection<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            lista.add(i);
        }
        System.out.println(lista);
        long fimA = System.currentTimeMillis();
        long tempoA = fimA - inicioA;

        long inicioH = System.currentTimeMillis();
        Collection<Integer> lista2 = new HashSet<Integer>();
        for (int i = 1; i <= 1000000; i++) {
            lista2.add(i);
        }
        System.out.println(lista2);
        long fimH = System.currentTimeMillis();
        long tempoH = fimH - inicioH;

        long inicioL = System.currentTimeMillis();
        Collection<Integer> lista3 = new LinkedList<>();
        for (int i = 1; i <= 1000000; i++) {
            lista3.add(i);
        }
        System.out.println(lista3);
        long fimL = System.currentTimeMillis();
        long tempoL = fimL - inicioL;

        long inicioQ = System.currentTimeMillis();
        Queue<Integer> fila = new ConcurrentLinkedQueue<>();
        for (int i = 1; i <= 1000000; i++) {
            fila.add(i);
        }
        System.out.println(lista3);
        long fimQ = System.currentTimeMillis();
        long tempoQ = fimQ - inicioQ;


        System.out.println("ArrayList(ms): "+tempoA); //acesso aleatorio - mais recurso/mais rapido
        System.out.println("HashSet(ms): "+tempoH); //acesso aleatorio - mais recurso/mais rapido
        System.out.println("LinkedList(ms): "+tempoL); //acesso sequencial - menos recurso/mais lento
        System.out.println("Queue(ms): "+tempoQ); //acesso sequencial - menos recurso/mais lento


    }
}
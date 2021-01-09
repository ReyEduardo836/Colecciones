package rey.eduardo.coleccion;

import java.util.Scanner;
import rey.eduardo.interfaz.Interfaz;

public class Coleccion implements Interfaz{
    private Nodo cabeza = null;

    private class Nodo{
        int numero;
        Nodo siguiente = null;

        public Nodo(int numero){
            this.numero = numero;
        }
    }

    @Override
    public void addFirst(int num) {
        Nodo nodo = new Nodo(num);
        
        if(cabeza == null){
            cabeza = nodo;
        }else{
            Nodo a = cabeza;
            cabeza = nodo;
            cabeza.siguiente = a; 
        }
    }

    @Override
    public void addLast(int num) {
        Nodo nodo = new Nodo(num);
        Nodo puntero = cabeza;
         
        if(cabeza == null){
            cabeza = nodo;
        }else{
            while(puntero.siguiente != null){
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nodo;
        }        
    }

    @Override
    public void addMed(int num, int place) {
        if(place == 1){
            addFirst(num);
            return;
        }
        if(cabeza != null){
            Nodo nodo = new Nodo(num);
            Nodo puntero = cabeza;
            int contador = 0;

            while(contador < (place - 2)){
                puntero = puntero.siguiente;
                contador++;
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
        }
    }

    @Override
    public void removeFirst() {
         if(cabeza != null){
             Nodo tmp = cabeza;
             cabeza = cabeza.siguiente;
             tmp.siguiente = null;
         }
    }

    @Override
    public void removeLast() {
        if(cabeza != null){
            Nodo puntero = cabeza;    
            while(puntero.siguiente.siguiente != null){
                puntero = puntero.siguiente;
            }
            puntero.siguiente = null;
        }
    }

    @Override
    public void removeMed(int place) {
        if(place == 1){
            removeFirst();
            return;
        }
        if(cabeza != null){
            Nodo puntero = cabeza;
            int contador = 0;

            while(contador < (place - 2)){
                puntero = puntero.siguiente;
                contador++;
           }
            Nodo tmp = puntero.siguiente;
            puntero.siguiente = tmp.siguiente;
            tmp.siguiente = null;
        }
    }

    public void mostrar(){
        Nodo puntero = cabeza;

        while(puntero != null){
            System.out.print(puntero.numero+"\t");
            puntero = puntero.siguiente;
        }
        System.out.println();
    }

    public void quiereMostrar(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("quiere ver su coleccion? (si / no)");
        String ans = scan.next().toLowerCase();

        if(ans.equals("si")){
            mostrar();
        }
        
    }


}

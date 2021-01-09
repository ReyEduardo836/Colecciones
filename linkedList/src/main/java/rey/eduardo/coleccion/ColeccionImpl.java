package rey.eduardo.coleccion;

import rey.eduardo.coleccion.Coleccion;
import rey.eduardo.interfaz.InterfazColeccionImpl;
import java.util.Scanner;

public class ColeccionImpl implements InterfazColeccionImpl{
    Coleccion col = new Coleccion();
    Scanner scan = new Scanner(System.in);

    @Override
    public void agregarPrimero() {
        System.out.println("Escriba el numero: ");
        int a = scan.nextInt();

        col.addFirst(a);
        col.quiereMostrar();
    }

    @Override
    public void agregarMed() {
        System.out.println("Escriba el numero: ");
        int a = scan.nextInt();

        System.out.println("Escriba el lugar que quiere poner el numero: ");
        int b = scan.nextInt();

        col.addMed(a, b);
        col.quiereMostrar();
    }

    @Override
    public void agregarUltimo() {
        System.out.println("Escriba el numero: ");
        int a = scan.nextInt();

        col.addLast(a);
        col.quiereMostrar();

    }

    @Override
    public void eliminarPrimero() {
        col.removeFirst();

        col.quiereMostrar();
    }

    @Override
    public void eliminarMed() {
        System.out.println("Escriba el lugar que quiere eliminar: ");
        int a = scan.nextInt();
        
        col.removeMed(a);
        col.quiereMostrar();

    }

    @Override
    public void eliminarUltimo() {
        col.removeLast();
        col.quiereMostrar();

    }

    public void mostrarElementos(){
        col.mostrar();
    }


}

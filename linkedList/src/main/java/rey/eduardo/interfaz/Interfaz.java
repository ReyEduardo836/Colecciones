package rey.eduardo.interfaz;

public interface Interfaz {
    
    public void addFirst(int num);
    public void addLast(int num);
    public void addMed(int num, int place);

    public void removeFirst();
    public void removeLast();
    public void removeMed(int place);

    public void mostrar();
    public void quiereMostrar();

}
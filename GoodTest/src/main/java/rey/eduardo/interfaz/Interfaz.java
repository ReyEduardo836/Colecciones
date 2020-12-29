package rey.eduardo.interfaz;

public interface Interfaz {
    public int[] addFirst(int[] vector, int value);
    public int[] addLast(int[] vector, int value);
    public int[] addMed(int[] vector, int value, int place);
    public int[] removeFirst(int[] vector);
    public int[] removeLast(int[] vector);
    public int[] removeMed(int[] vector, int pos);
}
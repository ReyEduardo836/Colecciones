package rey.eduardo.collection;

import java.util.*;
import rey.eduardo.interfaz.*;

public class Collection implements Interfaz{
    Scanner scan = new Scanner(System.in);
    private int col[] = null;

	@Override
	public int[] addLast(int[] vector, int value) {
		if(vector==null){
            vector = new int[1];
            vector[0] = value;
            return vector;
        }

        int tmp[] = Arrays.copyOf(vector, vector.length+1);
        tmp[tmp.length-1]= value;

        return tmp;
    }

    @Override
    public int[] addFirst(int[] vector, int value) {
        vector = addLast(vector, value); 
        int comodin, comodin1=0;
        for(int i = 0; i<vector.length; i++){
            comodin=vector[i];
            
            if(i==0){
                vector[0]=value;
            }else{
                vector[i]= comodin1;
            }
            comodin1=comodin;
        }
        return vector;
    }

    @Override
    public int[] addMed(int[] vector, int value, int place) {
        vector = addLast(vector, value);
        int comodin, comodin1=0;
        for(int i = 0; i<vector.length; i++){
            if(i>=(place-1)){
                comodin = vector[i];
                if(i==(place-1)){
                    vector[i]=value;
                }else{
                    vector[i]=comodin1;
                }
                comodin1=comodin;
            }
        }
        return vector;
    }

    @Override
    public int[] removeLast(int[] vector) {
        int tmp[] = new int[vector.length-1];
        for(int i = 0; i<tmp.length; i++){
            
            tmp[i]=vector[i];
            
        }
        return tmp;
    }

    @Override
    public int[] removeFirst(int[] vector) {
        int tmp[] = new int[vector.length-1];
        vector[0]=-100;
        for(int i = 0; i<vector.length; i++){
            if(vector[i]!=(-100)){
                tmp[i-1]=vector[i];
            }
        }
        return tmp;
    }

    @Override
    public int[] removeMed(int[] vector, int pos) {
        boolean flag = false;
        int tmp[]= new int[vector.length-1];
        vector[pos-1]=-100;
        for(int i = 0; i<tmp.length; i++){
            if(vector[i]==-100){
                flag = true;
            }
            if(flag == false){
                tmp[i]=vector[i];
            }else if(flag==true){
                tmp[i]=vector[i+1];
            }
            
        }
        return tmp;
    }

    public void mostrarArray(){
        System.out.println("tu array: ");
        for(int i =0; i<col.length;i++){
            System.out.print(col[i]+"\t");
        }
        System.out.println();
    }

    public void verArray(){
        System.out.println("quiere ver su array? (si/no)");
        String a = scan.next().toLowerCase();
        if(a.equals("si")){
            mostrarArray();
        }
    }

    public void crearArray(){
        String p;

        do{
            System.out.println("escriba el dato: ");
            int num = scan.nextInt();
            col = addLast(col, num);
            System.out.println("quiere seguir escribiendo datos (si/no): ");
            p = scan.next().toLowerCase();
        }while(p.equals("si"));
    }

    public void agregarFinal(){
        System.out.println("escriba el dato: ");
        int num = scan.nextInt();
        col = addLast(col, num);

        verArray();
    }

    public void agregarMedio(){
        System.out.println("escriba el dato: ");
        int num = scan.nextInt();
        System.out.println("escriba el lugar que quiere poner el dato ingresado: ");
        int place = scan.nextInt();
        col = addMed(col, num, place);
        
        verArray();
    }
          
    public void agregarComienzo(){
        System.out.println("escriba el dato: ");
        int num = scan.nextInt();
        col = addFirst(col, num);
        
        verArray();
    }

    public void eliminarFinal(){
        col = removeLast(col);

        verArray();
    }

    public void eliminarPrimero(){
        col = removeFirst(col);

        verArray();
    }

    public void eliminarMedio(){
        System.out.println("escriba el lugar que quiere eliminar: ");
        int a = scan.nextInt();

        col = removeMed(col, a);

        verArray();
    }
}

package rey.eduardo.main;

import rey.eduardo.collection.Collection;
import java.util.Scanner;

/**
 * Hello world!
 *
*/
public class App 
{
    public static void main( String[] args ){
        Collection coleccion = new Collection();
        Scanner scan = new Scanner(System.in);
        int opc;
        

        do{
            menu();
            opc = scan.nextInt();
            
            switch (opc) {
                case 1:{
                    coleccion.crearArray();
                    break;
                }
                case 2:{
                    coleccion.mostrarArray();
                    break;
                }
                case 3:{
                    int a;

                    do{
                        submenuA();
                        a=scan.nextInt();

                        switch(a){
                            case 1:{
                                coleccion.agregarFinal();
                                break;
                            }
                            case 2:{
                                coleccion.agregarComienzo();
                                break;
                            }
                            case 3:{
                                coleccion.agregarMedio();
                                break;
                            }
                            case 4:{
                                System.out.println("menu principal...");
                                break;
                            }
                            default:{
                                System.out.println("no existe esa opcion...");
                                break;
                            }
                        }
                    }while(a!=4);
                    break;
                }
                case 4:{
                    int b;
                    do{
                        submenuB();
                        b=scan.nextInt();

                        switch(b){
                            case 1:{
                                coleccion.eliminarFinal();
                                break;
                            }
                            case 2:{
                                coleccion.eliminarPrimero();
                                break;
                            }
                            case 3:{
                                coleccion.eliminarMedio();
                                break;
                            }
                            case 4:{
                                System.out.println("regresando al menu...");
                                break;
                            }
                            default:{
                                System.out.println("no existe esa opcion...");
                                break;
                            }
                        }


                    }while(b!=4);

                    break;
                }
                case 5:{
                    System.out.println("SALIENDO...");
                    break;
                }
                default:{
                    System.out.println("no existe esa opcion...");
                    break;
                }
            }
        }while(opc!=5);

        scan.close();
    }

    public static void menu(){
        System.out.print("1. crear nuevo array\n2. mostrar array\n3. agregar datos\n4. eliminar datos\n5. salir\n=> ");
    }

    public static void submenuA(){
        System.out.print("1. agregar al final\n2. agregar al comienzo\n3. agregar en alguna posicion\n4.regresar al menu principal\n=>");
    }

    public static void submenuB(){
        System.out.print("1. eliminar el final\n2. eliinar el comienzo\n3. eliminar en alguna posicion\n4. regresar al menu principal\n=>");
    }
}
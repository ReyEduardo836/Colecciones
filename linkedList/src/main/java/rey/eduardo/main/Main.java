package rey.eduardo.main;

import rey.eduardo.coleccion.ColeccionImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ColeccionImpl c = new ColeccionImpl();
        Scanner scan = new Scanner(System.in);
        int opc;

        do{
            menu();
            opc = scan.nextInt();
        
            switch(opc){
                case 1:{
                    int a;
                    do{
                        menuA();
                        a=scan.nextInt();

                        switch(a){
                            case 1:{
                                c.agregarUltimo();
                                break;
                            }
                            case 2:{
                                c.agregarMed();
                                break;
                            }
                            case 3:{
                                c.agregarPrimero();
                                break;
                            }
                            case 4:{
                                System.out.println("Menu principal...");
                                break;
                            }
                            default:{
                                System.out.println("Esa opcion no existe...");
                            }
                        }
                    }while(a != 4);
                    break;
                }
                case 2:{
                    int b;

                    do{
                        menuB();
                        b=scan.nextInt();

                        switch(b){
                            case 1:{
                                c.eliminarUltimo();
                                break;
                            }
                            case 2:{
                                c.eliminarMed();
                                break;
                            }
                            case 3:{
                                c.eliminarPrimero();
                                break;
                            }
                            case 4:{
                                System.out.println("Menu principal...");
                            }
                            default:{
                                System.out.println("Esa opcion no existe...");
                            }
                        }
                    }while(b!=4);
                    break;
                }
                case 3:{
                    c.mostrarElementos();
                    break;
                }
                case 4:{
                    System.out.println("Saliendo...");
                    break;
                }
                default:{
                    System.out.println("Esta opcion no existe...");
                    break;
                }
            }
        }while(opc != 4);
        
    }

    static void menu(){
        System.out.print("1. agregar datos\n2. eliminar datos\n3. mostrar datos\n4. salir\n=> ");
    }

    static void menuA(){
        System.out.print("1. agregar al final\n2. agregar en alguna posicion\n3. agregar al comienzo\n4. salir al menu principal\n=> ");
    }

    static void menuB(){
        System.out.print("1. eliminar al final\n2. eliminar en algun lugar\n3. eliminar el primer elemento\n4. salir al menu principal\n=> ");
    } 
}

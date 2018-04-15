
package pv2018tpdelgado.ponce;
import java.util.Date;
import java.util.Scanner;
import static pv2018tpdelgado.ponce.Punto1.menu1;
import static pv2018tpdelgado.ponce.Punto2.menu2;
import static pv2018tpdelgado.ponce.Punto3.menu3;

public class PV2018TPDelgadoPonce {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        int opc;
        Scanner ing =new Scanner(System.in);
        System.out.println("--------Menu---------");
        System.out.println("1.Iniciar Punto 1 de Cadenas");
        System.out.println("2.Iniciar Punto 2 de Fechas");
        System.out.println("3.Iniciar Punto 3 de 100 dias despues");
        System.out.println("4.Salir del programa");
        opc=ing.nextInt();
        switch (opc){
            case 1:
                menu1();break;
            case 2:
                menu2();break;
            case 3:
                menu3();break;
            case 4:
                System.out.println("Programa Finalizado");
                
        }         
                
            
        }
        
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadenas;
import java.util.Scanner;

public class Cadena {
    private String pal;
    int lar;
    
    
   public void ingresarPalabra (){
       Scanner sc =new Scanner(System.in);
       System.out.println("Ingrese palabra");
       pal=sc.next();
   }
   
  public void contarCant(){
      int vocales=0;
      lar= pal.length();
      for (int i = 0; i < lar; i++) {
          if (pal.charAt(i) == 'a' || pal.charAt(i) == 'e' || pal.charAt(i) == 'i' || pal.charAt(i) == 'o' || pal.charAt(i) == 'u'){
             vocales++;
              }
      }
      System.out.println("Hay: "+vocales+" vocales");

  }
  public void invertirCad(){
     String inv="";
      for (int i = lar-1; i >= 0; i--) {
        inv = inv + pal.charAt(i);
      }
      System.out.println("La cadena originarl es: "+pal);
      System.out.println("La cadena invertida es: "+inv);
  }
  public void buscarvoc(){
      String voc;
      char v;
      int cont=0;
      Scanner sc =new Scanner(System.in);
      System.out.println("Ingrese la vocal que quiere buscar");
      voc=sc.next();
      v=voc.charAt(0);
      for (int i = 0; i < pal.length(); i++) {
          if (pal.charAt(i) == v ){
              cont++;
          }
      }
          if (cont > 0) {
              System.out.println("El caracter: "+v+" Si se encuentra en "+pal);
              System.out.println("Se repite "+cont+" veces");
          }
          else{
              System.out.println("El caracter: "+v+" no se encientra en "+pal);
              
                  }  
          
                  
      
  }
      
  

  

 
  
    
    public String getPal() {
        return pal;
    }

    /**
     * @param pal the pal to set
     */
    public void setPal(String pal) {
        this.pal = pal;
    }
    
   
}


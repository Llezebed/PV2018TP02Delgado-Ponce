/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
    private String dia;
    private String mes;
    private String año;
    private String fecha;

    public Fecha() {
    }
    public void devolverEdadEnSemanas(){
        int edad,d,m,y;
 
        String fech;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca su fecha se nacimiento");
        fech=sc.next();
        setFecha(fech);
        separarFecha();
         
        y=Integer.parseInt(getAño());
       
        
    }
    public int calcularsem(int dia,int mes,int anio){
      int ed=0;
      int a;
      int b;
      int c;
      
         Calendar fecha = new GregorianCalendar();
        
         int anioac = fecha.get(Calendar.YEAR);
         System.out.println( fecha.getWeekYear());
         
         int mesac = fecha.get(Calendar.MONTH);
         int diaac = fecha.get(Calendar.DATE);
         
         
      return ed;
    }
    
    
    public void recibirFecha(String unaFecha){
        setFecha(unaFecha); 
    }
    public void separarFecha(){
        setDia(getFecha().substring(0, 2));
        setMes(getFecha().substring(3, 5));//cortando mes dia y año respectivamente
        setAño(getFecha().substring(6, 8));
    }
    public String devolverEstacion(){
        String estacion="";
        int opc=0;
        int opcd=0;
        opc=Integer.parseInt(getMes());
        opcd=Integer.parseInt(getDia());
        switch (opc){
            case 1:
                estacion="verano";
            case 2:
                  estacion="verano";  
            case 3:
                if (opcd <21){
                   estacion="verano";}
                   else {
                   estacion="otoño";
                }
            case 4:
                estacion="otoño";
            case 5:
                estacion="otoño";
            case 6:
                if (opcd <21){
                   estacion="otoño";}
                   else {
                   estacion="invierno";
                }
            case 7:
                estacion="invierno";
            case 8:
                estacion="invierno";
            case 9:
                   if (opcd <21){
                   estacion="invierno";}
                   else {
                   estacion="primavera";
                }
            case 10: 
                estacion="primavera";
            case 11:
                estacion="primavera";
               if (opcd <21){
                   estacion="primavera";}
                   else {
                   estacion="verano";
                }    
    

                
                
                    
                    }                
        return estacion;
    }
   
 
        public  void fechar100() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca día, mes y año");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int year = sc.nextInt();
        GregorianCalendar fechad = new GregorianCalendar(year, mes-1, dia);
        fechad.add(Calendar.DATE, 100);
        Date fechaDate = fechad.getTime();        
        SimpleDateFormat formato = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
        System.out.println("La fecha despues de 100 dias es: " + formato.format(fechaDate));
         }


    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public String getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

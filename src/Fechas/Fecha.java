/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas;
import java.text.DateFormat;
import java.text.ParseException;
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
    
    public void diaaSemanas() throws ParseException{

        Scanner d = new Scanner(System.in);
        System.out.println("ingrese fecha de nacimiento dd/MM/yyyy:");
        fecha = d.nextLine();
        System.out.println("fecha ingresada:" + pasarstringadate(fecha));
        Date hol;
        hol = pasarstringadate(fecha);
        Date datee = new Date();
        System.out.println("fecha actual:" +datee);
        System.out.print("cantidad de semanas entre las fechas:" +cantidad(datee,hol));
    }
    private int cantidad(Date ac, Date nac){
    int semana=(int) ((ac.getTime()-nac.getTime())/604800000);//cantidad de milisegundos en una semana
    return semana;
    }
        public Date pasarstringadate(String fechaa){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date fechadevuelta = formato.parse(fechaa);
            return fechadevuelta;}
        catch(ParseException a)
        {
        }
        return null;
    }
          public void MostrarCantDomingos() throws ParseException{
              Scanner sc =new Scanner(System.in);  
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Ingrese FechIn, con Formato dd/MM/yyyy");    
            String fechaux = sc.next();
           Date fecha1 = df.parse(fechaux);
            System.out.println("Ingrese FechFin, con Formato dd/MM/yyyy");    
            String fechafin = sc.next();
           Date fecha2 =df.parse(fechafin);    
        int domingos = 0; 
        int nrodia = 1;  //1 domingo 2 lunes 
        int diferencia = getDiferencaDias(fecha1, fecha2);
        Date fcurso = fecha1;
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(fecha1);
        for(int i = 1; i<= diferencia  ; i++){
            int dia = cal.get(Calendar.DAY_OF_WEEK);
            if(dia == 1)
            {
                domingos++;
            }
            cal.add(Calendar.DAY_OF_YEAR, 1); 
        }
        
        System.out.println(domingos);
    }
    public void DevolverDiferencaDias(Date fechaInicial, Date fechaFinal){
	int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
	System.out.println("Hay "+dias+" dias de diferencia");
    }
    
    public int getDiferencaDias(Date fechaInicial, Date fechaFinal){
	int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
	return dias;
    }
    public void devolverdif() throws ParseException{
        
       Scanner sc =new Scanner(System.in);  
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Ingrese FechIn, con Formato dd/MM/yyyy");    
            String fechaux = sc.next();
           Date fechaInicial = df.parse(fechaux);
            System.out.println("Ingrese FechFin, con Formato dd/MM/yyyy");    
            String fechaFin = sc.next();
           Date fechaFinal =df.parse(fechaFin);
            Fecha d = new Fecha();
          d.DevolverDiferencaDias(fechaInicial, fechaFinal);
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

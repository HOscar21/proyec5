
package proyecto5.unidad1;
import java.util.*;
public class Proyecto5Unidad1 {
public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
int d,m;
System.out.println("Zignos del Zodiaco");
System.out.println("Ingresa Tu Fecha De Nacimiento");
d=leer.nextInt();
System.out.println("Ingresa tu mes de nacimiento");
m=leer.nextInt();
if(d>=22&&m==12||d<=20&&m==1){
     System.out.println("CAPRICORNIO");   
     }
if(d>=21&& m==1||d<=19&&m==2){
    System.out.println("ACUARIO");
}
if(d>=20&& m==2||d<=20&&m==3){
    System.out.println("PISCIS");
}
if(d>=21&& m==3||d<=19&&m==4){
    System.out.println("ARIES");
}
if(d>=20&& m==4||d<=20&&m==5){
    System.out.println("TAURO");
}
if(d>=21&& m==5||d<=21&&m==6){
    System.out.println("GEMINIS");
}
    }
    
}

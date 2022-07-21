/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Leccion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    String vehiculo;
    float precio;
    String procedencia;
    String modelo;
    
        System.out.println("Ingrese el nombre del vehiculo");
        vehiculo= leer.nextLine();
        
        System.out.println("Ingrese el nombre del vehiculo");
        precio= leer.nextFloat();
        
          if(precio>0){
              System.out.println("Ingrese la proceencia del vehiculo");
              procedencia= leer.nextLine();
              
          }else{
              System.out.println("Datos erroneos, Proceso finalizado");
          }

    
    }
    
}

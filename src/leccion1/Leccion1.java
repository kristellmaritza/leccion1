/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Leccion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    String vehiculo;
    double precio;
    String procedencia;
    String modelo;
    
        
        vehiculo= JOptionPane.showInputDialog("Ingrese el nombre del vehiculo");
        
        precio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nombre del vehiculo"));
        
          if(precio>0){
              procedencia= JOptionPane.showInputDialog("Ingrese la proceencia del vehiculo");
              if (procedencia== "EEUU" || procedencia== "JAPON") {
                  modelo= JOptionPane.showInputDialog("Ingrese el modelo del vehiculo");
                  if (procedencia== "2021" || procedencia== "2022") {
                      JOptionPane.showMessageDialog(null,"Vehiculo :" +vehiculo+ " Precio: "+ precio+ "procedencia: " +procedencia+ "modelo: " +modelo);
                      
                  }
              }else{
                  JOptionPane.showMessageDialog(null,"Datos erroneos, Proceso finalizado");
              }
              
          }else{
              JOptionPane.showMessageDialog(null,"Datos erroneos, Proceso finalizado");
              
          }

    
    }
    
}

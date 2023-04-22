/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador1;

import Modelo1.Gatos;
import Modelo1.Logica;
import Modelo1.Mascotas;
import Modelo1.Perros;
import Vista1.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import vista1.Vista;
/**
 *
 * @author andru
 */

public class Controlador implements ActionListener {
  
  private Inicio view;
  private Logica model;

public Controlador(Inicio view, Logica model){
  this.view = view;
  this.model = model;
   
}  
public void iniciar(){
  view.setTitle("Veterinaria");
  view.pack();
  view.setLocationRelativeTo(null);
   }

   @Override
public void actionPerformed(ActionEvent e) {
     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo1;

import Modelo1.Cats;
import java.util.ArrayList;

/**
 *
 * @author andru
 */
public class Logica {
    //Se crean los ArrayList para gato y perro
    public ArrayList dogs = new ArrayList();
    public ArrayList cats = new ArrayList();
    //de declara la variable contador
    int cont;

    public Logica() {
    //Ejemplos de ingreso, visualizacion en la tabla
    dogs.add(new Dogs("Ejemplo1", "Ejemplo1", "Ejemplo1", contador(00), 00));
    cats.add(new Cats("Ejemplo1", "Ejemplo1", "Ejemplo1", contador(00), true));
    }
     
    // proceso para guardar las edades  
    public int contador(int edad) {
        cont += edad;
        setCont(cont);
        return edad;
    }
    //encapsulamiento
    public int getCont() {
        return cont;
    }
    public void setCont(int cont) {
        this.cont = cont;
    }
    public String imprimir() {
        return null;
    }
}

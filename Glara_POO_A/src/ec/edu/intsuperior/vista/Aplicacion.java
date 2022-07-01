/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona ();
        Persona p2 = new Persona ();
        Persona p3 = new Persona ();
        Persona p4 = new Persona ();
        System.out.println("ingresa la cedula de la persona 1:  ");
       p1.setCi(leer.next());
        System.out.println("ingresa el nombre");
       p1.setNombre(leer.next());
        System.out.println("ingresa el apellido");
        p1.setApellido(leer.next());
        System.out.println("ingresa el genero");
        System.out.println(p1.toString());
        
         System.out.println("ingresa la cedula de la persona 1:  ");
       p2.setCi(leer.next());
        System.out.println("ingresa el nombre");
       p2.setNombre(leer.next());
        System.out.println("ingresa el apellido");
        p2.setApellido(leer.next());
        System.out.println("ingresa el genero");
         System.out.println(p2.toString());
        
    }
    
}


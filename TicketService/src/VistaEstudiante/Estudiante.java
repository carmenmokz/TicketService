/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaEstudiante;

import java.util.Scanner;

import Controller.DAOUsuario;
import java.util.InputMismatchException;

/**
 *
 * @author Luis Mora
 */
public class Estudiante {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DAOUsuario con = new DAOUsuario();
        //con.OpenConnection();
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        
        while(!salir){
           
           System.out.println("Bienvenido/a al progama para enviar tickets");
           System.out.println("Seleccione una de las siguientes opciones: \n");
           System.out.println("1. Pene   (Brinda información sobre la sintaxis en la que debe manipularse la aplicación)");
           System.out.println("3. VPC    (Ver profesores con cursos registrados en el sistema)");
           System.out.println("4. SendC  (Envía un ticket solicitando una cita para consulta)");
           System.out.println("5. sendRP (Enviar un ticket solicitando una cita para revisión de proyecto)");
           System.out.println("6. sendRE (Enviar un ticket solicitando una cita para atención de un reclamo de evaluación)");
           System.out.println("7. Salir");
            
          try{ 
           System.out.println("\nOpcion solicitada: ");
           opcion = scan.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   break;
                case 4:
                   System.out.println("Has seleccionado la opcion 4");
                   break;
                case 5:
                   System.out.println("Has seleccionado la opcion 5");
                   break;
                case 6:
                   System.out.println("Has seleccionado la opcion 6");
                   break;   
                case 7:
                   System.out.println("Gracias por utilizar la aplicacion!!");
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 7");
           }
          }
          catch(InputMismatchException ime){
          System.out.println("Debe ingresar un numero entre 1 y 7");
          scan.next();
          }
       }
        
    
    

        
    
    
}
}

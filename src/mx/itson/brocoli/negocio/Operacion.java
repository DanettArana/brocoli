/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.brocoli.negocio;

/**
 * Contiene metodos para trabar con tipos de datos String.
 * @author  Danett Arana
 */
public class Operacion {
 
    /**
     * Separa una cadena de texto a partir de la expresión guion medio.
     * @param valor Cadena de texto que será separada a partir de la expresión.
     * @return Array de String en donde cada posición representa una división de la cadena de texto.
     */
    public String[] separar(String valor){
        
        //hola,esto es un cambio
     String[] elementos = valor.split("-");
         return elementos;
              
         
        
        
    }
    
    
}

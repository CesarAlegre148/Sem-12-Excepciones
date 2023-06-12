/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Estudiante
 */
public class MExcepcionesNumerica extends Exception{
    private final static String MENSAJE =""
            +"Error de conversion numerica,"
            +"ingresa un texto que contenga un numero";
    
    public MExcepcionesNumerica(){
        super(MENSAJE);
    }
    
    
}

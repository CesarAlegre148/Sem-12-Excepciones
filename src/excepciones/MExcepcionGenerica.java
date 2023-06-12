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
public class MExcepcionGenerica extends Exception{
    private final static String MESSAGE= ""
            +"Esta es una excepcion general";
            
    public MExcepcionGenerica(){
        super(MESSAGE);
    }
}

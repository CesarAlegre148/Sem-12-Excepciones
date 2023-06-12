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
public class Utilitario {
    
    public static int convertir(String numeroEnTexto)
    throws 
    MExcepcionesNumerica, 
    MExcepcionGenerica{
     
    try{
        return Integer.parseInt(numeroEnTexto);
    }catch(NumberFormatException s){
        throw new MExcepcionesNumerica();
    }catch(Exception ex){
        throw new MExcepcionGenerica();
    }
    }
   
}
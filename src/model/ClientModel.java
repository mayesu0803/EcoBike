/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class ClientModel {
    //atributos
    private int id;
    private String alias;
    
    //CONSTRUCTOR
    public ClientModel(int id, String alias){
        this.id             = id;
        this.alias          = alias;
    }
    
    
    //METODO GET
    //public tipo_dato getNombreAtributo (){
    //   return nombre_atributo;
    //}
    
    public int getId(){
        return id;
    }
    
    //metodo get para alias
    public String getAlias (){
        return alias;
    }
  
}

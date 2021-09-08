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
    
    public String getAlias(){
        return alias;
    }
    
    public void setAlias (String alias){
        this.alias = alias;
    }
    
    public void setId (int id){
        this.id = id;
    }
    
  
}

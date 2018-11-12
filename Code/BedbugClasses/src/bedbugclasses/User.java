/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bedbugclasses;

/**
 *
 * @author Pierce
 */
public class User {
    //class variables---------------------------------------
    String id;
    Request req[];
    
    //constructor-------------------------------------------
    User(String id){
        this.id = id;
    }
    
    //get/set functions-------------------------------------
    public String getID(){
        return id;
    }
    public Request getRequest(int index){
        return req[index];
    }
    public boolean addRequest(Request add){
        int i = 0;
        while(req[i] != null){
            i++;
        }
        try{
            req[i] = add;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean deleteRequest(int index){
        try{
            req[index] = null;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    //other functions--------------------------------------
    
}

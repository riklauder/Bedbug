package com.bedbugs.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)



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
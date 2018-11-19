package com.bedbugs.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin extends User{

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

    //constructor ---------------------------
    Admin(String ID){
        super(ID);
    }
    
    
    //class functions --------------------------
    public void getRoomApplications(){
        //complete method
    }
    public void getMaintnenceRequests(){
        //complete method
    }
    public void createReports(){
        //complete method
    }

}
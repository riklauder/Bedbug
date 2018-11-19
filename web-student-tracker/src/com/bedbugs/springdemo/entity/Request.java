package com.bedbugs.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Request{

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="requestComplete")
	private boolean requestComplete;

    @Column(name="term")
	private int term;

    @Column(name="dateSubmitted")
	private date dateSubmitted;


    //class variables ---------------
    User user;
    boolean requestComplete;
    Object location;
    int term;
    int dateSubmitted;
    
    //constructors --------------------
    Request(User user, Room lctn, int term, int date){
        this.user = user;
        this.requestComplete = false;
        this.location = lctn;
        this.term = term;
        this.dateSubmitted = date;
    }
    Request(User user, Building lctn, int term, int date){
        this.user = user;
        this.requestComplete = false;
        this.location = lctn;
        this.term = term;
        this.dateSubmitted = date;
    }
    
    //get/set methods -------------------------------
    public User getUser(){
        return user;
    }
    public boolean isComplete(){
        return requestComplete;
    }
    public boolean setComplete(){
        try{
            requestComplete = true;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public Object getLocation(){
        return location;
    }
    public boolean setLocation(Object lctn){
        if(getLocation() == null){
            return false;
        }
        try{
            location = true;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public int getTerm(){
        return term;
    }
    public boolean setTerm(int term){
        try{
            this.term = term;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public int getDate(){
        return dateSubmitted;
    }
    public boolean setDate(int date){
        try{
            dateSubmitted = date;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    
    //other funtions -------------------------
    
}
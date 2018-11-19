package com.bedbugs.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class MaintenanceRequest extends Request{

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="fix")
	private String fix;

    @Column(name="notes")
	private String notes;

    @Column(name="close")
	private boolean close;

    //class variables ---------------------------
    String fix;
    String notes;
    boolean close;
    
    
    //constructors --------------------------
    MaintenanceRequest(User user, Room lctn, int term, int date, String fix){
        super(user, lctn, term ,date);
        close = false;
        this.fix = fix;
        
    }
    MaintenanceRequest(User user, Building lctn, int term, int date, String fix){
        super(user, lctn, term ,date);
        close = false;
        this.fix = fix;
        
    }
    MaintenanceRequest(User user, Room lctn, int term, int date, String fix, String notes){
        super(user, lctn, term ,date);
        close = false;
        this.fix = fix;
        this.notes = notes;
        
    }
    MaintenanceRequest(User user, Building lctn, int term, int date, String fix, String notes){
        super(user, lctn, term ,date);
        close = false;
        this.fix = fix;
        this.notes = notes;
    }
    
    //set/get methods ------------------------
    public String getFix(){
        return fix;
    }
    public boolean addToFix(String add){
        try{
            fix += " " + add;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public String getNotes(){
        return notes;
    }
    public boolean setNotes(String note){
        try{
            notes = note;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean getClosed(){
        return close;
    }
    public boolean setClosed(){
        if(getClosed() == true){
            return false;
        }
        try{
            close = true;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    
}

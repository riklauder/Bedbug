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
public class MaintenanceRequest extends Request{
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

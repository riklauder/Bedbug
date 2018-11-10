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
public class Student extends User{
    //class variables --------------------
    String name;
    int studentType;
    Room room;
    
    //constructor -----------------------------
    Student(String ID, String name, int stType){
        super(ID);
        this.name = name;
        this.studentType = stType;
    }
    Student(String ID, String name, int stType, Room room){
        super(ID);
        this.name = name;
        this.studentType = stType;
        this.room = room;
    }
    
    //get/set methods
    public String getName(){
        return name;
    }
    public boolean setName(String name){
        try{
            this.name = name;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public int getStudentType(){
        return studentType;
    }
    public boolean setStudentType(int type){
        try{
            this.studentType = type;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public Room getRoom(){
        return room;
    }
    public boolean setRoom(Room room){
        if(getRoom() == null){
            return false;
        }
        try{
            this.room = room;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    //other class functions
    
}

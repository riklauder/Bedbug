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
public class Room {
    //Class variables ----------------------------
    int roomID;
    Student students[];
    int size; //number of students the room can ocupy
    
    //constructor ------------------------------
    Room(int roomID, int size){
        this.roomID = roomID;
        this.size = size;
        students = new Student[size];
    }
    
    //get/set methods -----------------------------
    public int getRoomID(){
        return roomID;
    }
    public boolean setRoomID(int id){
        try{
            roomID = id;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public Student[] getStudens(){
        return students;
    }
    public boolean addStudent(Student add){
        int i = 0;
        while(students[i] != null){
            i++;
        }
        if(i >= size){
            return false;
        }
        try{
            students[i] = add;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean removeStudnet(int index){
        try{
            students[index] = null;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public int getSize(){
        return size;
    }
    public boolean setSize(int size){
        try{
            this.size = size;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    
    
}

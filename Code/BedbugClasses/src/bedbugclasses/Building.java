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
public class Building {
    //class variables ---------------
    Room rooms[];
    
    //constructor ---------------------
    Building(){
        rooms = new Room[50];
    }
    Building(int size){
        rooms = new Room[size];
    }
    
    //get/set methods -----------------------
    public Room[] getRooms(){
        return rooms;
    }
    public boolean addRoom(int index, int ID, int size){
        try{
            rooms[index] = new Room(ID, size);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean removeRoom(int index){
        try{
            rooms[index] = null;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
}

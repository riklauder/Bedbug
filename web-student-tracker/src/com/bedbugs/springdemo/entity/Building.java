package com.bedbugs.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Building{

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

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

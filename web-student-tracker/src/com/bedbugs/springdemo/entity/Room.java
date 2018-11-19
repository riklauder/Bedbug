package com.bedbugs.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Room{

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="roomID")
	private int roomID;

    @Column(name="size")
	private int size;

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

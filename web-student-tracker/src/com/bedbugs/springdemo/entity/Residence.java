package com.bedbugs.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Residence{

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="name")
	private String name;

    //class variables
    String name;
    Building buildings[];
    
    //constructors
    Residence(String name){
        this.name = name;
        buildings = new Building[5];
    }
    Residence(String name, int size){
        this.name = name;
        buildings = new Building[size];
    }
    
    //get/set methods
    public String getName(){
        return name;
    }
    public Building[] getBuildings(){
        return buildings;
    }
    public boolean addBuilding(int index){
        try{
            buildings[index] = new Building();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean addBuilding(int index, int size){
        try{
            buildings[index] = new Building(size);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean removeBuilding(int index){
        try{
            buildings[index] = null;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
}

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
public class RoomRequest extends Request{
    //class variables -----------------------
    boolean isApproved;
    String specialRequest;
    Student roommates[];
    
    //constructors --------------------
    RoomRequest(User user, Room lctn, int term, int date){
        super(user, lctn, term ,date);
        isApproved = false;
    }
    RoomRequest(User user, Room lctn, int term, int date, String req){
        super(user, lctn, term ,date);
        isApproved = false;
        specialRequest = req;
    }
    
    //get/set methods ----------------------------
    public boolean checkApproval(){
        return isApproved;
    }
    public boolean setApproved(){
        if(checkApproval() == true){
            return false;
        }
        try{
            isApproved = true;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public String getRequest(){
        return specialRequest;
    }
    public boolean setRequest(String req){
        try{
            specialRequest = req;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public Student[] getRoommate(){
        return roommates;
    }
    public boolean addRoommate(Student mate){
        int i = 0;
        while(roommates[i] != null){
            i++;
        }
        try{
            roommates[i] = mate;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean removeRoommate(int index){
        try{
            roommates[index] = null;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    //other funcions --------------------------------
}

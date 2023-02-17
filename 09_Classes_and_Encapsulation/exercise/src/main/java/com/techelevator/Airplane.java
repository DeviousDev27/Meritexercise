package com.techelevator;

public class Airplane {
private String planeNumber;
private int totalFirstClassSeats,bookedFirstClassSeats,availableFirstClassSeats,totalCoachSeats,
        bookedCoachSeats,availableCoachSeats;

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getAvailableFirstClassSeats() {
        this.availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
        return availableFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableCoachSeats() {
        this.availableCoachSeats = totalCoachSeats - bookedCoachSeats;
        return availableCoachSeats;
    }

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass , int totalNumberOfSeats){

        if(forFirstClass && getAvailableFirstClassSeats() >= totalNumberOfSeats){
             this.bookedFirstClassSeats += totalNumberOfSeats;
             return true;

        }else if (getAvailableCoachSeats() <= totalNumberOfSeats){
            return false;
        }
        this.bookedCoachSeats += totalNumberOfSeats;
        return true;

    }

}

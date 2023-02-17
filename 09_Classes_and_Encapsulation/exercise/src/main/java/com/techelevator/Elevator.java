package com.techelevator;

public class Elevator {
    private int currentFloor = 1, numberOfFloors;
    private boolean doorOpen;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
    public void openDoor(){
        if(!doorOpen){
            doorOpen = true;
        }
    }
    public void closeDoor(){
        if(doorOpen){
            doorOpen = false;
        }

    }
    public void goUp(int desiredFloor){
        if(!doorOpen && desiredFloor >= currentFloor && desiredFloor <= numberOfFloors){
            currentFloor = desiredFloor;

        }

    }
    public void goDown(int desiredFloor){
        if(!doorOpen && desiredFloor <= currentFloor && desiredFloor >= 1 ){
            currentFloor = desiredFloor;
        }

    }
    public Elevator(int numberOfLevels){
        this.numberOfFloors = numberOfLevels;
    }
}

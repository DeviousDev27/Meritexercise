package com.techelevator;

public class HomeworkAssignment {
    public int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;


    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }
    public String getSubmitterName() {
        return submitterName;
    }
    public String getLetterGrade() {
        double gradePercentage =  (earnedMarks * 100) / possibleMarks;
        if(gradePercentage >= 90){
            this.letterGrade = "A";
        }else if(gradePercentage >= 80){
            this.letterGrade = "B";
        } else if (gradePercentage >= 70) {
            this.letterGrade = "C";
        } else if (gradePercentage >= 60) {
            this.letterGrade = "D";
        }else {
            this.letterGrade = "F";
        }
        return letterGrade;
    }

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.submitterName = submitterName;
        this.possibleMarks = possibleMarks;

    }




}


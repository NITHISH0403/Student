package org.example;

import java.util.*;
import java.util.logging.*;

class Process
{
    Logger l = Logger.getLogger("MY Logger");
    Scanner s = new Scanner(System.in);
    String studentname;
    int total;
    String gradelevel;
    int gpa = 0 ;
    Process()
    {
        l.info("Enter the Student name :");
        studentname = s.nextLine();

        l.info("Enter the total :");
        total = s.nextInt();
    }
    void updategrade(){
        if(total >= 450)
            gradelevel = "A";
        else if(total >= 350)
            gradelevel = "B";
        else if(total >= 300)
            gradelevel = "C";
        else if(total >= 250)
            gradelevel = "D";
        else
            gradelevel = "E";
    }
    void update()
    {
        if("A".equalsIgnoreCase(gradelevel))
            gpa = 5;
        else if("B".equalsIgnoreCase(gradelevel))
            gpa = 4;
        else if("C".equalsIgnoreCase(gradelevel))
            gpa = 3;
        else if("D".equalsIgnoreCase(gradelevel))
            gpa = 2;
        else
            gpa = 1;
    }
    String display()
    {
        l.log(Level.INFO, () -> studentname + " " + "has a" + " " + gradelevel + " " + "Grade");
        return studentname + " " + "has a" + " " + gpa + " "+ "GPA.";
    }
}

class  Student
{
    public static void main(String[] args)
    {
        Logger l = Logger.getLogger("My Logger");
        Process p = new Process();
        p.updategrade();
        p.update();
        
        //use in Lambda method
        l.log(Level.INFO, p::display);
    }
}

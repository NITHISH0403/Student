package org.example;

import java.util.*;
import java.util.logging.*;

class Process
{
    Logger l = Logger.getLogger("MY Logger");
    Scanner S = new Scanner(System.in);
    String student_name;
    int total;
    String grade_level;
    int GPA = 0 ;
    Process()
    {
        l.info("Enter the Student name :");
        student_name = S.nextLine();

        l.info("Enter the total :");
        total = S.nextInt();
    }
    void update_grade(){
        if(total >= 450)
            grade_level = "A";
        else if(total >= 350)
            grade_level = "B";
        else if(total >= 300)
            grade_level = "C";
        else if(total >= 250)
            grade_level = "D";
        else
            grade_level = "E";
    }
    void update()
    {
        if("A".equalsIgnoreCase(grade_level))
            GPA = 5;
        else if("B".equalsIgnoreCase(grade_level))
            GPA = 4;
        else if("C".equalsIgnoreCase(grade_level))
            GPA = 3;
        else if("D".equalsIgnoreCase(grade_level))
            GPA = 2;
        else
            GPA = 1;
    }
    String display()
    {
        l.log(Level.INFO, () -> student_name + " " + "has a" + " " + grade_level + " " + "Grade");
        return student_name + " " + "has a" + " " + GPA + " "+ "GPA.";
    }
}

class  Student
{
    public static void main(String[] args)
    {
        Logger l = Logger.getLogger("My Logger");
        Process p = new Process();
        p.update_grade();
        p.update();
        l.log(Level.INFO, p::display);
    }
}

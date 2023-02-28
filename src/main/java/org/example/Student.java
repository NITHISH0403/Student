package org.example;

import java.util.*;
import java.util.logging.*;

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

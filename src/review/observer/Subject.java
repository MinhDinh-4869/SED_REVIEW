package review.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subject {
    List<Observer> observers = new ArrayList<>();
    String line;

    public void attach(Observer o)
    {
        this.observers.add(o);
        o.attach(this);
    }

    public void runProcess()
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine())
        {
            line = sc.nextLine();
            for(Observer o : observers)
            {
                o.update();
            }
        }
    }
    public String getLine()
    {return this.line;}
}

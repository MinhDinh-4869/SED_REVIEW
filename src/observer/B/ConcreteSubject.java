package observer.B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConcreteSubject implements Subject{
    private String line;
    private List<Observer> obs = new ArrayList<>();

    public void attach(Observer o)
    {
        obs.add(o);
    }

    public String getState()
    {
        return this.line;
    }

    public void startProcess()
    {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine())
        {
            System.out.println("#" + count);
            System.out.println("Enter next line: ");
            this.line = sc.nextLine();
            for(Observer o : obs)
            {
                System.out.println("#" + count);
                o.update();
            }
            count ++;
        }
    }
}

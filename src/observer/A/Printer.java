package observer.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Printer {
    private List<InlineSource> sources = new ArrayList<>();
    public void add(InlineSource i)
    {
        sources.add(i);
    }

    public void print()
    {
        Scanner c = new Scanner(System.in);
        while(c.hasNextLine()) {
            System.out.println("Enter something: ");
            String line = c.nextLine().trim();
            for (InlineSource i : sources) {
                i.update(line);
            }
        }

        c.close();
    }
}

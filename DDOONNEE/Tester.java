import java.util.*;

public class Tester
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("BOARD SIZE (GREATER THAN 4):");
        int a = 0; 
        while(a < 5)
        {
            try
            {
                a = Integer.parseInt(sc.next());
            }
            catch(Exception p){}
            if(a < 5)
            {
                System.out.print("\u000C");
                System.out.println("INVALID SIZE");
                System.out.println("BOARD SIZE (GREATER THAN 4):");
            }
        }
        System.out.print("\u000C");
        Board b = new Board(a);
        b.build();
        b.check();
        b.start();
        while(b.end == -1)
        {
            System.out.print(b);
            b.run();
        }
        System.out.print(b);
        if(b.end == 1)
        {
            System.out.println("YOU WIN");
        }
        else
        {
            System.out.println("YOU LOSE");
        }
    }
}
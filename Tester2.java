import java.util.*;

public class Tester2
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("BOARD SIZE (GREATER THAN 7):");
        int a = 0; 
        while(a < 8)
        {
            a = sc.nextInt();
            if(a < 8)
            {
                System.out.println("BOARD SIZE (GREATER THAN 7):");
            }
        }
        System.out.print("\u000C");
        Board2 b = new Board2(a);
        b.build();
        b.check();
        while(b.end == -1)
        {
            System.out.print("\u000C");
            b.run();
            System.out.print("ENTER ANYTHING TO END TURN");
            String h = sc.next();
            System.out.print("\u000C");
            System.out.println("PLAYER2's Turn");
            System.out.println("ENTER ANYTHING TO START TURN");
            String z = sc.next();
            b.run2();
            System.out.print("ENTER ANYTHING TO END TURN");
            String t = sc.next();
            System.out.print("\u000C");
            System.out.println("PLAYER1's Turn");
            System.out.println("ENTER ANYTHING TO START TURN");
            String x = sc.next();
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
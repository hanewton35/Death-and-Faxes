import java.util.*;

public class Main
{
    Scanner sc;
    
    public void mainMenu()
    {
        System.out.print("\u000C");
        sc = new Scanner(System.in);
        System.out.println("1. 1-Player");
        System.out.println("2. 2-Players");
        String a = sc.next();
        if(a.equals("1"))
        {
            oneMenu();
        }
        else if(a.equals("2"))
        {
            twoMenu();
        }
        else
        {
            mainMenu();
        }
    }
    
    public void oneMenu()
    {
        System.out.print("\u000C");
        System.out.println("ONE-PLAYER");
        System.out.println("1. Start");
        System.out.println("2. Rules");
        System.out.println("3. Back");
        String a = sc.next();
        if(a.equals("1"))
        {
            System.out.print("\u000C");
            Tester b = new Tester();
            b.run();
        }
        else if(a.equals("2"))
        {
            System.out.print("\u000C");
            System.out.println("ONE-PLAYER RULES");
            System.out.println("");
            System.out.println("1. Back");
            while(true)
            {
                a = sc.next(); 
                if(a.equals("1"))
                    oneMenu();
            }
        }
        else if(a.equals("3"))
        {
            System.out.print("\u000C");
            mainMenu();
        }
        else
        {
            System.out.print("\u000C");
            oneMenu();
        }
        System.out.println("Play Again?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        boolean x = false; 
        while(!x)
        {
            a = sc.next();
            if(a.equals("1"))
            {
                x = true; 
                mainMenu();
            }
            else if(a.equals("2"))
            {
                System.out.print("\u000C");
                System.exit(0);
            }
        }
    }
    
    public void twoMenu()
    {
        System.out.print("\u000C");
        System.out.println("TWO-PLAYER");
        System.out.println("1. Start");
        System.out.println("2. Rules");
        System.out.println("3. Back");
        String a = sc.next();
        if(a.equals("1"))
        {
            System.out.print("\u000C");
            Tester2 b = new Tester2();
            b.run();
        }
        else if(a.equals("2"))
        {
            System.out.print("\u000C");
            System.out.println("TWO-PLAYER RULES");
            System.out.println("");
            System.out.println("1. Back");
            while(true)
            {
                a = sc.next(); 
                if(a.equals("1"))
                    oneMenu();
            }
        }
        else if(a.equals("3"))
        {
            System.out.print("\u000C");
            mainMenu();
        }
        else
        {
            System.out.print("\u000C");
            twoMenu();
        }
        System.out.println("Play Again?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        boolean x = false; 
        while(!x)
        {
            a = sc.next();
            if(a.equals("1"))
            {
                x = true; 
                mainMenu();
            }
            else if(a.equals("2"))
            {
                x = true; 
            }
        }
    }
}

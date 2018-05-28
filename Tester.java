import java.util.*;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Tester
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("BOARD SIZE (GREATER THAN 4):");
        int a = 0; 
        while(a < 5)
        {
            a = sc.nextInt();
            if(a < 5)
            {
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
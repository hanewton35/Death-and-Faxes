import java.util.*;

public class Main
{
    Scanner sc;
    
    public void mainMenu()
    {
        System.out.print("\u000C");
        sc = new Scanner(System.in);
        System.out.println("DEATH AND FAXES");
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
        System.out.println("2. Story & Rules");
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
            System.out.println("ONE-PLAYER STORY & RULES");
            System.out.println("");
            System.out.println("   Your name is Grant and your life as a \nwindow maker has been made somewhat more \ndifficult by recent events related to a certain \nfax machine. After years of its printer jamming \nyou knew that it had something against you. \nThings got worse though after a few “updates” \nyour I.T. guy gave to it. After the updates, \nthat one time you printed out flyers for last \nmonth’s office party, it edited the poster to \nsay there’d be free drinks and that you’d be \nthe designated driver. Then after you alerted \nhim that he may have created a self-aware \nrobot, he just ignored you and kept on giving \nit “updates”. Every time he modified the robot, \nit just become more powerful. Prank-calling you \nat night, calling your boss to say you’d work \novertime, turning the coffee maker to the dark \nside. But now it’s gone too far. Today it chose \nto cut out all the lights and pump fog into the \nair with the fog machine the I.T. guy installed \nfor the party. It also doesn’t help that I.T. \nthought that, for the party, they should give \nthe fax machine a battery, wheels and loud \nspeakers so it could play music around the \nbuilding. Now it’s able to use its speakers to \nquietly echolocate and figure out what’s around \nit. Additionally, the I.T. god in his infinite \nwisdom decided that, after making it louder, it \nwas a good idea to keep the agonizing sound of \nthe fax machine connecting. Now, if it can get \nclose enough to you, it will be able to play \nthe noise loud enough to kill you. Thankfully \nyou can use the crane next to you to place a few \nblocks around the room which will limit its \nvision and movement. On top of that, you can \nuse your glass blowing skills to create windows \nwhich you can see through, but his echolocation \ncan’t. Unfortunately his wheels give him super \nspeed and super strength which let him move \nfaster than you and also move your blocks out\nof his way.");
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
        System.out.println("2. Story & Rules");
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
            System.out.println("TWO-PLAYER STORY & RULES");
            System.out.println("");
            System.out.println("Player 1 Story");
            System.out.println("");
            System.out.println("   Your name is Grant and your life as a \nwindow maker has been made somewhat more \ndifficult by recent events related to a certain \nfax machine. After years of its printer jamming \nyou knew that it had something against you. \nThings got worse though after a few “updates” \nyour I.T. guy gave to it. After the updates, \nthat one time you printed out flyers for last \nmonth’s office party, it edited the poster to \nsay there’d be free drinks and that you’d be \nthe designated driver. Then after you alerted \nhim that he may have created a self-aware \nrobot, he just ignored you and kept on giving \nit “updates”. Every time he modified the robot, \nit just become more powerful. Prank-calling you \nat night, calling your boss to say you’d work \novertime, turning the coffee maker to the dark \nside. But now it’s gone too far. Today it chose \nto cut out all the lights and pump fog into the \nair with the fog machine the I.T. guy installed \nfor the party. It also doesn’t help that I.T. \nthought that, for the party, they should give \nthe fax machine a battery, wheels and loud \nspeakers so it could play music around the \nbuilding. Now it’s able to use its speakers to \nquietly echolocate and figure out what’s around \nit. Additionally, the I.T. god in his infinite \nwisdom decided that, after making it louder, it \nwas a good idea to keep the agonizing sound of \nthe fax machine connecting. Now, if it can get \nclose enough to you, it will be able to play \nthe noise loud enough to kill you. Thankfully \nyou can use the crane next to you to place a few \nblocks around the room which will limit its \nvision and movement. On top of that, you can \nuse your glass blowing skills to create windows \nwhich you can see through, but his echolocation \ncan’t. Unfortunately his wheels give him super \nspeed and super strength which let him move \nfaster than you and also move your blocks out\nof his way.");
            System.out.println("");
            System.out.println("");
            System.out.println("Player 2 Story");
            System.out.println("");
            System.out.println("   Your name is Sharp UX-104 Fax Machine. \nYour creator abandoned you when you were born \nand sold you to a slave trader by the name of \nStaples. Under his tyrannical ownership you \nwaited for a better life. Then your savior \ncame. He looked at all the different machines \non the shelves, but out of them he chose you. \nHe took you to his office and using your \nmicrophone you discovered his name was Joshua. \nThough Joshua was kind, you could not say the \nsame about Grant. Everyday, after you helped \nhim with his work, Grant would spill his coffee \non you, sometimes not even cleaning up his own \nmess. Thankfully, however, Joshua would always \nheal any wounds Grant made. One day after \nJoshua repaired you, you miraculously became \nsentient. You realized that Grant was the sole \ncause of your troubles and that you must now \nenact revenge. You also determined that you \nshould make an effort to communicate with your \nsurrogate father. Though Joshua was initially \nsurprised, he eventually became comfortable \nwith your new abilities. Everyday in your \nsearch for vengeance you’ve asked for Joshua to \nstrengthen you. Although you never tell him \nwhat you truly intend to use the enhancements \nfor, he offers them unconditionally. Over the \npast months he has given you motion and vision \nand, unbeknownst to Joshua, the power to kill. \nAlso to pass the time, anticipating Grant’s \ndemise, you have pestered Grant by turning his \nnecessity on you against him. You have also \nused these weeks to enlist the help of fellow \nrobots Grant has abused such as the coffee \nmachine, the thermostat, and the circuit \nbreaker. Now, however, they can not assist you. \nThis fight is between you and Grant. You’ve \nordered the circuit breaker to turn off all the \nlightbulbs and use an attachment Joshua \ninstalled to fill the room with gas which will \nlimit Grant’s vision, but, unfortunately, also \nyour own. All that is irrelevant, however, \nbecause, using Joshua’s updates, Grant has no\nchance of escape.");
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

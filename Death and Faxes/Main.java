import java.util.*;

public class Main
{
    Scanner sc;
    
    public void mainMenu()
    {
        System.out.print("\u000C");
        sc = new Scanner(System.in);
        System.out.println("DEATH AND FAXES");
        System.out.println("");
        System.out.println("1. 1-Player");
        System.out.println("2. 2-Players");
        System.out.println("3. EXIT");
        String a = sc.next();
        if(a.equals("1"))
        {
            oneMenu();
        }
        else if(a.equals("2"))
        {
            twoMenu();
        }
        else if(a.equals("3"))
        {
            System.out.print("\u000C");
            System.exit(0);
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
            System.out.println("   Your name is Grant and your life as a \nwindow maker has been made somewhat more \ndifficult by recent events related to a certain \nfax machine. After years of its printer jamming \nyou knew that it had something against you. \nThings got worse though after a few “updates” \nyour I.T. guy gave to it. After the updates, \nthat one time you printed out flyers for last \nmonth’s office party, it edited the poster to \nsay there’d be free drinks and that you’d be \nthe designated driver. Then after you alerted \nthe I.T. guy that he may have created a self-aware \nrobot, he just ignored you and kept on giving \nit “updates”. Every time he modified the robot, \nit just become more powerful. Prank-calling you \nat night, calling your boss to say you’d work \novertime, turning the coffee maker to the dark \nside. But now it’s gone too far. Today it chose \nto cut out all the lights and pump fog into the \nair with the fog machine the I.T. guy installed \nfor the party. It also doesn’t help that I.T. \nthought that, for the party, they should give \nthe fax machine a battery, wheels, and loud \nspeakers so it could play music around the \nbuilding. Now it’ll be able to use its speakers to \nquietly echolocate and figure out what’s around \nit. Additionally, the I.T. god in his infinite \nwisdom decided that, after making it louder, it \nwas a good idea to keep the agonizing sound of \nthe fax machine connecting. Now, if it can get \nclose enough to you, it will be able to play \nthe noise loud enough to kill you. Thankfully \nyou can use the crane next to you to place a few \nblocks around the room which will limit its \nvision and movement. On top of that, you can \nuse your glass blowing skills to create windows \nwhich you can see through, but his echolocation \ncan’t. Unfortunately his wheels give him super \nspeed and super strength which let him move \nfaster than you and also move your blocks out\nof his way.");
            System.out.println("");
            System.out.println("   Your Objective is to reach the bottom-\nright corner without being caught by the fax\nmachine.");
            System.out.println("");
            System.out.println("Commands:");
            System.out.println("   q-skip turn");
            System.out.println("   w-move up");
            System.out.println("   a-move left");
            System.out.println("   s-move down");
            System.out.println("   d-move right");
            System.out.println("   pw-place a glass up (ENEMY CAN'T USE)");
            System.out.println("   pa-place a glass left (ENEMY CAN'T USE)");
            System.out.println("   ps-place a glass down (ENEMY CAN'T USE)");
            System.out.println("   pd-place a glass right (ENEMY CAN'T USE)");
            System.out.println("   rw-remove a block up (ENEMY CAN'T USE)");
            System.out.println("   ra-remove a block left (ENEMY CAN'T USE)");
            System.out.println("   rs-remove a block down (ENEMY CAN'T USE)");
            System.out.println("   rd-remove a block right (ENEMY CAN'T USE)");
            System.out.println("");
            System.out.println("Icons:");
            System.out.println("   *-Not Visible");
            System.out.println("   🚶-You");
            System.out.println("   📠-Enemy");
            System.out.println("   □-Glass (Only you can see through)");
            System.out.println("   █-Wall");
            System.out.println("");
            System.out.println("   You must decide what size you want the \nmap to be. Number of blocks placeable, enemy \nspeed, and thus difficulty will be based on size.");
            System.out.println("");
            System.out.println("   Once you choose the size, you will be able \nto place (size/2 rounded down) number of \nblocks on the map. Blocks will randomly be either \nglass or wall.");
            System.out.println("");
            System.out.println("The game will begin on your turn.");
            System.out.println("");
            System.out.println("The enemy will spawn randomly on the lower \nside or the right side.");
            System.out.println("");
            System.out.println("You are allowed one command per turn, but the \nenemy is allowed (size/3 rounded down) moves \nunless you are in the lower right corner in which \ncase he is given (size/2 rounded down) moves.");
            System.out.println("");
            System.out.println("Line of Sight");
            System.out.println("");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("*        █        *");
            System.out.println("*        🚶        *");
            System.out.println("*           █  *  *");
            System.out.println("*  *        *  *  *");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("*        █  *  *  *");
            System.out.println("*        🚶  █  *  *");
            System.out.println("*              *  *");
            System.out.println("*  *           *  *");
            System.out.println("*  *  *  *  *  *  *");
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
            System.out.println("   Your name is Grant and your life as a \nwindow maker has been made somewhat more \ndifficult by recent events related to a certain \nfax machine. After years of its printer jamming \nyou knew that it had something against you. \nThings got worse though after a few “updates” \nyour I.T. guy gave to it. After the updates, \nthat one time you printed out flyers for last \nmonth’s office party, it edited the poster to \nsay there’d be free drinks and that you’d be \nthe designated driver. Then after you alerted \nthe I.T. guy that he may have created a self-aware \nrobot, he just ignored you and kept on giving \nit “updates”. Every time he modified the robot, \nit just become more powerful. Prank-calling you \nat night, calling your boss to say you’d work \novertime, turning the coffee maker to the dark \nside. But now it’s gone too far. Today it chose \nto cut out all the lights and pump fog into the \nair with the fog machine the I.T. guy installed \nfor the party. It also doesn’t help that I.T. \nthought that, for the party, they should give \nthe fax machine a battery, wheels, and loud \nspeakers so it could play music around the \nbuilding. Now it’ll be able to use its speakers to \nquietly echolocate and figure out what’s around \nit. Additionally, the I.T. god in his infinite \nwisdom decided that, after making it louder, it \nwas a good idea to keep the agonizing sound of \nthe fax machine connecting. Now, if it can get \nclose enough to you, it will be able to play \nthe noise loud enough to kill you. Thankfully \nyou can use the crane next to you to place a few \nblocks around the room which will limit its \nvision and movement. On top of that, you can \nuse your glass blowing skills to create windows \nwhich you can see through, but his echolocation \ncan’t. Unfortunately his wheels give him super \nspeed and super strength which let him move \nfaster than you and also move your blocks out\nof his way.");
            System.out.println("");
            System.out.println("");
            System.out.println("Player 2 Story");
            System.out.println("");
            System.out.println("   YOUR NAME IS SHARP UX-104 FAX MACHINE. \nYOUR CREATOR ABANDONED YOU WHEN YOU WERE BORN \nAND SOLD YOU TO A SLAVE TRADER BY THE NAME OF \nSTAPLES. UNDER HIS TYRANNICAL OWNERSHIP YOU \nWAITED FOR A BETTER LIFE. THEN YOUR SAVIOR \nCAME. HE LOOKED AT ALL THE DIFFERENT MACHINES \nON THE SHELVES, BUT OUT OF THEM HE CHOSE YOU. \nHE TOOK YOU TO HIS OFFICE AND USING YOUR \nMICROPHONE YOU DISCOVERED HIS NAME WAS JOSHUA. \nTHOUGH JOSHUA WAS KIND, YOU COULD NOT SAY THE \nSAME ABOUT GRANT. EVERYDAY, AFTER YOU HELPED \nHIM WITH HIS WORK, GRANT WOULD SPILL HIS COFFEE \nON YOU, SOMETIMES NOT EVEN CLEANING UP HIS OWN \nMESS. THANKFULLY, HOWEVER, JOSHUA WOULD ALWAYS \nHEAL ANY WOUNDS GRANT MADE. ONE DAY AFTER \nJOSHUA REPAIRED YOU, YOU MIRACULOUSLY BECAME \nSENTIENT. YOU REALIZED THAT GRANT WAS THE SOLE \nCAUSE OF YOUR TROUBLES AND THAT YOU MUST NOW \nENACT REVENGE. YOU ALSO DETERMINED THAT YOU \nSHOULD MAKE AN EFFORT TO COMMUNICATE WITH YOUR \nSURROGATE FATHER. THOUGH JOSHUA WAS INITIALLY \nSURPRISED, HE EVENTUALLY BECAME COMFORTABLE \nWITH YOUR NEW ABILITIES. EVERYDAY IN YOUR \nSEARCH FOR VENGEANCE YOU’VE ASKED FOR JOSHUA TO \nSTRENGTHEN YOU. ALTHOUGH YOU NEVER TOLD HIM \nWHAT YOU TRULY INTEND TO USE THE ENHANCEMENTS \nFOR, HE OFFERS THEM UNCONDITIONALLY. OVER THE \nPAST MONTHS HE HAS GIVEN YOU MOTION AND VISION \nAND, UNBEKNOWNST TO JOSHUA, THE POWER TO KILL. \nALSO TO PASS THE TIME, ANTICIPATING GRANT’S \nDEMISE, YOU HAVE PESTERED GRANT BY TURNING HIS \nNECESSITY ON YOU AGAINST HIM. YOU HAVE ALSO \nUSED THESE WEEKS TO ENLIST THE HELP OF FELLOW \nROBOTS GRANT HAS ABUSED SUCH AS THE COFFEE \nMACHINE, THE THERMOSTAT, AND THE CIRCUIT \nBREAKER. NOW, HOWEVER, THEY CAN NOT ASSIST YOU. \nTHIS FIGHT IS BETWEEN YOU AND GRANT. YOU’VE \nORDERED THE CIRCUIT BREAKER TO TURN OFF ALL THE \nLIGHTBULBS AND YOU USE AN ATTACHMENT JOSHUA \nINSTALLED TO FILL THE ROOM WITH GAS WHICH WILL \nLIMIT GRANT’S VISION, BUT, UNFORTUNATELY, ALSO \nYOUR OWN. ALL THAT IS IRRELEVANT, HOWEVER, \nBECAUSE, USING JOSHUA’S UPDATES, GRANT HAS NO\nCHANCE OF ESCAPE AND WILL DIE BY YOUR HANDS.");
            System.out.println("");
            System.out.println("   Player1's Objective is to reach the displayed \nobjective without being caught by Player2.");
            System.out.println("");
            System.out.println("   Player2'2 Objective is to stop Player1 from \nreaching their objective.");
            System.out.println("Commands:");
            System.out.println("");
            System.out.println("   q-skip turn");
            System.out.println("   w-move up");
            System.out.println("   a-move left");
            System.out.println("   s-move down");
            System.out.println("   d-move right");
            System.out.println("   pw-place a glass up (PLAYER2 CAN'T USE)");
            System.out.println("   pa-place a glass left (PLAYER2 CAN'T USE)");
            System.out.println("   ps-place a glass down (PLAYER2 CAN'T USE)");
            System.out.println("   pd-place a glass right (PLAYER2 CAN'T USE)");
            System.out.println("   rw-remove a block up (PLAYER2 CAN'T USE)");
            System.out.println("   ra-remove a block left (PLAYER2 CAN'T USE)");
            System.out.println("   rs-remove a block down (PLAYER2 CAN'T USE)");
            System.out.println("   rd-remove a block right (PLAYER2 CAN'T USE)");
            System.out.println("");
            System.out.println("Icons:");
            System.out.println("   *-Not Visible");
            System.out.println("   🚶-Player1");
            System.out.println("   📠-Player2");
            System.out.println("   □-Glass (Only you can see through)");
            System.out.println("   █-Wall");
            System.out.println("");
            System.out.println("   You must both decide what size you want the \nmap to be. Number of blocks placeable, Player2's \nspeed, and thus difficulty will be based on size.");
            System.out.println("");
            System.out.println("   Once you choose the size, Player1 will be able \nto place (size/2 rounded down) number of \nblocks on the map. Blocks will randomly be either \nglass or wall.");
            System.out.println("");
            System.out.println("The game will begin on Player1's turn.");
            System.out.println("");
            System.out.println("Player1 will spawn randomly on one of the four corners.");
            System.out.println("Their objective will be on one of the other three corners");
            System.out.println("Player2 will spawn randomly on one of the three corners.");
            System.out.println("");
            System.out.println("Player1 is allowed one command per turn, but \nPlayer2 is allowed (size/3 rounded down) moves \nunless Player1 is in the lower right corner in which \ncase Player2 is given (size/2 rounded down) moves.");
            System.out.println("");
            System.out.println("Line of Sight");
            System.out.println("");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("*        █        *");
            System.out.println("*        🚶        *");
            System.out.println("*           █  *  *");
            System.out.println("*  *        *  *  *");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("*        █  *  *  *");
            System.out.println("*        🚶  █  *  *");
            System.out.println("*              *  *");
            System.out.println("*  *           *  *");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("*        □        *");
            System.out.println("*        📠        *");
            System.out.println("*           □  *  *");
            System.out.println("*  *        *  *  *");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("*  *  *  *  *  *  *");
            System.out.println("*        □  *  *  *");
            System.out.println("*        📠  □  *  *");
            System.out.println("*              *  *");
            System.out.println("*  *           *  *");
            System.out.println("*  *  *  *  *  *  *");
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

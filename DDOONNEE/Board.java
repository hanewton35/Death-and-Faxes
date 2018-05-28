import java.util.*;
import java.lang.*;

public class Board
{
    Obj[][] board;
    Scanner sc = new Scanner(System.in);
    int end = -1; 
    boolean building;
    
    public Board(int size)
    {
        board = new Obj[size][size];
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                place(new Empty(this, i, j), i, j); 
            }
        }
        place(new You(this, 0, 0), 0, 0);
    }
    
    public void place(Obj obj, int row, int col)
    {
        board[row][col] = obj;
    }
    
    public void swap(int row1, int col1, int row2, int col2)
    {
        Obj o = board[row1][col1];
        o.row = row2;
        o.col = col2;
        board[row1][col1] = board[row2][col2];
        board[row1][col1].row = row1;
        board[row1][col1].col = col1;
        board[row2][col2] = o;
    }
    
    public void clear(int row, int col)
    {
        board[row][col] = new Empty(this, row, col);
    }
    
    public Obj get(int row, int col)
    {
        return board[row][col];
    }
    
    public You getYou()
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] instanceof You)
                {
                    return (You) board[i][j];
                }
            }
        } 
        return null;
    }
    
    public Enemy getEne()
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] instanceof Enemy)
                {
                    return (Enemy) board[i][j];
                }
            }
        } 
        return null;
    }
    
    public void build()
    {
        building = true;
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < board.length/2; i++)
        {
            arr.add(Math.random());
        }
        for(int i = 0; i < board.length/2; i++)
        {
            System.out.println("PLACEMENTS REMAINING: " + (board.length/2-i));
            System.out.print(this);
            double e = arr.get(i);
            if(e < .5)
            {
                System.out.println("WALL");
                System.out.print("ENTER ROW FOR PLACEMENT");
                int c = sc.nextInt()-1;
                System.out.print("ENTER COLUMN FOR PLACEMENT");
                int d = sc.nextInt()-1;
                if(-1 < c && c < board.length && -1 < d && d < board.length && board[c][d] instanceof Empty)
                {
                    place(new Wall(this, c, d), c, d);
                    System.out.print("\u000C");
                }
                else
                {
                    i--;
                    System.out.print("\u000C");
                    System.out.println("INVALID PLACEMENT");
                }
            }
            else 
            {
                System.out.println("GLASS");
                System.out.print("ENTER ROW FOR PLACEMENT");
                int c = sc.nextInt()-1;
                System.out.print("ENTER COLUMN FOR PLACEMENT");
                int d = sc.nextInt()-1;
                if(-1 < c && c < board.length && -1 < d && d < board.length && board[c][d] instanceof Empty)
                {
                    place(new Glass(this, c, d), c, d);
                    System.out.print("\u000C");
                }
                else
                {
                    i--;
                    System.out.print("\u000C");
                    System.out.println("INVALID PLACEMENT");
                }
            }
        }
        check();
        building = false;
    }
    
    public void start()
    {
        int i = (int)(Math.random()*board.length/2)+board.length/2;
        if(Math.random() > .5)
        {
            if(board[board.length-1][i] instanceof Empty)
                place(new Enemy(this, board.length-1, i), board.length-1, i);
            else
                start();
        }
        else
        {
            if(board[board.length-1][i] instanceof Empty)
                place(new Enemy(this, i, board.length-1), i, board.length-1);
            else
                start();
        }
    }
    
    public void run()
    {
        String c = sc.next();
        if(c.equals("w") && getYou().getRow() != 0 && board[getYou().getRow()-1][getYou().getCol()] instanceof Empty)
        {
            getYou().up();
        }
        else if(c.equals("d") && getYou().getCol() != board.length-1  && board[getYou().getRow()][getYou().getCol()+1] instanceof Empty)
        {
            getYou().right();
        }
        else if(c.equals("s") && getYou().getRow() != board.length-1  && board[getYou().getRow()+1][getYou().getCol()] instanceof Empty)
        {
            getYou().down();
        }
        else if(c.equals("a") && getYou().getCol() != 0  && board[getYou().getRow()][getYou().getCol()-1] instanceof Empty)
        {
            getYou().left();
        }
        else if(c.equals("pw") && getYou().getRow() != 0 && board[getYou().getRow()-1][getYou().getCol()] instanceof Empty)
        {
            place(new Glass(this, getYou().getRow()-1, getYou().getCol()), getYou().getRow()-1, getYou().getCol());
        }
        else if(c.equals("pd") && getYou().getCol() != board.length-1  && board[getYou().getRow()][getYou().getCol()+1] instanceof Empty)
        {
            place(new Glass(this, getYou().getRow()-1, getYou().getCol()+1), getYou().getRow(), getYou().getCol()+1);
        }
        else if(c.equals("ps") && getYou().getRow() != board.length-1  && board[getYou().getRow()+1][getYou().getCol()] instanceof Empty)
        {
            place(new Glass(this, getYou().getRow()+1, getYou().getCol()), getYou().getRow()+1, getYou().getCol());
        }
        else if(c.equals("pa") && getYou().getCol() != 0  && board[getYou().getRow()][getYou().getCol()-1] instanceof Empty)
        {
            place(new Glass(this, getYou().getRow(), getYou().getCol()-1), getYou().getRow(), getYou().getCol()-1);
        }
        else if(c.equals("rw") && getYou().getRow() != 0 && (board[getYou().getRow()-1][getYou().getCol()] instanceof Wall || board[getYou().getRow()-1][getYou().getCol()] instanceof Glass))
        {
            place(new Empty(this, getYou().getRow()-1, getYou().getCol()), getYou().getRow()-1, getYou().getCol());
        }
        else if(c.equals("rd") && getYou().getCol() != board.length-1  && (board[getYou().getRow()][getYou().getCol()+1] instanceof Wall || board[getYou().getRow()][getYou().getCol()+1] instanceof Glass))
        {
            place(new Empty(this, getYou().getRow()-1, getYou().getCol()+1), getYou().getRow(), getYou().getCol()+1);
        }
        else if(c.equals("rs") && getYou().getRow() != board.length-1  && (board[getYou().getRow()+1][getYou().getCol()] instanceof Wall || board[getYou().getRow()+1][getYou().getCol()] instanceof Glass))
        {
            place(new Empty(this, getYou().getRow()+1, getYou().getCol()), getYou().getRow()+1, getYou().getCol());
        }
        else if(c.equals("ra") && getYou().getCol() != 0  && (board[getYou().getRow()][getYou().getCol()-1] instanceof Wall || board[getYou().getRow()][getYou().getCol()-1] instanceof Glass))
        {
            place(new Empty(this, getYou().getRow(), getYou().getCol()-1), getYou().getRow(), getYou().getCol()-1);
        }
        check();
        if(getYou().almost)
        {
            for(int i = 0; i < board.length/2; i++)
            {
                if(getEne().hunt())
                {
                    i = board.length/3;
                }
                check();
            }
        }
        else
        {
            for(int i = 0; i < board.length/3; i++)
            {
                if(getEne().hunt())
                {
                    i = board.length/4;
                }
                check();
            }
        }
        System.out.print(this);
        System.out.print("\u000C");
    }
    
    public void end(boolean p)
    {
        System.out.print("\u000C");
        System.out.print(this);
        if(p)
        {
            System.out.println("YOU WIN");
            end = 1;
        }
        else
        {
            System.out.println("YOU LOSE");
            end = 2; 
        }
    }
    
    public void check()
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                board[i][j].check(); 
            }
        }
        if(!(getYou() instanceof You))
        {
            end(false);
        }
        if(getYou() != null && getYou().getRow() == board.length-1 && getYou().getCol() == board.length-1)
        {
            end(true);
        }
    }
    
    public String toString() 
    {
        String str = "\n   ";
        for(int i = 0; i < board.length; i++)
        {
            if(i+1 < 10)
                str += i+1 + "  ";
            else
                str += i+1 + " ";
        }
        str += "\n";
        for(int i = 0; i < board.length; i++)
        {
            if(i+1 < 10)
                str += i+1 + "  ";
            else
                str += i+1 + " ";
            for(int j = 0; j < board[0].length; j++)
            { 
                if(board[i][j].toString().equals("🚶‍"))
                    str += board[i][j] + "   ";
                else if(board[i][j].toString().equals("📠"))
                    str += board[i][j] + "  ";
                else
                    str += board[i][j] + "  ";
            }
            str += "\n";
        }
        return str;
    }
}

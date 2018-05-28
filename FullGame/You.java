public class You extends MovObj
{
    boolean almost = false; 
    
    public You(Board board, int row, int col)
    {
        super(board, row, col);
    }
    
    public void check()
    {
        super.check();
        if(row > board.board.length-1 && col > board.board.length-1)
        {
            almost = true; 
        }
    }
    
    public String toString()
    {
        return "@";
    }
}

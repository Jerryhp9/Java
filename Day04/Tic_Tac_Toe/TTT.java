package Day04.Tic_Tac_Toe;

public class TTT {
    public static void main(String[] args) {
        char[][] board = {
            {'O', 'X', 'O'},
            {'X', 'O', 'X'},
            {'O', 'X', 'O'}
        };

        for (int row = 0; row < 3; row++)
        {
            for (int column = 0; column < 3; column++)
            {
                if (column < 2)
                    System.out.print(board[row][column] + " | ");
                else
                    System.out.println(board[row][column]);
            }
            if (row < 2)
                System.out.println("----------");
        }
    }
}

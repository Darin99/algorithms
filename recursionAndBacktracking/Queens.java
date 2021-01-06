package recursionAndBacktracking;

public class Queens {

    private static final char[][] BOARD = {
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'}
    };

    public static void main(String[] args) {
        findAllEightQueens(0);
    }

    private static void findAllEightQueens(int row) {

        if (row == 8) {
            printSolution();
        } else {
            for (int col = 0; col < 8; col++) {
                if (canPlaceQueen(row, col)) {
                    setQueen(row, col);
                    findAllEightQueens(row + 1);
                    removeQueen(row, col);
                }
            }
        }
    }

    private static boolean canPlaceQueen(int row, int col) {
        for (int c = 0; c < 8; c++) {
            if (Queens.BOARD[row][c] == 'Q') {
                return false;
            }
        }

        for (int r = 0; r < 8; r++) {
            if (Queens.BOARD[r][col] == 'Q') {
                return false;
            }
        }

        int r = row, c = col;

        while (r >= 0 && c >= 0) {
            if (Queens.BOARD[r--][c--] == 'Q') {
                return false;
            }
        }

        r = row;
        c = col;

        while (r < 8 && c < 8) {
            if (Queens.BOARD[r++][c++] == 'Q') {
                return false;
            }
        }

        r = row;
        c = col;

        while (r < 8 && c >= 0) {

            if (Queens.BOARD[r++][c--] == 'Q') {
                return false;
            }
        }

        r = row;
        c = col;

        while (r >= 0 && c < 8) {

            if (Queens.BOARD[r--][c++] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static void removeQueen(int row, int col) {
        Queens.BOARD[row][col] = '-';
    }

    private static void setQueen(int row, int col) {
        Queens.BOARD[row][col] = 'Q';
    }

    private static void printSolution() {
        for (char[] symbols : Queens.BOARD) {
            for (char symbol : symbols) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
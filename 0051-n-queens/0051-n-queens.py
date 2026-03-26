class Solution(object):
    def solveNQueens(self, n):
        result = []
        board = [[0] * n for _ in range(n)]

        def create_board_string(board):
            res = []
            for row in board:
                res.append("".join("Q" if cell == 1 else "." for cell in row))
            return res

        def is_safe(board, row, col):
            for i in range(row):
                if board[i][col]: 
                    return False

            i, j = row, col
            while i >= 0 and j >= 0:
                if board[i][j]: 
                    return False
                i -= 1
                j -= 1

            i, j = row, col
            while i >= 0 and j < n:
                if board[i][j]: 
                    return False
                i -= 1
                j += 1
            return True

        def solve(row):
            if row == n:
                # Add the current valid board to our final result list
                result.append(create_board_string(board))
                return

            for col in range(n):
                if is_safe(board, row, col):
                    board[row][col] = 1
                    solve(row + 1)
                    board[row][col] = 0

        solve(0)
        return result

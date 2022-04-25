package codingtest;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/64061?language=java

public class CraneClawMachineGame {
    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        List<Integer> baskets = new ArrayList<>();

        //바구니에 담기
        for(int j : moves) {
            for (int i = 0; i < board.length; i++) {
                int cell = board[i][j-1];
                if(cell > 0) {
                    baskets.add(cell);
                    board[i][j-1] = 0;
                    break;
                }
            }
        }

        //터트리기
        int count = 0;
        while (true) {
            boolean flag = false;
            for (int i = 0; i < baskets.size()-1; i++) {
                if(baskets.get(i).equals(baskets.get(i+1))) {
                    baskets.remove(i);
                    baskets.remove(i);
                    count = count + 2;
                    flag = true;
                    break;
                }
            }
            if(!flag)
                break;
        }

        return count;
    }
}

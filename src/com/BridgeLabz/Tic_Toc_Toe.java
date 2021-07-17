package com.BridgeLabz;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Tic_Toc_Toe {
    Scanner s=new Scanner(System.in);

    public int chance, flag = 5, index;
    public char[] a = {'0','1','2','3','4','5','6','7','8','9'};

     public static void PlayerSelection() {
        int chance;
        Random random = new Random();

        //random=random.nextInt();

        switch (random.nextInt()){
            case 0:
            System.out.println("Player 1 will start the game");
            System.out.println("Player 1 symbol is X");
            chance = 1;
            break;
            case 1:

            System.out.println("Player 2 will start the game");
            System.out.println("Player 2 symbol is O");
            chance = 2;
            break;                   }

    }

    public int CheckWinOrDraw() {
        if ((a[1] == a[2] && a[2] == a[2] && a[3] == 'X') ||
                (a[4] == a[5] && a[5] == a[6] && a[6] == 'X') ||  //check row and column
                (a[7] == a[8] && a[8] == a[9] && a[9] == 'X') ||

                (a[1] == a[4] && a[4] == a[7] && a[7] == 'X') ||
                (a[2] == a[5] && a[5] == a[8] && a[8] == 'X') ||    //check diagonal
                (a[3] == a[6] && a[6] == a[9] && a[9] == 'X') ||

                (a[1] == a[5] && a[5] == a[9] && a[9] == 'X')) {
            return 1;
        } else if
        ((a[1] == a[2] && a[2] == a[2] && a[3] == 'X') ||   //Check for Rows Equal
                        (a[4] == a[5] && a[5] == a[6] && a[6] == 'O') ||
                        (a[7] == a[8] && a[8] == a[9] && a[9] == 'O') ||

                        (a[1] == a[4] && a[4] == a[7] && a[7] == 'O') ||
                        (a[2] == a[5] && a[5] == a[8] && a[8] == 'O') ||    //check diagonal
                        (a[3] == a[6] && a[6] == a[9] && a[9] == 'O') ||

                        (a[1] == a[5] && a[5] == a[9] && a[9] == 'O')) {
            return 2;
        } else if (a[1] != '1' && a[2] != '2' && a[3] != '3' && a[4] != 4 && a[5] != 5 && a[6] != 6 && a[7] != 7 && a[8] != 8 && a[9] != 9) {
            return 0;
        }
        {
            return flag;
        }

    }
    public  void  WhichPlayerWon()
    {
        if ( flag==1) {
            System.out.println("player 1 has won the game ");
                      }
        else if (flag==2){
            System.out.println("player 2 has won the game");
                         }
        else if (flag==0)
        {
            System.out.println("No player won the game");
        }

    }

    public void GamePlay() {
        flag = 5;
        do {
            DrowBoard();
            if (chance % 2 == 0) {
                System.out.println("player 2 should make Selection");
                index = s.nextInt();
                System.out.println();
                if (index < 9 && index >= 1) {
                    if (a[index] != 'X' && a[index] != 'O') {
                        a[index] = 'O';
                        System.out.println("player made right selsection recorded");
                        chance++;
                        flag = CheckWinOrDraw();

                    }
                } else if (a[index] == 'X' || a[index] == 'O') {
                    System.out.println("player 2 is making wrong selection position already occupied" + a[index]);
                }
            } else {
                System.out.println("player input is invalid");
            }

            if (chance % 2 == 1) {
                System.out.println("Player 1 Should make Selection");
                index = s.nextInt();
                if (index <= 9 && index >= 1) {
                    if (a[index] != 'X' && a[index] != 'O') {
                        a[index] = 'X';
                        System.out.println("Player 1 made right selection recorded");
                        chance++;
                        flag = CheckWinOrDraw();
                    } else if (a[index] == 'X' || a[index] == 'O') {
                        System.out.println("Player 1 is making wrong selection\nPosition already occupied" + a[index]);
                    } else {
                        System.out.println("Player input is invalid");
                    }
                    
                       

                    
                }
            } 
            
        }while (flag != 1 && flag != 0);
        
    }
                public void DrowBoard(){
                    System.out.println("\n--------------------------");
                    System.out.println("|" + a[1] + "|" + a[2] + "|" + a[3] + "|");
                    System.out.println("----------------------------");
                    System.out.println("|" + a[4] + "|" + a[5] + "|" + a[6] + "|");
                    System.out.println("----------------------------");
                    System.out.println("|" + a[7] + "|" + a[8] + "|" + a[9] + "|");
                    System.out.println("----------------------------");
                }


                public static void main (String[]args)throws IOException {

                    Tic_Toc_Toe ob = new Tic_Toc_Toe();
                   ob.PlayerSelection();
                    ob.GamePlay();

                    ob.CheckWinOrDraw();
                    ob.CheckWinOrDraw();
                    ob.DrowBoard();
                }
            }






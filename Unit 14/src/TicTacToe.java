//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];

	}

	public TicTacToe(String game)
	{
		for (int i = 0; i < game.length(); i++){
			mat[i/3][i%3] = game.charAt(i);
			
		}
	
	}

	public String getWinner()
	{

		for (int i = 0; i < 3; i++){
			if (mat[i][0] == mat[i][1] && mat[i][1] == mat[i][2]){
				return mat[i][0] + "wins horizontally!";
			}
			if(mat[0][i] == mat[1][i] && mat[1][i] == mat[2][i]){
				return mat[0][i] + "wins vertically!";
			}
		}
		if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2]){
			return mat[0][0] + "wins diagonally!";
		}
		if(mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0]){
			return mat[0][2] +"wins diagonally!";
		}
	
		return "cat's game - no winner!";
	}

	public String toString()
	{
		String output = "";
		for ()
			
		/**	for (int i = 0; i < mat.length; i++){
				for (int a = 0; a < mat[i].length; a++) {
					output += mat[i][a];
				}
				output += "\n";
			}

**/


		return output + "\n\n";
	}
}
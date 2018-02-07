import java.util.Random;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){

	// VARIABLE INITIALIZATION
	int row=20; //row
	int col=20; //column
	int randomnum, xPos, yPos;
	int[][] map = new int[row][col];

	// IMPORTS
	Random rand = new Random();

	// INITIALIZE FIELDS OF MAP FROM 1-9
	for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
			randomnum = rand.nextInt(8)+1;
                        map[i][j]=randomnum;
                }
	}

	// INITIALIZE RANDOM PLAYER LOCATION AND HIS WALLS
	// let '0' be equivalent to the representation of the player to the game
	// let '9' be the representation to the walls of player
	xPos = rand.nextInt(19)+1;
	yPos = rand.nextInt(19);
	map[xPos][yPos] = 0;

	map[xPos-1][yPos] = 9; //up
	map[xPos+1][yPos] = 9; //down
	map[xPos][yPos-1] = 9; //left
	map[xPos][yPos+1] = 9; //right
	
	map[xPos-1][yPos-1] = 9; //upper-left
	map[xPos-1][yPos+1] = 9; //upper-right
	map[xPos+1][yPos-1] = 9; //lower-left
	map[xPos+1][yPos+1] = 9; //lower-right


	

	// MAP PRINTING
	for(int m = 0; m<row;m++){
		for(int n = 0; n<col; n++){
			System.out.print(map[m][n]);
			if(n==19) System.out.print("\n");
//			if(map[m][n]==9) System.out.print("#");
//			if(map[m][n]==0) System.out.print("@");
		}
	}


	}


/******************************************* TO FOLLOW *************************
	try {
		row = Integer.parseInt(args[0]);
		col = Integer.parseInt(args[1]);
		System.out.println(row + " " + col);
	}catch(Exception e){
		System.out.println("No arguments supplied!");
	}
*******************************************************************************/
}


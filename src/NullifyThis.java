import java.io.IOException;
import java.util.Scanner;

/**
 * Nullify all the rows and columns correspondingly if the matrix element is 0 somewhere.
 * @author pbhatnagar
 * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D
 */
public class NullifyThis {

	public static int[][] nullify(int[][] input){
		boolean[] row = new boolean[input.length];
		boolean[] col = new boolean[input[0].length];
		for(int i = 0; i < row.length; i++){
			for(int j = 0; j < col.length; j++){
				if(input[i][j] == 0){
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for(int i = 0; i < row.length; i++){
			if(row[i])
				nullifyMyRow(input, i);
		}
		for(int j = 0; j < col.length; j++){
			if(col[j])
				nullifyMyCol(input, j);
		}
		
		return input;
	}
	private static void nullifyMyCol(int[][] input, int j) {
		// TODO Auto-generated method stub
		for(int i = 0; i < input.length; i++){
			input[i][j] = 0;
		}
		
	}
	private static void nullifyMyRow(int[][] input, int i) {
		// TODO Auto-generated method stub
		for(int j = 0; j < input[0].length; j++){
			input[i][j] = 0;
		}
	}
	public static void printMe(int[][] array){
		for(int i = 0; i < array.length; i++ ){
			for(int j = 0; j < array[0].length; j++){
				System.out.print( array[i][j] + "   ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the width");
		int width = scan.nextInt();
		System.out.println("Enter the height");
		int height = scan.nextInt(); 
		int[][] input = new int[width][height];
		scan.nextLine();
		for(int i = 0; i < width; i++ ){
			System.out.println("Enter line " + (i+1));
			String inputLine = scan.nextLine();
			String[] inputLineArray = inputLine.split(" ");
			for(int j = 0; j < height; j++){
				input[i][j] = Integer.parseInt(inputLineArray[j]);
			}
		}
		System.out.println("here is the input that you provided");
		printMe(input);
		System.out.println("here is the output");
		printMe(nullify(input));
	}
}

import java.util.Scanner;

/**
 * rotating that image. Good practice to revise indexing.  I think i am getting bored with listening to the same music. :/
 * I am assuming that the image is square so that I can do this inplace and I am implementing right rotation. 
 * @author pbhatnagar
 * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D
 */
public class ImageRotator {
	
	public static int[][] rotateMe(int[][] input, int size, int depth){
	if(depth + 1 >= size - 1)
		return input;
	//there is a two by two array inside
//	else if(size - depth* 2 == 2){
		
		
//	}
		
//		int[] buffer = new int[size];
		//backing up the left most column
		for(int i = 0; i < size - depth * 2 - 1 ; i++){
			int buffer = input[i + depth][ depth];
			input[i + depth][depth] = input[size-1 - depth][depth + i];
			printMe(input);
			input[size - 1 - depth][depth + i] = input[size - 1 - i - depth][size-1 - depth];
			printMe(input);
			input[size - i - 1 - depth][size - 1 - depth] = input[depth][size - 1 - i - depth];
			printMe(input);
			input[depth][size - 1 - i - depth] = buffer;
			printMe(input);
			
		}
		
		return rotateMe(input, size, ++depth);
	}

	public static void printMe(int input[]){
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] + " ");
		}
	}
	public static void printMe(int[][] input){
		System.out.println();
		for(int i = 0; i < input.length; i++){
			for(int j = 0; j < input.length; j++){
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of square image");
		int size = scan.nextInt();
		int[][] input = new int[size][size];
		String inputLine;
		scan.nextLine();
		String[] inputArray;
		for(int i = 0; i < size; i++){
			System.out.println("Enter the " + i +" line separated with spaaces");
			inputLine = scan.nextLine();
			inputArray = inputLine.split(" ");
			for(int j = 0; j < size; j++){
				input[i][j] = Integer.parseInt(inputArray[j]);
			}
		}
		
		System.out.println("You entered the following ");
		printMe(input);
		printMe(rotateMe(input, size, 0));
	}
}

package java1;

public class Java2 {
	public static void main(String [] args) 
	{
		int[][]numbers= {
	

            {10,20,30},
            {40,50,60},
            {70,80,90}

        };

		for(int row=0; row<numbers.length; row++) {

			for(int column=0; column<numbers[row].length; column++) {

				System.out.print(numbers[row][column]+" ");

            }

System.out.println();
}
	}
}


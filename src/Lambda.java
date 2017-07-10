

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		
		/* without return statement */
		Square square = a -> (a*a);
		System.out.println(square.calculateSquare(4));
		
		/* with return statement */
		Square square1 = a -> {
			return a*a;
		};
		
		System.out.println(square.calculateSquare(4));
		

	}

}

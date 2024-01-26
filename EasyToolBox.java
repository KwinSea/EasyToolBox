package EasyTools;

import java.util.Scanner;

/**
 * Purpose: More quality of life methods that makes programing fast and easy
 * <br><br>
 * Author: Deshawn Brown
 * <br><br>
 * Date: 2024-01-12
 */
public class EasyToolBox {
	Scanner scanner = new Scanner(System.in);

	/**
	 * Retrieves an integer input from the user, handling non-integer inputs.
	 *
	 * @param errorMessage Message displayed on non-integer input.
	 * @return User-provided integer input.
	 */
	public int IntInput (String errorMessage) {
		while (true){
			if (!this.scanner.hasNextInt()) {
				System.out.printf(errorMessage);
				this.scanner.nextLine();//Flush to prevent infinite loop
			} else 
				break;
		}
		return this.scanner.nextInt();
	}
	
	/**
	 * Retrieves a double input from the user, handling non-double inputs.
	 *
	 * @param errorMessage Message displayed on non-double input.
	 * @return User-provided double input.
	 */
	public double DoubleInput (String errorMessage) {
		while (true){
			if (!this.scanner.hasNextDouble()) {
				System.out.printf(errorMessage);
				this.scanner.nextLine();//Flush to prevent infinite loop
			} else
				break;
		}
		return this.scanner.nextDouble();
	}
	
	/**
	 * Retrieves a float input from the user, handling non-float inputs.
	 *
	 * @param errorMessage Message displayed on non-float input.
	 * @return User-provided float input.
	 */
	public float FloatInput (String errorMessage) {
		while (true){
			if (!this.scanner.hasNextFloat()) {
				System.out.printf(errorMessage);
				this.scanner.nextLine();//Flush to prevent infinite loop
			} else
				break;
		}
		return this.scanner.nextFloat();
	}

	/**
	 * Retrieves an integer input within a specified range from the user.
	 *
	 * @param min                     Minimum allowed value.
	 * @param max                     Maximum allowed value.
	 * @param validationErrorMessage Message displayed on non-integer input.
	 * @param rangeErrorMessage       Message displayed if the input is out of range.
	 * @return User-provided integer input within the specified range.
	 */
	public int InRangeInput(int min, int max, String validationErrorMessage, String rangeErrorMessage) {
		int input;
		
		while (true) {
			input = IntInput(validationErrorMessage);
			if (!(input >= min && input <= max)) {
				System.out.printf(rangeErrorMessage, min, max);
				this.scanner.nextLine();
			}
			else 
				break;
		}
		return input;
	}// End of method
	
	/**
	 * Retrieves a double input within a specified range from the user.
	 *
	 * @param min                     Minimum allowed value.
	 * @param max                     Maximum allowed value.
	 * @param validationErrorMessage Message displayed on non-double input.
	 * @param rangeErrorMessage       Message displayed if the input is out of range.
	 * @return User-provided double input within the specified range.
	 */
	public double InRangeInput(double min, double max, String validationErrorMessage, String rangeErrorMessage) {
		double input;

		while (true) {
			input = DoubleInput(validationErrorMessage);
			if (!(input >= min && input <= max)) {
				System.out.printf(rangeErrorMessage, min, max);
				this.scanner.nextLine();
			}
			else
				break;
		}
		return input;
	}// End of method
	
	/**
	 * Retrieves a float input within a specified range from the user.
	 *
	 * @param min                     Minimum allowed value.
	 * @param max                     Maximum allowed value.
	 * @param validationErrorMessage Message displayed on non-float input.
	 * @param rangeErrorMessage       Message displayed if the input is out of range.
	 * @return User-provided float input within the specified range.
	 */
	public float InRangeInput(float min, float max, String validationErrorMessage, String rangeErrorMessage) {
		float input;

		while (true) {
			input = FloatInput(validationErrorMessage);
			if (!(input >= min && input <= max)) {
				System.out.printf(rangeErrorMessage, min ,max);
				this.scanner.nextLine();
			}
			else
				break;
		}
		return input;
	}// End of method
}// End Class

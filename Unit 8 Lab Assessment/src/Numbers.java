import java.util.Arrays;

public class Numbers {

	private int num;
	
	public void setNum(int number){
		num = number;
	}
	public static boolean isGoofy(int number) {
		/**int sum = 0; 
		int number = num;
		while (num > 0)
		{
			int dig = num % 10;
			if (dig != 0 && number % dig == 0){
				sum = sum + dig;
			}
			num = num / 10;
		}
		return (sum != 0 && sum % 2 != 0);**/
		
		String numString = Integer.toString(num);
		int sum = 0;
		for (int i = 0; i < numString.length(); i++) {
			int a = numString.charAt(i);
			if (num % a == 0) {
				sum = sum + a;	
			}
			if (sum % 2 != 0 && sum > 0){
				return true;
			}
		}
		return false;
	}
	
	public int[] getSomeGoofyNumbers(int count) {
		
		/**int[] ray = new int[count];
		for (int i = 0, x = 1 ; i < count; x++){
			if(isGoofy(x)) {
				ray[i] = x;
				i++;
			}
		}
		
		return ray; 
	} **/
		
		int[] array = new int[count];
		for (int i = 0; i < count; i++)
			if (isGoofy(num) == true){
				array[i] = num;
		}
		return array;
	}
	
public static void main (String args[]) {
		
		Numbers one = new Numbers();
		System.out.println(one.isGoofy(12));
		System.out.println(Arrays.toString(one.getSomeGoofyNumbers(12)));
	
		}
}


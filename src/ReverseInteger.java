/*
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
public class ReverseInteger {
	public static int reverse(int x) {
		if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
			return 0;
		} else {
			StringBuilder yString = new StringBuilder();
			yString.append(Integer.toString(x));
			//if number was not negative
			if(yString.charAt(0) != '-') {
				yString = yString.reverse();
				if(Long.parseLong(yString.toString()) > Integer.MAX_VALUE || 
						Long.parseLong(yString.toString()) < Integer.MIN_VALUE) {
					return 0;
				} else {
					return Integer.parseInt(yString.toString());
				} 
			}else {
				//number is negative
				yString.deleteCharAt(0);
				yString = yString.reverse();
				yString.insert(0, "-");
				if(Long.parseLong(yString.toString()) > Integer.MAX_VALUE || 
						Long.parseLong(yString.toString()) < Integer.MIN_VALUE) {
					return 0;
				} else {
					return Integer.parseInt(yString.toString());
				}
			}
		}
	}
}

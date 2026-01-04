package utilities;

public class RandomUtility {
	 public static String getUniqueText(String baseText) {
	        return baseText + "_" + System.currentTimeMillis();
	    }
}

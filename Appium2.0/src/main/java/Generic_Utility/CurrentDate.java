package Generic_Utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;

public class CurrentDate {
	
	public String Random_Number() {
		Date date = new Date();
		 String timeStamp = new SimpleDateFormat("hhmmss").format(date);
		 return timeStamp;
	}
	
}

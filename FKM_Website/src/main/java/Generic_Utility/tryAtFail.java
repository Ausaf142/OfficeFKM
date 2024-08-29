package Generic_Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class tryAtFail implements IRetryAnalyzer  {
	int retry_count=1;
	int max_retry=2;

public boolean retry(ITestResult result) {
	if (retry_count < max_retry) {
		retry_count++;
        return true;
    }
	return false;
}
}


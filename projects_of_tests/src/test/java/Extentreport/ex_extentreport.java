package Extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ex_extentreport {
	static ExtentReports extent;
	//static ExtentSparkReporter spark;
	public static ExtentReports  getInstance() {
		  
		if(extent==null) {
			ExtentSparkReporter sparkReporter=new ExtentSparkReporter("target/Spark.html");
			sparkReporter.config().setReportName("Amazon shop test Report");
			sparkReporter.config().setDocumentTitle("Automation Results");
			
			
			extent =new ExtentReports();
			extent.attachReporter(sparkReporter);
			
		}
		
		return extent;
		
	}
	
}
	
	
	
	
	
	
 
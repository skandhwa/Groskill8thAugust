package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ConstantData.ConstantsDataPath;

public class ExtentReportManager {
	
	private static ExtentReports extent;
	
	
	public static ExtentReports getReportInstance()
	
	{
	if(extent==null)
	{
		
		ExtentSparkReporter spark=new ExtentSparkReporter(ConstantsDataPath.EXTENTREPORTPATH);
		 
		extent=new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("User","Saurabh");
		
		
		
	}
	
	return extent;
	
	
	}

}

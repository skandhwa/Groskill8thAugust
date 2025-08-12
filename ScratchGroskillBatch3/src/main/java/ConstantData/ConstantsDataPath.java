package ConstantData;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConstantsDataPath {
	 static String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
	public final static String PROPFILEPATH="src\\main\\java\\Global.properties";
    public final static String EXCELPATH="src\\main\\java\\TestData\\TestData31stJuly.xlsx";
    public static final  String EXTENTREPORTPATH="Reports\\ExtentReport"+timestamp+".html";
    
    
    
}

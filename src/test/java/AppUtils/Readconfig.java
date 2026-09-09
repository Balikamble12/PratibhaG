package AppUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	Properties pro;
	
public Readconfig() {
		try {
		FileInputStream fis =new FileInputStream("./config/config.properties");
		pro=new Properties();
		pro.load(fis);
		
	}catch(Exception e)
		{
		e.getMessage();
		}
}

public String getUrl() {
	return pro.getProperty("url");
	}
	
	public String getpwd() {
		return pro.getProperty("password");
	}
	public String getusername() {
		return pro.getProperty("username");
	}
	public String AddAdminpwd() {
		return pro.getProperty("AddUserpwd");
	}

	public String getReportPath() {
		// TODO Auto-generated method stub
		return null;
	}
}

	



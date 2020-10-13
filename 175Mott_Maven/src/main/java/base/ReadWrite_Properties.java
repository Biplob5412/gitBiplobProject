package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadWrite_Properties {
	
	public Properties readPropertiesFile(String path) throws IOException  {
		InputStream inputStream=new FileInputStream(path);
		
		Properties properties = new Properties();
		properties.load(inputStream);
		return properties;
		
		
		
		
	}
	
	
	

}

package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;

public class PropertiesFile {
	static Properties prop;

	public static void main(String[] args) throws IOException {
		readPropertiesFile();
		writePropertiesFile();
	}

	public static void readPropertiesFile() {

		 prop = new Properties();
		try {	
			InputStream    input = new FileInputStream("C:\\Learn\\Test\\src\\config\\config.properties");
			prop.load(input);
			prop.getProperty("browser");	
			System.out.println(prop.getProperty("browser"));

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writePropertiesFile() throws IOException {
		FileOutputStream    output = new FileOutputStream("C:\\Learn\\Test\\src\\config\\config.properties");
		prop.setProperty("output", "pass");
		prop.store(output, "print");
		System.out.println();		
	}

}

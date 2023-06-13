package basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//step 1:convert physical file into java readable object
		//new FileInputStream(); throws FileNotFoundException
          FileInputStream exdata= new FileInputStream("./basic/data.properties");

          //Steps @:create an instance for properties object
          //properties class is available in java.util package
          Properties property= new Properties();
          //step 3: load all key value pairs into properties object
          //load() throws IOexception
          property.load(exdata);
          
          //step 4: fetch data using key
          
          
          System.out.println(property.getProperty("url"));
          System.out.println(property.getProperty("browser"));
          System.out.println(property.getProperty("time"));
          System.out.println(property.getProperty("pass1"));

          property.put("url","www.goolgle");
          property.put("psd2","2312");
          FileOutputStream exdata1=new FileOutputStream ("./basic/data.properties");
          property.store(exdata1,"new");
          
	}

}

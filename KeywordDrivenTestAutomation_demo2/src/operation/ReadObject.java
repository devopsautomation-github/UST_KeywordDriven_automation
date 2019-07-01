package operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {

	Properties p = new Properties();

	public Properties getProperties() throws IOException {
		InputStream stream = new FileInputStream(new File(
				"C:\\Users\\user\\eclipse-workspace\\KeywordDrivenTestAutomation_demo2\\src\\objects\\object.properties"));
		p.load(stream);

		return p;

	}

}

package mybatisgenerator;


import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MyBatisGeneratorTest {

	public static void main(String[] args) throws InvalidConfigurationException, IOException, XMLParserException {
		List<String> list= new  ArrayList<>();
		boolean overWrite =true;
		File configFile =new File("generatorConfig.xml");
		ConfigurationParser parser = new ConfigurationParser(list);
		org.mybatis.generator.config.Configuration configuration =parser.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overWrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration,
				callback, list);
		try {
			myBatisGenerator.generate(null);
		} catch (SQLException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

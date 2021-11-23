package net.jadu.loadproperty;

import net.jadu.basepage.BasePage;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperty extends BasePage {

    String projectPath = System.getProperty("user.dir");

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream(projectPath + "/src/test/resources/propertyfile/config.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);

    }

}

package com.securisk.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	Properties Prop;

	public Readconfig() {
		File src = new File("./system.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			Prop = new Properties();
			Prop.load(fis);
		} catch (IOException e) {
			System.out.println("exception e:" + e.getMessage());
			e.printStackTrace();
		}
	}

	// Navigate to Url
	public String appURL() {
		String URL = Prop.getProperty("baseurl");
		return URL;
	}

//Enter username
	public String enterUser() {
		String EUser = Prop.getProperty("username");
		return EUser;
	}

	// Enter Password
	public String enterPwd() {
		String EPwd = Prop.getProperty("password");
		return EPwd;
	}

}

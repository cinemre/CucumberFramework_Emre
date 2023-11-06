package com.neotech.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	private static Properties prop;

	/**
	 * 
	 * This method will read the properties file
	 * @param filepath
	 */

	public static void readProperties(String filePath) {

		FileInputStream fis;
		try {
			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis); // 2nd catch is for the fis if smth wrong with fis
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("The file path is wrong");
			//e.printStackTrace();
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("I couldnt read the file");

		}
	}

	/**
	 * This method will return the value for a spesific key
	 * 
	 * @param key
	 * @return String value
	 */
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}

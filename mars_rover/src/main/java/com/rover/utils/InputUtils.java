package com.rover.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputUtils {
	
	private static InputUtils inputUtils;
	private String upperRightCoord;
	private ArrayList<String> inputPairs;
	
	private InputUtils() {}
	
	public String getUpperRightCoord() {
		return upperRightCoord;
	}

	public void setUpperRightCoord(String upperRightCoord) {
		this.upperRightCoord = upperRightCoord;
	}

	public ArrayList<String> getInputPairs() {
		return inputPairs;
	}

	public void setInputPairs(ArrayList<String> inputPairs) {
		this.inputPairs = inputPairs;
	}

	public static InputUtils getInputUtils(String filePath, String urc) {
	    System.out.println("input");
		if(inputUtils != null) {
			return inputUtils;
		}
		inputUtils = new InputUtils();
		inputUtils.setUpperRightCoord(urc);
		inputUtils.setInputPairs(readFromFile(filePath));
		
		 return inputUtils;
	}
	
	private static ArrayList<String> readFromFile(String filePath) {
	    FileReader fr;
	    BufferedReader br;
	    String line;
	    ArrayList<String> inputPairs = new ArrayList<String>();
	    try {
		fr = new FileReader(filePath);
		br = new BufferedReader(fr);
		if ((line = br.readLine()) != null) 
			inputPairs.add(line);
	
	while (line != null) {
		if ((line = br.readLine()) != null) {
			inputPairs.add(line);
			line = br.readLine();
			inputPairs.add(line);
		}
	}
	    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
	    }
	   
	    return inputPairs;
	}
	
}

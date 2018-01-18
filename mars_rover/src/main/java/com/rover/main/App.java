package com.rover.main;

import com.rover.utils.InputUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	System.out.println("Main");
        InputUtils.getInputUtils(args[0], "5,5");
    }
}

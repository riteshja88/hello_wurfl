package com.mycompany.app;

import com.scientiamobile.wurfl.core.Device;
import com.scientiamobile.wurfl.core.GeneralWURFLEngine;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		// wurfl.xml path can be either absolute or relative to the application classpath root.
        GeneralWURFLEngine wurfl = new GeneralWURFLEngine("wurfl.zip");
        // load method is available on API version 1.8.1.0 and above
        wurfl.load();

		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(streamReader);

		do {
			try {
				String user_agent = bufferedReader.readLine();
				if(null == user_agent) {
					break;
				}
				//String user_agent = "Mozilla/5.0 (Linux; Android 4.2.1; N9600 Build/JOP40D) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.111 Mobile Safari/537.36";
				System.out.print(wurfl.isUaFrozen(user_agent));
				System.out.print(" ");
				System.out.println(user_agent);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}while(true);
    }
}

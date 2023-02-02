package com.mycompany.app;

import com.scientiamobile.wurfl.core.Device;
import com.scientiamobile.wurfl.core.GeneralWURFLEngine;
import com.scientiamobile.wurfl.core.request.DefaultWURFLRequest;
import com.scientiamobile.wurfl.core.request.WURFLRequest;

import java.io.*;
import java.util.*;
import com.google.gson.*;


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
				String sua_json = bufferedReader.readLine();
				if(null == sua_json) {
					break;
				}
				//String sua_json = "{\"browsers\":[{\"Not A;Brand\":\"99.0.0.0\"},{\"Chromium\":\"99.0.4844.88\"},{\"Google Chrome\":\"99.0.4844.88\"}],\"platform\":{\"Android\":\"12\"},\"mobile\":\"1\",\"architecture\":\"arm\",\"bitness\":\"64\",\"model\":\"Pixel 6\"}";

				Map<String,String> headers = new HashMap<>();



				//System.out.println("abc" + sua_json + "pqr");
				if (!sua_json.equals("null")) {
				JsonObject sua_object = new Gson().fromJson(sua_json, JsonObject.class);
				// Construct and assemble a HTTP request
					String sec_ch_ua = "";
					String sec_ch_ua_full_version = "";

					JsonArray browsers_array = sua_object.getAsJsonArray("browsers");
					if(null != browsers_array) {
						for (int i = 0; i<browsers_array.size(); i++) {
							String brand = "";
							String brand_full_version = "";
							JsonObject browser_object = browsers_array.get(i).getAsJsonObject();
							if (null != browser_object.get("brand")) {
								String browser = browser_object.get("brand").getAsString();
								brand += "\"" + browser + "\"" + ";v=\"";
								brand_full_version += "\"" + browser + "\"" + ";v=\"";
							}
							JsonArray browser_versions_array = browser_object.getAsJsonArray("version");
							if (null != browser_versions_array) {
								brand += browser_versions_array.get(0).getAsString() + "\", ";
								brand_full_version += browser_versions_array.get(0).getAsString();
								for (int j = 1; j < browser_versions_array.size(); j++) {
									brand_full_version += "." + browser_versions_array.get(j).getAsString();
								}
								brand_full_version += "\", ";
							}
							sec_ch_ua += brand;
							sec_ch_ua_full_version += brand_full_version;
						}

						if(sec_ch_ua.length() > 0) {
							sec_ch_ua = sec_ch_ua.substring(0, sec_ch_ua.length() - 2);
							sec_ch_ua_full_version = sec_ch_ua_full_version.substring(0, sec_ch_ua_full_version.length() - 2);

							headers.put("Sec-Ch-Ua", sec_ch_ua);
							//System.out.println("Sec-Ch-Ua: " + sec_ch_ua);

							headers.put("Sec-Ch-Ua-Full-Version-List", sec_ch_ua_full_version);
							//System.out.println("Sec-Ch-Ua-Full-Version-List: " + sec_ch_ua_full_version);
						}
					}


					// Let's parse the platform value now
					String platform = "";
					String platform_version = "";
					JsonObject platform_object = sua_object.getAsJsonObject("platform");
					if (null != platform_object) {
						if (null != platform_object.get("brand")) {
							platform = platform_object.get("brand").getAsString();
							headers.put("Sec-Ch-Ua-Platform", platform);
							//System.out.println("Sec-Ch-Ua-Platform: " + platform);
						}
						JsonArray platform_versions_array = platform_object.getAsJsonArray("version");
						if (null != platform_versions_array) {
							platform_version = platform_versions_array.get(0).getAsString();
							for (int i = 1; i <platform_versions_array.size(); i++) {
								platform_version += "." + platform_versions_array.get(i).getAsString();
							}
							headers.put("Sec-Ch-Ua-Platform-Version", platform_version);
							//System.out.println("Sec-Ch-Ua-Platform-Version:" +  platform_version);
						}
					}

					// Let us get the rest of the UA-CH values now
					String model;
					if(null != sua_object.get("model")) {
						model = sua_object.get("model").getAsString();
						headers.put("Sec-Ch-Ua-Model", model);
						//System.out.println("Sec-Ch-Ua-Model: " + model);
					}

					String bitness;
					if(null != sua_object.get("bitness")) {
						bitness = sua_object.get("bitness").getAsString();
						headers.put("Sec-Ch-Ua-Bitness", bitness);
						//System.out.println("Sec-Ch-Ua-Bitness: " + bitness);
					}

					String architecture;
					if(null != sua_object.get("architecture")) {
						architecture = sua_object.get("architecture").getAsString();
						headers.put("Sec-Ch-Ua-Architecture", architecture);
						//System.out.println("Sec-Ch-Ua-Architecture: " + architecture);
					}
				
					String mobile;
					if(null != sua_object.get("mobile")) {
						mobile = sua_object.get("mobile").getAsString();
						headers.put("Sec-Ch-Ua-Mobile", mobile);
						//System.out.println("Sec-Ch-Ua-Mobile: " +  mobile);
					}
				}


				WURFLRequest req = new DefaultWURFLRequest(headers);

				System.out.print(wurfl.headerQuality(req));
				System.out.print(" ");
				System.out.println(sua_json);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}while(true);
    }
}

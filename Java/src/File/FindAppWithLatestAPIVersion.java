package File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
/*
 * You are in Section 7: Out of Date Apps, question 1 of 1. This is the last section.

All Latest APIs
A company has a number of mobile apps that they sell to customers, and each app uses one or more REST APIs. All REST APIs are given version numbers like v1, v2, v3, ... etc. which are incremented each time the REST API team releases a new version of the API to the app teams.

Consider a file input.txt which contains information about which versions of the various APIs are being used by the current release of each app of the company:

Mail App, Authentication API, v6
Video Call App, Authentication API, v7
Mail App, Data Storage API, v10
Chat App, Data Storage API, v11
Mail App, Search API, v6
Chat App, Authentication API, v8
Chat App, Presence API, v2
Video Call App, Data Storage API, v11
Video Call App, Video Compression API, v3
Each line of this file consists of 3 comma-separated fields. The first field is a app name, the second field is a API name, and the third field is the API version number used by that app. The example given above indicates that the Mail App, uses version v7 of the Authentication API, and the Video Call App uses version v7 of the Authentication API, and the Mail App also uses version v10 of the Data Storage API, and so on. For the purposes of this program, assume that all version numbers are of the form v<digits> where <digits> represents one or more decimal digits.

Write a program in a language of your choice (although we prefer C/C++/Python) that reads this file, figures out which is the latest version number of each API, and then prints the names of apps which are using the latest version of all the APIs that it uses. Special Note: if a API has only one version, then that version is obviously considered the latest version.

Thus, in case of the example input given above, the output of your program should be:

Chat App
because Chat App is using 3 APIs, and it is using the latest versions of all 3 of those APIs. Mail App is not listed, because it is using oldest versions of the Authentication API as well as the Data Storage API, and Video Call App is not listed because it is using an older version of the Authentication API. Please read the example carefully to understand exactly what you're expected to do.
 * */
public class FindAppWithLatestAPIVersion {

	public static void main(String[] args) {
		String filename="D:\\New folder\\ProgramCollections\\input.txt";
		Scanner scanner = null;
		try
		{
		    FileInputStream fileInputStream=new FileInputStream(filename);
		    scanner=new Scanner(fileInputStream);
		    
		    // this will read data till the end of data.
		    while(scanner.hasNext())
		    {
		    	String data=scanner.nextLine();
		    	String s[]=data.split(", ");
		    	System.out.println(s[0]+" "+s[1]+" "+s[2]);
		    }
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}

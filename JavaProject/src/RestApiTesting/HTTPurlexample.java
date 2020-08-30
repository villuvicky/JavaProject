package RestApiTesting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class HTTPurlexample {

	public void geturlExample() throws IOException {

		URL url= new URL("https://reqres.in/api/users");
		HttpURLConnection  connection=(HttpURLConnection) url.openConnection();

		connection.setRequestMethod("GET");	
		connection.connect();
		int statusCode=connection.getResponseCode();
		System.out.println(statusCode);
		String message=connection.getResponseMessage();
		System.out.println(message);

		InputStream input=connection.getInputStream();
		InputStreamReader reader= new InputStreamReader(input);
		BufferedReader Bufferedreader= new BufferedReader(reader);
		StringBuffer buffer= new StringBuffer();
		String line;
		while((line=Bufferedreader.readLine())!=null) {

			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public static void main(String[] args) throws IOException {
		HTTPurlexample example= new HTTPurlexample();
		example.geturlExample();
	}

}

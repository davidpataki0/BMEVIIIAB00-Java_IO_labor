package lab3;
import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main extends Functions{
	public static void main(String[] args) {
		String start = System.getProperty("user.dir");
		File f = new File(start);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = reader.readLine()) != null)
		{
			String[] cmdline = line.split(" ");
			switch(cmdline[0]) {
			case "exit":
				exit(cmdline);
				break;
			}
			
		}
	}

}

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		File f = new File("D://file1.txt");
		FileOutputStream fos= new FileOutputStream(f); 
		fos.close();
	}
}

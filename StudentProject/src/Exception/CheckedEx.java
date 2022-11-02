package Exception;


	import java.io.File;
	import java.io.FileInputStream;
    import java.io.FileNotFoundException;
	 
	public class CheckedEx { 
	    public void readFile() throws FileNotFoundException {
	        String fileName = "file does not exist";
	        File file = new File(fileName);
	        FileInputStream stream = new FileInputStream(file);
	    }

}
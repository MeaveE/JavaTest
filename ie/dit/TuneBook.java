package ie.dit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;

public class TuneBook
{

	ArrayList<String> tunes = new ArrayList<String>();


	public TuneBook(String[] file) throws IOException
	{

		BufferReader inputStream = null;

   	 try {

    	inputStream = new BufferedReader(new FileReader(concat(file".abc"));
            in = new FileInputStream(concat(file".abc"));
            int c;

            while ((c = in.read()) != -1) {
                tunes.add(1);
            }
        } 
    	finally {
            if (in != null) {
                in.close();
            }
     	}
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.Tune(x,title,altTitle);
	}

}
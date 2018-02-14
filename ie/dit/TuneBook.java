package ie.dit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;

public class TuneBook
{

	ArrayList<String> Tunes = new ArrayList<String>(x,title,altTitle);

	public TuneBook(String[] hnj0) throws IOException
	{

		BufferReader inputStream = null;

   	 try {

    	inputStream = new BufferedReader(new FileReader(hnj0.abc));
            in = new FileInputStream(hnj0.abc);
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
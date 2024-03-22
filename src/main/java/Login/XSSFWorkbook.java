package Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
 
public class XSSFWorkbook {
 
	XSSFWorkbook workBook;

	XSSFSheet sheet;

	public XSSFWorkbook(String filepath) throws IOException {

		File name=new File(filepath);

				try {

					FileInputStream  stream=new FileInputStream(filepath);

				} catch (FileNotFoundException e) {

					// TODO Auto-generated catch block

					e.printStackTrace();

				}

				workBook=new XSSFWorkbook(filepath);

	}

}


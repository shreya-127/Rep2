package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class valuefromuser {
	
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		valuefromuser xr= new valuefromuser();
		Scanner sc= new Scanner(System.in);
		System.out.println("Total number of R-C you want");
		xr.writeCell(sc.nextInt(),sc.nextInt());
		
	}
public void writeCell(int row, int coloumn) throws IOException, RowsExceededException, WriteException {
	File f = new File("C:\\Users\\SHREYA\\Desktop\\Filewrite6.xls");
	WritableWorkbook wk= Workbook.createWorkbook(f);
	WritableSheet ws= wk.createSheet("Test1",1);
	Scanner sc= new Scanner(System.in);
	for(int i=0; i<row; i++)
	{
		for(int j=0;j<coloumn;j++)
		{
			System.out.println("Row=" + i + "Cloumn" + j);
			Label l =new Label(j,i, sc.nextLine());
			ws.addCell(l);
		}
		wk.write();
		wk.close();
	}

	}

}

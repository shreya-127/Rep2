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

public class wfrmultiplec {
	
	public void Write(int row, int coloumn) throws IOException, RowsExceededException, WriteException {
		File f = new File("C:\\Users\\SHREYA\\Desktop\\Filewrite5.xls");
		WritableWorkbook ww = Workbook.createWorkbook(f);
		WritableSheet ws = ww.createSheet("Java",0);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value to insert");
		for(int i=0;i<=4;i++)
		{
			Label l = new Label(i,row-1,sc.nextLine());
			ws.addCell(l);
		}
		ww.write();
		ww.close();
	}
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		wfrmultiplec xc= new wfrmultiplec();
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter R-C");
		xc.Write(s1.nextInt(), s1.nextInt());
		
	}


}


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

public class Writexls {
	public void Write(int row, int coloumn) throws IOException, RowsExceededException, WriteException {
		File f = new File("C:\\Users\\SHREYA\\Desktop\\Sheet_1s.xls");
		WritableWorkbook ww = Workbook.createWorkbook(f);
		WritableSheet ws = ww.createSheet("Shreya", 0);
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter value to insert");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coloumn;j++)
			{
				Label l = new Label(j,i,sc.nextLine());
				ws.addCell(l);
			}
		}
		ww.write();
		ww.close();
		
	}
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		Writexls xw= new Writexls();
		Scanner s1
		=new Scanner(System.in);
        System.out.println("Enter value");
        xw.Write(s1.nextInt(),s1.nextInt());
	}

}

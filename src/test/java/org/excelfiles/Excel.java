package org.excelfiles;
import java.io.IOException;
import org.utility.BaseClass;


public class Excel extends BaseClass {
	public static void main(String[] args) throws IOException {

		createExcel("Excel", "Page1", 1, 0, "UserName");
		addExcelCellValues("Excel", "Page1", 1, 1, "Password");
		addExcelCellValues("Excel", "Page1", 1, 2, "DOB");
		addExcelCellValues("Excel", "Page1", 1, 3, "MobileNumber");
		addExcelRowValues("Excel", "Page1", 2, 0, "Srinivasan");
		addExcelCellValues("Excel", "Page1", 2, 1, "9876543210");
		addExcelCellValues("Excel", "Page1", 2, 2, "09-12-1997");
		addExcelCellValues("Excel", "Page1", 2, 3, "9999999999");
		System.out.println("Done!!!");
				
	}

}

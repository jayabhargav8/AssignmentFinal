package com.sales.SpringBootApplication.helper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.sales.SpringBootApplication.model.SalesDetails;

public class ExcelHelper {
	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	static String[] HEADERs = { "Id", "Transaction_date", "Product", "Price", "Payment_Type", "Name", "City", "State",
			"Country", "Account_Created", "Last_Login", "Latitude", "Longitude", };
	static String SHEET = "sales";

	public static boolean hasExcelFormat(MultipartFile file) {

		if (!TYPE.equals(file.getContentType())) {
			return false;
		}

		return true;
	}

	public static ByteArrayInputStream tutorialsToExcel(List<SalesDetails> sales) {

		try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
			Sheet sheet = workbook.createSheet(SHEET);

			Row headerRow = sheet.createRow(0);

			for (int col = 0; col < HEADERs.length; col++) {
				Cell cell = headerRow.createCell(col);
				cell.setCellValue(HEADERs[col]);
			}

			int rowIdx = 1;
			for (SalesDetails salesDetails : sales) {
				Row row = sheet.createRow(rowIdx++);

				row.createCell(0).setCellValue(salesDetails.getId());
				row.createCell(1).setCellValue(salesDetails.getTransaction_date());
				row.createCell(2).setCellValue(salesDetails.getProduct());
				row.createCell(3).setCellValue(salesDetails.getPrice());
				row.createCell(4).setCellValue(salesDetails.getPament_type());
				row.createCell(5).setCellValue(salesDetails.getName());
				row.createCell(6).setCellValue(salesDetails.getCity());
				row.createCell(7).setCellValue(salesDetails.getState());
				row.createCell(8).setCellValue(salesDetails.getAccount_created());
				row.createCell(9).setCellValue(salesDetails.getLast_login());
				row.createCell(10).setCellValue(salesDetails.getLatitude());
				row.createCell(11).setCellValue(salesDetails.getLongitude());

			}

			workbook.write(out);
			return new ByteArrayInputStream(out.toByteArray());
		} catch (IOException e) {
			throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
		}
	}

	public static List<SalesDetails> excelToSales(InputStream is) {
		try {
			Workbook workbook = new XSSFWorkbook(is);

			Sheet sheet = workbook.getSheet(SHEET);
			Iterator<Row> rows = sheet.iterator();

			List<SalesDetails> saless = new ArrayList<SalesDetails>();

			int rowNumber = 0;
			int i = 0;
			while (rows.hasNext()) {
				Row currentRow = rows.next();

				if (rowNumber == 0) {
					rowNumber++;
					continue;
				}

				Iterator<Cell> cellsInRow = currentRow.iterator();

				SalesDetails sdetails = new SalesDetails();

				int cellIdx = 0;
				while (cellsInRow.hasNext()) {
					Cell currentCell = cellsInRow.next();

					switch (cellIdx) {
					case 0:
						sdetails.setId((int) currentCell.getNumericCellValue());
						break;

					case 1:
						sdetails.setTransaction_date(Timestamp.valueOf(currentCell.getLocalDateTimeCellValue()));
						break;

					case 2:
						sdetails.setProduct(currentCell.getStringCellValue());
						break;

					case 3:
						sdetails.setPrice((int) currentCell.getNumericCellValue());
						break;

					case 4:
						sdetails.setPament_type(currentCell.getStringCellValue());
						break;
					case 5:
						sdetails.setName(currentCell.getStringCellValue());
						break;
					case 6:
						sdetails.setCity(currentCell.getStringCellValue());
						break;

					case 7:
						sdetails.setState(currentCell.getStringCellValue());
						break;
					case 8:
						sdetails.setCountry(currentCell.getStringCellValue());
						break;
					case 9:
						sdetails.setAccount_created(Timestamp.valueOf(currentCell.getLocalDateTimeCellValue()));
						break;
					case 10:
						sdetails.setLast_login(Timestamp.valueOf(currentCell.getLocalDateTimeCellValue()));
						break;
					case 11:
						sdetails.setLatitude((float) currentCell.getNumericCellValue());
						break;

					case 12:
						sdetails.setLongitude((float) currentCell.getNumericCellValue());
						break;

					default:
						break;
					}

					cellIdx++;
				}

				saless.add(sdetails);
			}

			workbook.close();

			return saless;
		} catch (IOException e) {
			throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
		}
	}
}

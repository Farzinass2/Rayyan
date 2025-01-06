package snippet;

public class Snippet {
	f=new FileInputStream("https://d.docs.live.net/f76f3357ef8ef8f7/Obsqura/ExcelRead01.xlsx");
			w=new XSSFWorkbook(f);
			sh=w.getSheet("sheet1");
			Row r=sh.getRow(a);
			Cell c=r.getCell(b);
			return c.getStringCellValue();
}


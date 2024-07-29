import java.io.IOException;



import ch.qos.logback.core.net.SyslogOutputStream;
import de.redsix.pdfcompare.PdfComparator;
import de.redsix.pdfcompare.RenderingException;

public class test1 {
	
	static  String file1="C:\\Learn\\PdfComparision\\Data\\MohanSResume1.pdf";
	static String file2="C:/Learn/PdfComparision/Data/MohanSResume2.pdf";
	static String resultFile="./ResultSet/result.pdf";

	public static void main(String[] args) throws RenderingException, IOException {
		// TODO Auto-generated method stub
		

		new PdfComparator(file1,file2).compare().writeTo(resultFile);
		System.out.println("Process Completed");
		String  proj =System.getProperty("user.dir");
		System.out.println(proj);
		

	}

}

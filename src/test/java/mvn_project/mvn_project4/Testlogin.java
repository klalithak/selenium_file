package mvn_project.mvn_project4;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Testlogin {
	@Test
	public void logintest() {
		ArrayList data = ExcelReader.getdata("E://salesforce excel//salesforcelogin.xlsx");
		Keywords key = new Keywords();
		for(int i=0;i<data.size();i++) {
			if(data.get(i).equals("open")) {
				key.open();
			}
			if(data.get(i).equals("url")) {
				String httpurl = data.get(i+1).toString();
				key.url(httpurl);
			}
 				if(data.get(i).equals("input")) {
	 				String testdata = data.get(i+1).toString();
					String objectname = data.get(i+2).toString();
					key.input(testdata, objectname);
				}
				if(data.get(i).equals("click")) {
				String objectname = data.get(i+2).toString();
				key.click(objectname);
				}
				if(data.get(i).equals("close")) {
					key.close();
				}
				
		}
		
		
	}

}
 
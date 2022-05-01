package mvn_project.mvn_project4;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class CreatetrialAccount {
@Test
	public void createtrialAccount() {
	ArrayList data = ExcelReader.getdata("E://salesforce excel//createtrialaccount.xlsx");
	Keywords key = new Keywords();
	for(int i =0;i<data.size();i++) {
		if(data.get(i).equals("open")) {
			key.open();
		}
		if(data.get(i).equals("url")) {
			String testdata = data.get(i+1).toString();
			key.url(testdata);
		}
		if(data.get(i).equals("inputbyname")) {
			String testdata = data.get(i+1).toString();
			String objectname = data.get(i+2).toString();
			key.inputbyname(testdata,objectname );
	}
		if(data.get(i).equals("selectname")) {
			String testdata =  data.get(i+1).toString();
			String objectname = data.get(i+2).toString();
			key.selectname(testdata,objectname );
	
		}
	
}
}
}
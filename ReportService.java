package in.varunit.Service;



import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.varunit.Utils.DateUtils;

@Service
public class ReportService {
	
	@Autowired
	private DateUtils dateutils;

	public void generatereport()
	{
		LocalDate date = dateutils.getDate();
		System.out.println("Report generated for ::" +date);
	}
}

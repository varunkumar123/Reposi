package in.varunit.Utils;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class DateUtils {
	
	public LocalDate getDate()
	{
		LocalDate now = LocalDate.now();
				return now;
	}

}

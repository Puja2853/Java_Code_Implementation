package assignment;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {
		
        String string = "2022-05-09";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date); 

	}

}

package utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class will have date and time functionality
 */
public class DateTimeiFunctions {
	Logger log = LogManager.getLogger(DateTimeiFunctions.class);

	/**
	 * generate current date in dd-mmm-yyyy with month as English locale(ex: 05-sep-2023)
	 * @return
	 */
	public String getCurrentDate() {		
		Date date = new Date(); // You can replace this with your own date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String formattedDate = dateFormat.format(date);
        log.info(String.format("formated date %s", formattedDate));
        return formattedDate;
	}

}

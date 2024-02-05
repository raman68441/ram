package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class will have date and time functionality
 */
public class DateTimeiFunctions {
	Logger log = LogManager.getLogger(DateTimeiFunctions.class);

	public static void main(String[] args) {
		DateTimeiFunctions dateTime = new DateTimeiFunctions();
		dateTime.getCurrentTime();

	}

	/**
	 * generate current date month and year in dd-mmm-yyyy with month as English
	 * locale(ex: 05-sep-2023)
	 * 
	 * @return date
	 */
	public String getCurrentDateMonthNameYear() {
		Date date = new Date(); // You can replace this with your own date
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		String formattedDate = dateFormat.format(date);
		log.info(String.format("formated date %s", formattedDate));
		return formattedDate;
	}

	/**
	 * generate current  month date, and year in MM/dd/YYYY with month as English
	 * locale(ex: 09/05/2023)
	 * 
	 * @return date
	 */
	public String getCurrentMonthDateYear() {
		Date date = new Date(); // You can replace this with your own date
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
		String formattedDate = dateFormat.format(date);
		log.info(String.format("formated date %s", formattedDate));
		return formattedDate;
	}

	/**
	 * generate current month and year in month year format as English locale(ex:
	 * January 2024)
	 * 
	 * @return month and year
	 */
	public String getCurrentMonthAndYear() {
		Date date = new Date(); // You can replace this with your own date
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM yyyy", Locale.ENGLISH);
		String monthYear = dateFormat.format(date);
		log.info(String.format("formated date %s", monthYear));
		return monthYear;
	}

	/**
	 * generate current date in date format as English locale(ex: 5)
	 * 
	 * @return month and year
	 */
	public String getCurrentDate() {
		Date date = new Date(); // You can replace this with your own date
		SimpleDateFormat dateFormat = new SimpleDateFormat("d", Locale.ENGLISH);
		String currentDate = dateFormat.format(date);
		log.info(String.format("formated date %s", currentDate));
		return currentDate;
	}

	/**
	 * convert month year format to month/year format as English locale(ex: January
	 * to 01)
	 * 
	 * @return month and year
	 */
	public int convertMonthStringToInteger(String month) {
		int convertMonth = 0;
		try {
			Date date = new SimpleDateFormat("MMMM", Locale.ENGLISH).parse(month);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			convertMonth = cal.get(Calendar.MONTH) + 1;
		} catch (ParseException e) {
			log.info(e.getMessage());
		}
		return convertMonth;
	}

	public String getCurrentTime() {
		Date date = new Date(); // You can replace this with your own date
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm a", Locale.ENGLISH);
		String time = timeFormat.format(date);
		log.info(String.format("formated t %s", time));
		return time;

	}

	public boolean validateTimeWithInDuration(String actualTime, String expectedTime, String hourFormat, int duration) {
		int timeDifference = 0;
		if (hourFormat.equals("twelve hour")) {
			String actualTimeFormat = actualTime.substring(0, actualTime.length() - 2);
			String[] actualHourSecond = actualTimeFormat.split(":");
			int acutalHour = Integer.valueOf(actualHourSecond[0]);
			int acutalTotalSeconds = (acutalHour * 60) + Integer.valueOf(actualHourSecond[1]);
			String expectedTimeFormat = actualTime.substring(0, expectedTime.length() - 2);
			String[] expectedHourSecond = expectedTimeFormat.split(":");
			int expectedHour = Integer.valueOf(expectedHourSecond[0]);
			int expectedTotalSeconds = (expectedHour * 60) + Integer.valueOf(expectedHourSecond[1]);
			if (expectedTotalSeconds > acutalTotalSeconds) {
				timeDifference = expectedTotalSeconds - acutalTotalSeconds;
			} else {
				timeDifference = acutalTotalSeconds - expectedTotalSeconds;
			}
		}
		if (timeDifference > duration) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * generate current date in date format as English locale(ex: 5)
	 * 
	 * @return month and year
	 */
	public String getCurrentMonth() {
		Date date = new Date(); // You can replace this with your own date
		SimpleDateFormat monthFormat = new SimpleDateFormat("MMM", Locale.ENGLISH);
		String currentMonth = monthFormat.format(date);
		log.info(String.format("formated date %s", currentMonth));
		return currentMonth;
	}
	
	/**
	 * generate current date month and year in dd-MM-yyyy with month as English
	 * locale(ex: 09/05/2023)
	 * 
	 * @return date
	 */
	public String getCurrentDateMonthYear() {
		Date date = new Date(); // You can replace this with your own date
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		String formattedDate = dateFormat.format(date);
		log.info(String.format("formated date %s", formattedDate));
		return formattedDate;
	}
	
}

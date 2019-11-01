import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit; 
import java.time.Period;


public class DateTimeWeek {

	public static void main(String[] args) {
		DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter
                .ofPattern("dd/MM/uuuu'T'HH:mm:ss");
		String fromDate = "03/08/2019T16:20:17";
		String toDate = "26/10/2020T17:22:18";
		
		LocalDateTime ldtFrom = LocalDateTime.parse(fromDate, DATE_TIME_FORMATTER);
		LocalDateTime ldtTo = LocalDateTime.parse(toDate, DATE_TIME_FORMATTER);
		
		long years = ChronoUnit.YEARS.between(ldtFrom, ldtTo);
		if(years > 0) {
			ldtFrom = ldtFrom.plus(Period.ofYears((int) years));
		}
		
		long months = ChronoUnit.MONTHS.between(ldtFrom, ldtTo);
		
		if(months > 0) {
			ldtFrom = ldtFrom.plus(Period.ofMonths((int) months));
		}
		
		long weeks = ChronoUnit.WEEKS.between(ldtFrom, ldtTo);
		
		if(weeks > 0) {
			ldtFrom = ldtFrom.plus(Period.ofWeeks((int) weeks));
		}
		
		long days = ChronoUnit.DAYS.between(ldtFrom, ldtTo);
		
		if(days > 0) {
			ldtFrom = ldtFrom.plus(Period.ofDays((int) days));
		}
		
		long hour  = ChronoUnit.HOURS.between(ldtFrom, ldtTo);
		
		if(hour > 0) {
			ldtFrom = ldtFrom.plus(hour, ChronoUnit.HOURS);
		}
		
		long min = ChronoUnit.MINUTES.between(ldtFrom, ldtTo);
		
		if(min > 0) {
			ldtFrom = ldtFrom.plus(min, ChronoUnit.MINUTES);
		}
		
		long second = ChronoUnit.SECONDS.between(ldtFrom, ldtTo);
		
		
		System.out.println(years +" years "+ months +" months "+ weeks + " weeks " + days +" days " + min + " min " + second + "second " );
		
	}

}

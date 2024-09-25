package lesson12_api;
 
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		// 특정 날짜 및 시간 + 3000일
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));;
		
		long target =  date.getTime() + 3000L * 24 * 60 * 60 * 1000;
		System.out.println(new Date(target));
		
		System.out.println(date.getYear() + 1900);
		Date christmas = new Date(123, 11, 25, 0, 0, 0);
		System.out.println(christmas);
		
		
	}
}

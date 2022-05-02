package pageUIs;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ApiUI {

	public static final String OPTIMIZED_3_SHOWTIMES_URL = "https://app.webinaris.co/api/showtimes?webinaris_id=24042W20110&api_password=1828ad633bf3343088ce4ad36237d6a0";
	public static final String OPTIMIZED_5_SHOWTIMES_URL = "https://app.webinaris.co/api/showtimes?webinaris_id=24043W20110&api_password=82f686c0ef57a37d4bf51cab2167dfd8";
	public static final String OPTIMIZED_7_SHOWTIMES_URL = "https://app.webinaris.co/api/showtimes?webinaris_id=24044W20110&api_password=bdd13002be0948d0249695395994dcbe";
	public static final String OPTIMIZED_SHOWTIMES_20h = "//body[contains(text(), '20:00')]";
	public static final String OPTIMIZED_SHOWTIMES_09h = "//body[contains(text(), '09:00')]";
	public static final String OPTIMIZED_SHOWTIMES_19h = "//body[contains(text(), '19:00')]";
	public static final String OPTIMIZED_SHOWTIMES_18h = "//body[contains(text(), '18:00')]";
	public static final String OPTIMIZED_SHOWTIMES_11h = "//body[contains(text(), '11:00')]";
	public static final String OPTIMIZED_SHOWTIMES_15h = "//body[contains(text(), '15:00')]";

	static String timeStamp = new SimpleDateFormat("dd.MM.yyyy").format(Calendar.getInstance().getTime());

	static String fname = "Minh";
	static String lname = "api_001";
	static String time = "" + timeStamp + "%2018:00"; // format: dd/mm/yyyy%2Bhh:mm
	static String email = "minhbp252+api090401@gmail.com";
	static String timezone = "utc%2B2"; // utc+2
	static String phone = "0963212497";
	static String note = "selenium is the best";
	static String source_id = "123";
	static String utm_content = "content";
	static String utm_source = "source";
	
	public static final String API_NORMAL_URL = "https://webinaris.co/api/?key=24064W20110&is_paid=YES&firstname=" + fname + "&lastname=" + lname
			+ "&ip_address=127.0.0.1&password=1bf050e3994fe2f68349aafd37dff16f&time=" + time + "&email=" + email 
			+ "&timezone=" + timezone + "&phone=" + phone + "&note=" + note + "&source_id=" + source_id 
			+ "&utm_content=" + utm_content + "&utm_source=" + utm_source 
			+ "&utm_campaign= api campaign &utm_medium= api medium &utm_term= api term &affiliate_id= api affid";
	
//	public static final String API_REGISTER_URL = "https://webinaris.co/apiregister/?key=24064W20110&is_paid=YES&firstname=" + fname + "&lastname=" + lname
//			+ "&ip_address=127.0.0.1&password=1bf050e3994fe2f68349aafd37dff16f&time=" + time + "&email=" + email 
//			+ "&timezone=" + timezone + "&phone=" + phone + "&note=" + note + "&source_id=" + source_id 
//			+ "&utm_content=" + utm_content + "&utm_source=" + utm_source 
//			+ "&utm_campaign= api campaign &utm_medium= api medium &utm_term= api term &affiliate_id= api affid";
//	
//	public static final String API_REGISTER_V2_URL = "https://webinaris.co/apiregister2/?key=24064W20110&is_paid=YES&firstname=" + fname + "&lastname=" + lname
//			+ "&ip_address=127.0.0.1&password=1bf050e3994fe2f68349aafd37dff16f&time=" + time + "&email=" + email 
//			+ "&timezone=" + timezone + "&phone=" + phone + "&note=" + note + "&source_id=" + source_id 
//			+ "&utm_content=" + utm_content + "&utm_source=" + utm_source 
//			+ "&utm_campaign= api campaign &utm_medium= api medium &utm_term= api term &affiliate_id= api affid";
	
	public static final String OPTIMIZED_SHOWTIMES_NORMAL_OK = "//body[contains(text(), 'OK')]";
}

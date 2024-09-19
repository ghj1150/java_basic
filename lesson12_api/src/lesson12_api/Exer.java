package lesson12_api;

import java.net.MalformedURLException;
import java.util.Arrays;

public class Exer {
	public static void main(String[] args) throws MalformedURLException {

		String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%AA%A8%EB%91%90%EC%9D%98+%EB%A7%88%EB%B8%94+%EB%A3%B0";
//		str = "https://www.naver.com";

		// 현재 위의 문자열은 5쌍의 key, value
		MyUrl myUrl = new MyUrl(str);
//		System.out.println(myurl);
		myUrl.print();

	}
}

class MyUrl {
	String protocol;
	String domain;
	String filename = "";
	String[] queryStrings;

	public MyUrl(String url) {
		String str = url;
		protocol = str.substring(0, str.indexOf("://"));
		str = str.substring(str.indexOf("://") + 3);

		// domain 초기화
		int idx = str.indexOf("/");
		if (idx < 0) {
			domain = str;
			return;
		}
		domain = str.substring(0, idx);
		str = str.substring(idx + 1);

		// filename 초기화
		idx = str.indexOf("?");
		if (idx < 0) {
			filename = str;
			return;
		}
		filename = str.substring(0, idx);
		str = str.substring(idx + 1);

		// queryString 초기화
		if (str.length() == 0) {
			return;
		}
		queryStrings = str.split("&");
	}

	@Override
	public String toString() {
		return "MyUrl [protocol=" + protocol + ", domain=" + domain + ", filename=" + filename + ", queryStrings="
				+ Arrays.toString(queryStrings) + "]";
	}

	public void print() {
		System.out.println("protocol = " + protocol + ", domain = " + domain + ", filename = " + filename);
		System.out.println(Arrays.toString(queryStrings));
		for (String qs : queryStrings) {
			String[] tmp = qs.split("=");
			System.out.println(tmp[0] + " ::: " + (tmp.length > 1 ? tmp[1] : ""));
		}

	}

}

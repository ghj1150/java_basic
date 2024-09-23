package lesson16_stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOrder {
	public static void main(String[] args) {
		// 스트림 생성

		// 연산
		// 1. 중간연산
		// 필터, 맵, 정렬 ,peek
		boolean result = 
		Stream
		.of("홍길동", "김유신", "이순신", "유관순")
		.sorted()
		.filter(s -> !s.startsWith("김"))
		.peek(System.out::println)
//		.allMatch(s->s.startsWith("홍"))
		.anyMatch(s->s.startsWith("홍"))
//		.count();
//		.forEach(System.out::println);
		;
		System.out.println(result);

		// 2. 최종연산
		// forEach , allMatch, antMatch, 집계
		String str = "가";
		Optional<String> optional = Optional.ofNullable(str);
		optional.ifPresent(System.out::println);
	}
}

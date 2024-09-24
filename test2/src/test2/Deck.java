package test2;

import java.util.Optional;

public class Deck {
	// 카드들
	
	// 섞기
	// peek
	
	public void test(String str) {
		Optional<String> o = Optional.ofNullable(str);
		System.out.println(o.orElse("다른값"));
	}
	public void test() {
		test("기본값");
	}
}

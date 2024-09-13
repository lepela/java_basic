package lesson12_api;

public class Exer {
	public static void main(String[] args) {
		// 달력 출력 (최소 이번달)
		// 이전달, 다음달, 이전해, 다음해, 특정 연월 입력시 해당 연월 달력 출력
		
		// URL분석(String class 사용)
		String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
		
		// 1. 프로토콜
		// 2. 도메인 search.naver.com
		// 3. 파일네임 search.naver
		// 4. 쿼리스트링 where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC
		// where :: nexearch
		// sm :: top_hty
		
		// 현재 위의 문자열은 5쌍의 key, value
	}
}

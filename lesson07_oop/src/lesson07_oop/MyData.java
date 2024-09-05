package lesson07_oop;

public class MyData {
	public static void main(String[] args) {
		Data[] datas = new Data[4];
		
		datas[0] = new Data();
		datas[0].no = 1;
		datas[0].name = "길동이";
		datas[0].addr = "서울";
		
		datas[1] = new Data();
		datas[1].no = 2;
		datas[1].name = "개똥이";
		datas[1].addr = "경기";
		
		datas[2] = new Data();
		datas[2].no = 3;
		datas[2].name = "새똥이";
		datas[2].addr = "부산";
		
		datas[3] = new Data();
		datas[3].no = 4;
		datas[3].name = "소똥이";
		datas[3].addr = "대전";
		
		System.out.printf("%5s %5s %5s\n", "순번", "이름", "주소");
		System.out.println("=====================================");
		for(Data d : datas) {
			System.out.printf("%5d %5s %5s\n", d.no, d.name, d.addr);
		}
	}
}
class Data {
	int no;
	String name;
	String addr;
}

package accessmodifier;

public class Main01 {

	public static void main(String[] args) {
		// Magician을 하나 생성해주세요.
		Magician m1 = new Magician("병법사");
		// getInfo()로 정보를 조회해주세요.
		m1.getInfo();
		// hunt()를 2번 호출해 사냥을 2번 해주세요.
		m1.hunt();
		m1.hunt();
		m1.fireball();
        // 사냥이 끝나고 다시 getIngfo()를 해주세요.
		m1.getInfo();
	}

}

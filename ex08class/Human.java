package ex08class;
/*
 *시나리오]
 *다음에 주어진 조건으로 '사람'을 추상화 하시오.
 *- 속성 : 이름, 나이, 에너지
 * - 행동 : 걷는다, 생각한다, 먹는다, 현재상태 
 *	4가지를	표현한다.
 *- 행동의조건
 *	먹으면 에너지가 2 증가한다.
 *	걸으면 에너지가 1 감소한다.
 *	생각하면 에너지가 2 감소한다.
 *	단, 에너지의 최소, 최대범위는 0~10이다.(사람은 무한히 
 *		먹을수 없으며 에너지가 마이너스가 되면 죽은것과 
 *		같다)
 *
 *
 */
public class Human {
	//멤버 변수 생성 이름 에너지 나이 
	String name;
	int age;
	int energy;
	//멤버 메소드 걷다, 생각하다, 먹다, 현재상테 표현 객체 행동 표현
	void walk() {
		/*
		 *에너지를 1 차감하되 만약 음수라면 0으로 고정
		 */
		energy--;
		if(energy<0) {
			energy = 0;
			System.out.println("[walk]에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			System.out.println("[walk]에너지가 1 감소하였습니다.");
		}
	}
	void thinking() {
		energy -= 2;
		if(energy<0) {
			energy = 0;
			System.out.println("[thinking]에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			System.out.println("[thinking]에너지가 2 감소하였습니다.");
		}
	}
	void eat() {
		/*
		 *2 증가하되 10초과하면 10으로 고정
		 */
		energy += 2;
		if(energy >10) {
			energy = 10;
			System.out.println("[eat]에너지는 10이 최대치입니다.");					
		}
		else {
			System.out.println("[eat]에너지가 2 증가하였습니다.");
		}
	}
	void showState() {
		/*
		 *멤버변수 출력
		 */
		System.out.println("===님의 현재 상태는===");
		System.out.println("이름: " + name);
		System.out.println("나이" + age);
		System.out.println("에너지" + energy);
		System.out.println("==================");
	}
	void riceCakeSoup() {
		age++;
		System.out.println("[riceCakeSoup]나이를 한 살 더드셨습니다.");
	}

}

package ex12inheritance;
class ID{
	 String nickname;
	 int level = 1;
	 int Hp = 100;
	public ID(String nickname) {
		this.nickname = nickname;
	}
	public void showStat() {
		System.out.println("Nick Name: " + nickname+ "\nLV:"+level);
	}
	public void jab(Monster monster) {
		monster.Hp-=3;
		this.Hp--;
		if(monster.Hp<=0) {
			System.out.printf("%d 몬스터 처치&n",monster.Hp);
			this.level+=monster.monsterLV;
		}
	}
	
}
class Monster{
	int Hp;
	int monsterLV;
	String name;
	public Monster(int Hp, int monsterLV, String name) {
		this.Hp = Hp;
		this.monsterLV = monsterLV;
		this.name = name;
	}
}

class Worrior extends ID{


	public Worrior(String nickname) {
		super(nickname);
		// TODO Auto-generated constructor stub
	}
	public void showStat() {
		super.showStat();
		System.out.println("Class: Worrior");
	}
	
	public void pike(Monster monster) {
		monster.Hp-=12;
		this.Hp--;
		if(monster.Hp<=0) {
			System.out.printf("LV.%d 몬스터 %s처치&n",monster.monsterLV, monster.name);
		}
	
	}
}

class Knight extends Worrior{
	public Knight(String nickname) {
		super(nickname);
		// TODO Auto-generated constructor stub
	}

	public void charging(Monster monster) {
		monster.Hp -= 20;
		this.Hp--;
		if(monster.Hp<=0) {
			System.out.printf("LV.%d 몬스터 %s처치&n",monster.monsterLV, monster.name);
		}
	}
}




public class RPGMain {
	public static Worrior transferIDTOWorrior(ID id) {
			Worrior worrior = new Worrior(id.nickname);
			worrior.level = id.level;
			worrior.Hp = 100;
			return worrior;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ID id1 = new ID("woosub");
		Monster rabbit = new Monster(20,2,"토끼");
		id1.jab(rabbit);
		Worrior worrior1 = transferIDTOWorrior(id1);
		
		id1.showStat();
		worrior1.showStat();
	}
}


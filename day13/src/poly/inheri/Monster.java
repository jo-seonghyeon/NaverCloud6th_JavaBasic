package poly.inheri;

public class Monster {
	
	// 모든 몬스터 클래스의 부모로 설계
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Monster(String name, int hp, int atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	// 몬스터 사망여부 판단
	public boolean isInactive() {
		if(this.hp <= 0) 
			System.out.println("이미 죽어서 사냥할 수 없습니다.");
		return this.hp > 0 ? false : true;
	}
	
	// 다음 공격에 몬스터가 죽는지 판단
	public boolean isInactiveAfterNextAttack(int userAtk) {
		return (this.hp - (userAtk - this.def)) <= 0 ? true : false;
	}
	
	// setter는 거의 대부분 void 리턴 자료형
	public void setAfterAttackedHp(int userAtk) {
		if(userAtk - this.def <= 0) {
			System.out.print("공격력이 " + getName() + "의 방어력보다 약합니다.");
			System.out.println("(" + getName() + " 체력 -1)");
			this.hp -= 1;
		} else {			
			this.hp = this.hp - (userAtk - this.def);
			System.out.println(getName() + "를 공격했습니다.");
			if(this.hp <= 0 ) {
				System.out.print(getName() + "가 죽었습니다.");
			}
		}
	}
	
}

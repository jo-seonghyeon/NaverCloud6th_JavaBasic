package poly.noinheri;

public class Ghost {
	// 필드: hp, atk, def
	private int hp;
	private int atk;
	private int def;
	
	// 생성자에서 각각 3, 0, 0 초기화
	public Ghost() {
		this.hp = 20;
		this.atk = 3;
		this.def = 0;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public int getDef() {
		return def;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	// 해당 몬스터 사망 여부를 boolean으로 체크해주는 getter
	public boolean isRatActive() {
		return hp > 0 ? true : false;
	}

	// 공격 받은 뒤에 살았는지 죽었는지 체크
	public boolean isAttackedRatActive(int userAtk) {
		return (hp - userAtk) > 0 ? true : false;
	}
	
	public void setDamagedHP(int userAtk) {
		this.hp = this.hp - (userAtk - this.def);
	}
	
	
	
	
	
	
}

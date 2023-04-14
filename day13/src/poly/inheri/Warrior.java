package poly.inheri;

public class Warrior {
	// 정보은닉 적용
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	// 캐릭터 상태 조회
	public void showStatus() {
		System.out.println("----------------------");
		System.out.println("아이디: " + this.id);
		System.out.println("체력: " + this.hp);
		System.out.println("공격력: " + this.atk);
		System.out.println("방어력: " + this.def);
		System.out.println("획득경험치: " + this.exp);
		System.out.println("----------------------");
	}
	
	public boolean isWarriorActive() {
		return this.hp <= 0 ? true : false;
	}
	
	// 파라미터로 모든 몬스터의 부모인 Monster를 선언하면 
	// 다형성 원리에 의해서 상속받은 모든 몬스터가 대입 가능합니다.
	public void hunt(Monster monster) {
		// 죽은 몬스터는 교전 불가 및 종료
		if(monster.isInactive()) {
			return;	// 이미 죽은 몬스터는 아래 로직을 실행할 필요 없음
		}
		
		// 몬스터가 다음 공격에 죽으면 플레이어에게 경험치 부여
		if(monster.isInactiveAfterNextAttack(this.atk)) {
			monster.setAfterAttackedHp(this.atk);
			gainMonsterExp(monster);
		} else {	// 몬스터가 다음 공격에 죽지 않으면 반격받아 플레이어 체력 차감
			monster.setAfterAttackedHp(this.atk);
			setHpAfterMonsterAttack(monster);
		}
		
	}
	
	public void gainMonsterExp(Monster monster) {
		this.exp += monster.getExp();
		System.out.println("(획득 경험치: " + monster.getExp() + ")");
	}
	
	// 상단 Warrior 체력을 차감하는 로직을 메서드로 재정의
	public void setHpAfterMonsterAttack(Monster monster) {
		if(monster.getAtk() - this.def <= 0) {
			System.out.println(monster.getName() + "의 공격력이 " + this.id + "의 방어력보다 약합니다.");
			this.hp -= 1;
		} else {			
			this.hp -= (monster.getAtk() - this.def);
		}
		if(monster.getAtk() - this.def > 0 && monster.getAtk() > this.def) {
			System.out.print(monster.getName() + "가 반격했습니다.");
			System.out.println("(체력 -" + (monster.getAtk() - this.def) + ")");
		}
	}
	
	
	
}

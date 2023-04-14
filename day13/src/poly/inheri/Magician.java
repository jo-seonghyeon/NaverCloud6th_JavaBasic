package poly.inheri;

public class Magician {
	// 정보은닉 적용
	private String id;
	private int hp;
	private int atk;
	private int castFireball;	
	private int def;
	private int exp;
	
	public Magician(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 2;
		this.castFireball = this.atk * 2;
		this.def = 0;
		this.exp = 0;
	}
	
	// 캐릭터 상태 조회
	public void showStatus() {
		System.out.println("----------------------");
		System.out.println("아이디: " + this.id);
		System.out.println("체력: " + this.hp);
		System.out.println("공격력: " + this.atk);
		System.out.println("Fireball 공격력: " + this.atk * 2);
		System.out.println("방어력: " + this.def);
		System.out.println("획득경험치: " + this.exp);
		System.out.println("----------------------");
	}
	
	public void gainMonsterExp(Monster monster) {
		this.exp += monster.getExp();
		System.out.println("(획득 경험치: " + monster.getExp() + ")");
	}
	
	// 상단 Warrior 체력을 차감하는 로직을 메서드로 재정의
	public void setHpAfterMonsterAttack(Monster monster) {
		if(monster.getAtk() - this.def <= 0) {
			System.out.print(monster.getName() + "의 공격력이 " + this.id + "의 방어력보다 약합니다.");
			System.out.println("(" + this.id + " 체력 -1)");
			this.hp -= 1;
		} else if(monster.getAtk() - this.def > 0 && monster.getAtk() > this.def){			
			System.out.print(monster.getName() + "가 반격했습니다.");
			System.out.println("(체력 -" + (monster.getAtk() - this.def) + ")");
			this.hp -= (monster.getAtk() - this.def);
		}
		if(this.hp <= 0) {
			System.out.println(this.id + "가 죽었습니다.");
		}
	}
	
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
	
	public void castFireball(Monster monster) {
		// 죽은 몬스터는 교전 불가 및 종료
		if(monster.isInactive()) {
			return;	// 이미 죽은 몬스터는 아래 로직을 실행할 필요 없음
		}
		
		// 몬스터가 다음 공격에 죽으면 플레이어에게 경험치 부여
		if(monster.isInactiveAfterNextAttack(this.castFireball)) {
			monster.setAfterAttackedHp(this.castFireball);
			gainMonsterExp(monster);
		} else {	// 몬스터가 다음 공격에 죽지 않으면 반격받아 플레이어 체력 차감
			monster.setAfterAttackedHp(this.castFireball);
			setHpAfterMonsterAttack(monster);
		}
			
	}

}

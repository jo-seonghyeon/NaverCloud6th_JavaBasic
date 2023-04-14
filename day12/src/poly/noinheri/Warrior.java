package poly.noinheri;

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
	
	// 단독적 사냥 하는 메서드
	public void huntRabbit(Rabbit rabbit) {
		if(rabbit.getHp() <= 0) {
			System.out.println("이미 죽어서 사냥할 수 없습니다.");
			return;	// 이미 죽은 토끼는 아래 로직을 실행할 필요 없음
		}
		rabbit.setHp(rabbit.getHp() - this.atk);
		
		if(rabbit.getHp() <= 0) {
			System.out.println("토끼를 사냥했습니다.");
			this.exp += 5;
		} else {
			System.out.println("토끼를 공격했습니다.");
		}
	}
	
	public void huntRat(Rat rat) {
//		if(rat.getHp() <= 0) {
		if(!rat.isRatActive()) {
			System.out.println("이미 죽어서 사냥할 수 없습니다.");
			return;	// 이미 죽은 쥐는 아래 로직을 실행할 필요 없음
		}
		
//		if(rat.getHp() - this.atk <= 0) {
		if(!rat.isAttackedRatActive(atk)) {
			rat.setDamagedHP(atk);
			System.out.println("쥐를 사냥했습니다.");
			this.exp += 80;
		} else {
			System.out.println("쥐를 공격했습니다.");
			System.out.println("쥐가 반격합니다.");
			rat.setDamagedHP(atk);
//			this.hp -= rat.getAtk();
		}
		
	}
	
	public void huntPig(Pig pig) {
//		if(pig.getHp() <= 0) {
		if(!pig.isRatActive()) {
			System.out.println("이미 죽어서 사냥할 수 없습니다.");
			return;	// 이미 죽은 쥐는 아래 로직을 실행할 필요 없음
		}
		
//		if(pig.getHp() - this.atk <= 0) {
		if(!pig.isAttackedRatActive(atk)) {
			pig.setDamagedHP(atk);
			System.out.println("돼지를 사냥했습니다.");
			this.exp += 100;
		} else {
			System.out.println("돼지를 공격했습니다.");
			System.out.println("돼지가 반격합니다.");
			pig.setDamagedHP(atk);
			if(isWarriorActive()) {
				System.out.println("★★★ " + this.id + "이 죽었습니다." + "★★★");
				System.out.println("★★★ " + this.id + "이 부활했습니다." + "★★★");
				this.hp = 20;
				showStatus();
			}
//			this.hp -= pig.getAtk();
		}
		
	}
	
	public void huntGhost(Ghost ghost) {
//		if(ghost.getHp() <= 0) {
		if(!ghost.isRatActive()) {
			System.out.println("이미 죽어서 사냥할 수 없습니다.");
			return;	// 이미 죽은 쥐는 아래 로직을 실행할 필요 없음
		}
		
//		if(ghost.getHp() - this.atk <= 0) {
		if(!ghost.isAttackedRatActive(atk)) {
			ghost.setDamagedHP(atk);
			System.out.println("귀신을 사냥했습니다.");
			this.exp += 150;
		} else {
			System.out.println("귀신을 공격했습니다.");
			System.out.println("귀신이 반격합니다.");
			ghost.setDamagedHP(atk);
			if(isWarriorActive()) {
				System.out.println("★★★ " + this.id + "이 죽었습니다." + "★★★");
				System.out.println("★★★ " + this.id + "이 부활했습니다." + "★★★");
				this.hp = 20;
				showStatus();
			}
//			this.hp -= ghost.getAtk();
		}
		
	}
	
}

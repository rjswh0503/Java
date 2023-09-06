package com.kh.gettersetter.goodEaxm;



public class GoodPlayer {
	private String name; // 캐릭터 이름
	private int health; //  캐릭터 체력
	private int attackPower; // 공격력
	
	public void setName(String name) { //이름이 변경되면 저장될 set
		this.name = name;    
	}
	                                  //setName   ValidName     getName
	//검증하는 valid
	public void ValidName() { //캐릭터이름에 공백이 없는지 검증
		if(this.name == "") {
			this.name = "No name";
			//System.out.println("이름을 넣지 않았습니다.");
		}
	}
	
	
											//원자성 atominc(아토믹) 원라력이라는 지극히 작은 객체 지향 언어 한번에 쓰는게 아니라 하나씩 분류
	
	
	public String getName() { // 캐릭터이름을 반환
		return name;
	}
	
	
	
	
	
	public void setHealth(int health) { //매가변수에 저장된 체력 
		this.health = health;
	}
	
	
	public void ValidHealth() {
		//만약에 체력이 0이라면 0으로 표기
		if(health <= 0) { // 체력이 0 이하일 경우
			this.health = 0;
			
		}
	}

	
	
	public int getHealth() {
		return health;
	}
	
	
	
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	
	public void ValidAttackPower() { //  검사
		//만약에 파워가 0보다 작을경우
		if(attackPower <= 0) {
			this.attackPower =0;
		}
			
	}
	
	
	
	
	public int getAttackPower() {
		return attackPower;
	} //return  전달받은 것을 최종적으로 전달 
	
	//void 와 return 은 상극 같이 있을 수 없다.
	
	public void display() { // 출력 메서드 작성
		//void는 출력만 하고 어떤 것을 전달하지 않을 때 
		
		
		System.out.println("캐릭터 정보	: " + this.name);
		System.out.println("체력 정보 	: " + this.health);
		System.out.println("공격력 	: " + this.attackPower);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	



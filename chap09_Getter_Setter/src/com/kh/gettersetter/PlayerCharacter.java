package com.kh.gettersetter;

public class PlayerCharacter {
	private String name; // ĳ���� �̸�
	private int health; //  ĳ���� ü��
	private int attackPower; // ���ݷ�
	
	/*
	  getter
	  		������ ���纻�� �����ֱ� ������ ���� ��ü�� �����ʹ� �ջ��Ű�� ����
	  		���������ʹ� ������
	  */
	
	public String getName() {
		return name;	
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getAttackPower() {
		return attackPower;
	}
	
	/*
	  setter
	 	�ܺο��� �޼ҵ带 ���� �����Ϳ� ������ �ϰ� �ȴٸ� �޼ҵ�� �Ű���(�Ű�����)�� �����ؼ� 
	 	������ ���� �����ͷ� ������ �� ����
	 
	  
	  
	 * */
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHealth(int health) {
		//���࿡ ü���� 0�̶�� ���̰� ü���� 1�̻��̸� �츮��
		if(health > 0) { // ü���� 0�̻��� ���
		this.health = health;	
		}else {
			System.out.println("ü���� �����ϴ�...");
			
		}
		
	}
	//0�̸��� ���� �־ 0������ ���� ��µ��� ����
	public void setAttackPower(int attackPower) {
		//���࿡ �Ŀ��� 0���� ���� Ŭ ��� 
		if(attackPower >= 1) {
			this.attackPower = attackPower;
			
			
		}else {
			this.attackPower = 0;
			System.out.println("���ݷ��� �����մϴ�.");
		}
		
	}
	
	
	
	
	
	
	
	//ĳ���� ���� ���
	public void displayInfo() {
		System.out.println("ĳ���� ����  : " + name);
		System.out.println("ü��  	 : " + health);
		System.out.println("���ݷ� 	 : " + attackPower);
	}
	
	
	//ĳ���� �����ϴ� ��� �޼��� 
	public void attack(PlayerCharacter target) {
		System.out.println("["+ name + "�� �������� ]" + target.getName()+"����  " + attackPower+" ��������");
		System.out.println("����ϴ�.");
	}
	
	//�ٸ� ĳ���ͷ� ���� ���� �޾��� �� �޼���

	public void takeDamage(int damage) {
		System.out.println("���� �޾� ���ϴ�.");
	}
}

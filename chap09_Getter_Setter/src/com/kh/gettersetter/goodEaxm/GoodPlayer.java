package com.kh.gettersetter.goodEaxm;



public class GoodPlayer {
	private String name; // ĳ���� �̸�
	private int health; //  ĳ���� ü��
	private int attackPower; // ���ݷ�
	
	public void setName(String name) { //�̸��� ����Ǹ� ����� set
		this.name = name;    
	}
	                                  //setName   ValidName     getName
	//�����ϴ� valid
	public void ValidName() { //ĳ�����̸��� ������ ������ ����
		if(this.name == "") {
			this.name = "No name";
			//System.out.println("�̸��� ���� �ʾҽ��ϴ�.");
		}
	}
	
	
											//���ڼ� atominc(�����) ������̶�� ������ ���� ��ü ���� ��� �ѹ��� ���°� �ƴ϶� �ϳ��� �з�
	
	
	public String getName() { // ĳ�����̸��� ��ȯ
		return name;
	}
	
	
	
	
	
	public void setHealth(int health) { //�Ű������� ����� ü�� 
		this.health = health;
	}
	
	
	public void ValidHealth() {
		//���࿡ ü���� 0�̶�� 0���� ǥ��
		if(health <= 0) { // ü���� 0 ������ ���
			this.health = 0;
			
		}
	}

	
	
	public int getHealth() {
		return health;
	}
	
	
	
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	
	public void ValidAttackPower() { //  �˻�
		//���࿡ �Ŀ��� 0���� �������
		if(attackPower <= 0) {
			this.attackPower =0;
		}
			
	}
	
	
	
	
	public int getAttackPower() {
		return attackPower;
	} //return  ���޹��� ���� ���������� ���� 
	
	//void �� return �� ��� ���� ���� �� ����.
	
	public void display() { // ��� �޼��� �ۼ�
		//void�� ��¸� �ϰ� � ���� �������� ���� �� 
		
		
		System.out.println("ĳ���� ����	: " + this.name);
		System.out.println("ü�� ���� 	: " + this.health);
		System.out.println("���ݷ� 	: " + this.attackPower);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	



package chap37_TodoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TodoList {
	//private ArrayList<String> tasks;
	private Map<Integer,String> tasks;
	private int nextId;
	
	public TodoList() {
		tasks = new HashMap<>();
		nextId= 1;
	}
	
	public void addTask(String task) {
		//tasks.add(task);
		tasks.put(nextId, task);
	}
	
	public void removetask(int Id) {
		if(index >= 0 && index <tasks.size()){
			tasks.remove(index);
		} else {
			System.out.println("�߸��� �ε����Դϴ�.");
		}
	}
	
	public void displayTasks() {
		System.out.println("my TodoList");
		for(int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + "." + tasks.get(i));
		}
	}
	
	public static void main(String[] args) {
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �߰�:add, ����:remove, "
					         + "���Ϻ���:list, ����:exit �Է��ϼ���.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���.");
				String task = sc.nextLine();
				todoList.addTask(task);
			} else if (choice.equalsIgnoreCase("remove")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removetask(index);
				}catch (Exception e) {
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			} else if (choice.equalsIgnoreCase("list")) {
				todoList.displayTasks();
			} else if (choice.equals("exit")) {
				break;
			} else {
				System.out.println("�߸��� ����Դϴ�.");
			}	
		}
		System.out.println("���ø����̼� ����");
		sc.close();
	}

}



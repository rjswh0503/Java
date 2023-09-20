package com.kh.IAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMin {
		public static void main(String[] args) {
			InetAddressMin inetMain = new InetAddressMin();
			// inetMain.InetExam2();
			inetMain.InetExam();

	}
	public void InetExam() {
		try {
			InetAddress address = InetAddress.getByName("www.google.com");
			
			//ip �ּ� ���
			
			System.out.println("Host Name : " + address.getHostName());
			System.out.println("IP Address : " + address.getHostAddress());
			
			
			System.out.println("============================================");
			System.out.println();
			//���� ȣ��Ʈ�� InetAddress ��ü ���
			
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : "  + localhost.getHostName());
			System.out.println("Local IP Address : " + localhost.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println();
		System.out.println("=========================================");
		
		try {
			InetAddress address1 = InetAddress.getByName("www.naver.com");
			
			System.out.println("Host Name : " + address1.getHostName());
			System.out.println("IP Address : " + address1.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			InetAddress address2 = InetAddress.getByName("www.youtube.com");
			
			
			System.out.println("Host Name : " + address2.getHostName());
			System.out.println("IP Address : " + address2.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void InetExam2() {
		//ȣ��Ʈ�̸��� �����ͼ� ��ü ����
		try {
			InetAddress address = InetAddress.getByName("www.google.com");
			
			//IP �ּҸ� byte �迭�� ���
			//InetAddress ��ü���� IP�ּҸ� byte �迭�� ����
			//IP �ּҸ� byte �迭�� ������ �� ����Ʈ�� ���� IP�ּҸ� �ٷ� �� ����
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address�� byte�� ����");
			for(byte ip: ipAddress) {
				System.out.print(ip+".");
			}
			
			System.out.println();
			
			//������ �� ������ ��� ȣ��Ʈ�� IP�ּҸ� �迭�� ���
			
			InetAddress[] alladdress = InetAddress.getAllByName("www.google.com");
			System.out.println("���ۿ� ������ ��� ȣ��Ʈ�� ������ �ּҸ� �迭�� ����");
			
			
				for(InetAddress addr : alladdress) {
					System.out.println(addr.getHostAddress());
				}
			
				//ȣ��Ʈ �̸� ��� 
				//ȣ��Ʈ �̸��� �̿��ؼ� InetAddress ��ü ����
				String hostName = address.getHostName();
				System.out.println("Host Name : " + hostName);
				
				//���� ȣ��Ʈ�� ip�ּ� ���
				
				InetAddress localHost = InetAddress.getLocalHost();
				System.out.println("Local Host address : " + localHost.getHostAddress());
				
				
				//��Ƽ �ɽ�Ʈ �ּ� ���� Ȯ��
				boolean isMultiCast  = address.isMulticastAddress();
				System.out.println("��Ƽ �ɽ�Ʈ �ּ� : " + isMultiCast);
				
				
				
				
				InetAddress name = InetAddress.getByName("www.daum.net");
				System.out.println("IP �ּ� �̸� : " + name.getHostAddress());
				
				
				//ȣ��Ʈ�� ������ �̸� ��������(��ü ������ �̸�)
				//ȣ��Ʈ�� ����ȭ�� FQDN �������� �̸��� ����
				//FQDN Full Quall
				String hostFullName = name.getCanonicalHostName();
				System.out.println("Ǯ���� : " + hostFullName);
				
				
				//LookPack �ּ� ���� Ȯ��
				
				boolean isLookPack = address.isLoopbackAddress();
				System.out.println("���� : " + isLookPack);
				 // ����
				
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

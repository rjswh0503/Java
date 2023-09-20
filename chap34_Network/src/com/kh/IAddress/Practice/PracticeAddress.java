package com.kh.IAddress.Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		PracticeAddress pta = new PracticeAddress();
		
		//pta.Address2();
		pta.Address3();
	}		
		
		public void Address2() {

			try {
				InetAddress address = InetAddress.getByName("www.youtube.com");
				
				
				//ip�ּҸ� byte �迭�� ���
				
				byte[] ipAddress = address.getAddress();
				System.out.println("IP Address�� byte�� ����");
				for(byte ip : ipAddress) {
					System.out.print(ip + ".");
				}
				
				System.out.println();
				
				
				//������ �� ������ ��� ȣ��Ʈ�� IP �ּҸ� �迭�� ���
				
				InetAddress[] alladdress = InetAddress.getAllByName("www.youtube.com");
				System.out.println("��Ʃ�꿡 ������ ��� ȣ��Ʈ�� ������ �ּҸ� �迭�� ����");
				
						for(InetAddress addr : alladdress) {
							System.out.println(addr.getHostAddress());
						}
						
						//ȣ��Ʈ �̸� ���
						String hostName = address.getHostName();
						System.out.println("Host Name : " + hostName);
						
						//���� ȣ��Ʈ�� ip�ּ� ���
						
						InetAddress localHost = InetAddress.getLocalHost();
						System.out.println("Local Host address : " + localHost);
						
						//��Ƽ �ɽ�Ʈ �ּ� ���� Ȯ��
						
						boolean isMultiCast = address.isMulticastAddress();
						System.out.println("��Ƽ �ɽ�Ʈ �ּ� : " + isMultiCast);
				
						
						InetAddress name = InetAddress.getByName("www.youtube.com");
						System.out.println("IP �ּ� �̸� : " + name.getHostAddress());
						
						
						//ȣ��Ʈ�� ������ �̸� ��������
						
						String hostFullName = name.getCanonicalHostName();
						System.out.println("Ǯ ���� : " + hostFullName);
						
						
						boolean isLookPack = address.isLoopbackAddress();
						System.out.println("���� : " + isLookPack);
						
						
						
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void Address3() {
			
			try {
				InetAddress address = InetAddress.getByName("www.youtube.com");
				
				//ip �ּ� ���
				System.out.println("Host Name : " + address.getHostName());
				System.out.println("IP Address : " + address.getHostAddress());
				
				InetAddress localhost = InetAddress.getLocalHost();
				System.out.println("Local Host Name : " + localhost.getHostName());
				System.out.println("Local IP Address : " + localhost.getHostAddress());
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}
}

	



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
				
				
				//ip주소를 byte 배열로 얻기
				
				byte[] ipAddress = address.getAddress();
				System.out.println("IP Address를 byte로 얻음");
				for(byte ip : ipAddress) {
					System.out.print(ip + ".");
				}
				
				System.out.println();
				
				
				//도메인 명에 지정된 모든 호스트이 IP 주소를 배열로 얻기
				
				InetAddress[] alladdress = InetAddress.getAllByName("www.youtube.com");
				System.out.println("유튜브에 지정된 모든 호스트의 아이피 주소를 배열로 얻음");
				
						for(InetAddress addr : alladdress) {
							System.out.println(addr.getHostAddress());
						}
						
						//호스트 이름 얻기
						String hostName = address.getHostName();
						System.out.println("Host Name : " + hostName);
						
						//지역 호스트의 ip주소 얻기
						
						InetAddress localHost = InetAddress.getLocalHost();
						System.out.println("Local Host address : " + localHost);
						
						//멀티 케스트 주소 여부 확인
						
						boolean isMultiCast = address.isMulticastAddress();
						System.out.println("멀티 케스트 주소 : " + isMultiCast);
				
						
						InetAddress name = InetAddress.getByName("www.youtube.com");
						System.out.println("IP 주소 이름 : " + name.getHostAddress());
						
						
						//호스트이 완전한 이름 가져오기
						
						String hostFullName = name.getCanonicalHostName();
						System.out.println("풀 네임 : " + hostFullName);
						
						
						boolean isLookPack = address.isLoopbackAddress();
						System.out.println("룩팩 : " + isLookPack);
						
						
						
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void Address3() {
			
			try {
				InetAddress address = InetAddress.getByName("www.youtube.com");
				
				//ip 주소 출력
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

	



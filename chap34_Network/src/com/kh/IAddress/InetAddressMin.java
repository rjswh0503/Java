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
			
			//ip 주소 출력
			
			System.out.println("Host Name : " + address.getHostName());
			System.out.println("IP Address : " + address.getHostAddress());
			
			
			System.out.println("============================================");
			System.out.println();
			//현재 호스트의 InetAddress 객체 얻기
			
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
		//호스트이름을 가져와서 객체 생성
		try {
			InetAddress address = InetAddress.getByName("www.google.com");
			
			//IP 주소를 byte 배열로 얻기
			//InetAddress 객체에서 IP주소를 byte 배열로 얻음
			//IP 주소를 byte 배열로 얻으면 각 바이트를 통해 IP주소를 다룰 수 있음
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address를 byte로 얻음");
			for(byte ip: ipAddress) {
				System.out.print(ip+".");
			}
			
			System.out.println();
			
			//도메인 명에 지정된 모든 호스트의 IP주소를 배열로 얻기
			
			InetAddress[] alladdress = InetAddress.getAllByName("www.google.com");
			System.out.println("구글에 지정된 모든 호스트이 아이피 주소를 배열로 얻음");
			
			
				for(InetAddress addr : alladdress) {
					System.out.println(addr.getHostAddress());
				}
			
				//호스트 이름 얻기 
				//호스트 이름을 이용해서 InetAddress 객체 생성
				String hostName = address.getHostName();
				System.out.println("Host Name : " + hostName);
				
				//지역 호스트의 ip주소 얻기
				
				InetAddress localHost = InetAddress.getLocalHost();
				System.out.println("Local Host address : " + localHost.getHostAddress());
				
				
				//멀티 케스트 주소 여부 확인
				boolean isMultiCast  = address.isMulticastAddress();
				System.out.println("멀티 케스트 주소 : " + isMultiCast);
				
				
				
				
				InetAddress name = InetAddress.getByName("www.daum.net");
				System.out.println("IP 주소 이름 : " + name.getHostAddress());
				
				
				//호스트의 완전한 이름 가져오기(전체 도메인 이름)
				//호스트이 정규화된 FQDN 도메인의 이름을 얻음
				//FQDN Full Quall
				String hostFullName = name.getCanonicalHostName();
				System.out.println("풀네임 : " + hostFullName);
				
				
				//LookPack 주소 여부 확인
				
				boolean isLookPack = address.isLoopbackAddress();
				System.out.println("룩팩 : " + isLookPack);
				 // 가상
				
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

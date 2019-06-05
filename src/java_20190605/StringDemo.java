package java_20190605;

public class StringDemo {
	public static void main(String[] args) {
		
		String sql = "select emp, no, isdngisadnisadnbisbni";
		sql+= "from empasdmm cx m";
		sql+= "dfhdfhdfdfsadfsadf";
		sql+= "bvffffffasdmasdfm";
		sql+= "dfshfdhfhfm";
		sql+= "frsadfsdfm";
		sql+= "ggghhdfm";
		sql+= "yyyyrsdf cx m";
		sql+= "wwweweom empasdmm cx m";
		sql+= "weewewwem cx m";
		sql+= "f3f3fmpasdmm cx m";
		sql+= "jmtmmpasdmm cx m";
		sql+= "6463dmm cx m";
		sql+= "ertewrtdmm cx m";
		sql+= "werbsdfbdfbdsfm";
		sql+= "sdfgdfgsdfgdsfmm cx m";
		sql+= "hhfffhfrgbfdasdmm cx m";
		
		//ㄴ(String은 불변개체)이렇게 스트링을 만들면 모든 문자열을 저장하기 때문에 안된다-(저장해서 다시 써야될경우에만)
		//용량을 잡아먹는 양이 많지는 않다
		
		
		
		String str1 = new String ("test");
		String str2 = new String ("test");
		
		String str3 = "java";
		String str4 = "java";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		//charAt
		String ssn = "234567-8923456";
		char c = ssn.charAt(6);
		System.out.println(c);
		
		//concat
		String temp = ssn.concat("안녕");
		System.out.println(temp);
		
		//endsWith (startsWith도 있다)
		String fileName = "test.s";
		if (fileName.endsWith("zip")){
			System.out.println("압축파일 입니다.");
		}else if (fileName.endsWith("doc")){
			System.out.println("Office문서 입니다");
		}else {
			System.out.println("파일입니다");
		}
		
		//equalsIgnoreCase
		
		String s1 ="java";
		String s2 = "Java";
		System.out.println(s1.equalsIgnoreCase(s2));
		
		// lower case & upper case
		
		s1 = s1.toLowerCase();
		System.out.println(s1);
		
		s2 = s2.toUpperCase();
		System.out.println(s2);
		
		//indexOf 처음
		System.out.println(ssn.indexOf("-"));
		//lastIndexOf 마지막
		System.out.println(ssn.lastIndexOf("-"));
		
		ssn = ssn.replace("-", "*");
		System.out.println(ssn);
		
		String html = "안녕하세요\t반갑습니다";
		System.out.println(html);
		
		String ssn1 = ssn.substring(0,  6);
		String ssn2 = ssn.substring(7);
		System.out.println(ssn1);
		System.out.println(ssn2);
		
		String ssn3 = ssn.substring(0, ssn.indexOf("*"));
		String ssn4 = ssn.substring(ssn.indexOf("*")+1);
		System.out.println(ssn3);
		System.out.println(ssn4);
		
		String fileName1 = fileName.substring(0, fileName.lastIndexOf(ssn.indexOf(".")));
		String fileName2 = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(fileName1);
		System.out.println(fileName2);
				
		fileName1 = "hello";
		fileName2 = "hello ";
		System.out.println(fileName1.length());
		System.out.println(fileName2.length());
		
		if(fileName1.equalsIgnoreCase(fileName2)){
			System.out.println("성공");
		}else{
			System.out.println("실패");
		}
		
		int a = 10;
		String t1 = String.valueOf(a);
		String t2 = a + "";
		System.out.println(t1);
		System.out.println(t2);
		
		
		ssn = "234567-8923456";	
		String [] t3 = ssn.split("-");
		System.out.println(t3[0]);
		System.out.println(t3[1]);
		
		
		
		
		
				
		
		
	}
}


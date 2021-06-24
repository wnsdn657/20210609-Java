import java.util.Scanner;
/*
 *  자바에서 데이터를 저장하는 방법
 *  	= 변수 (한개만 저장하는 공간)
 *  	= 배열 (같은 데이터형 여러개 모아서 한번에 저장하는 방법)
 *  	= 클래스 (다른 데이터형 여러개 모아서 한번에 저장하는 방법)
 *  
 */
// 한명의 학생 정보를 저장 => 필요한만큼 메모리 생성
/*
 * 	클래스	
 * 		데이터형(사용자 정의 데이터형) => 변수  ======> ~DTO(Data Transfer Object) , ~VO(Value Object)
 * 		액션형 클래스(기능(메소드)만 모아서 처리) =====> ~DAO(데이터베이스 연결), ~Service, ~Manager
 * 		혼합형 (데이터+메소드)	====> 많이 사용하지 않는다.
 * 
 * 	구성요소
 * 		변수 (멤버변수)
 * 		  = 인스턴스 변수 => 저장공간 따로 생성 new (저장공간 별도 생성) : String(70%), 
 * 		   A a=new A() => 저장공간 따로 생성
 * 		   A b=new B() => 저장공간 따로 생성
 * 		  = 지역변수 : 메소드영역 안에서만 사용 => 메소드가 종료되면 자동으로 메모리가 삭제
 * 				  => 매개변수 포함
 * 		  = 공유변수(정적변수) : 한개의 메모리 공간만 생성 => 컴파일러에 의해 자동 생성
 * 		  	static int a;
 * 		메소드 
 * 		  = 인스턴스 메소드
 * 		  = 공유 메소드 static
 * 		  = 추상 메소드
 * 		  = 종단 메소드 : String, Math... (수정불가)
 * 		생성자
 * 		  = 초기화 : 시작하자마자 => 로그인 , ID 자동저장, 네트워크 ,데이터베이스
 * 			
 */
class Student{
	String name;
	int kor,eng,math; //인스턴스 변수 => new라는 연산자를 이용해서 저장공간 만든 다음에 저장
	// 자동 저장, 공유 => 클래스 변수 (static)
	static String school;
}
public class MainClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// 이름 저장 2개
		String name1,name2,name3;
		int kor1,kor2,kor3;
		int eng1,eng2,eng3;
		int math1,math2,math3;
		
		name1="홍길동";
		kor1=80;
		eng1=90;
		math1=85;
		
		name2="심청이";
		kor2=79;
		eng2=90;
		math2=80;
		
		name3="박문수";
		kor3=80;
		eng3=90;
		math3=85;
		
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",name1,kor1,eng1,math1,kor1+eng1+math1,(kor1+eng1+math1)/3.0);
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",name2,kor2,eng2,math2,kor2+eng2+math2,(kor2+eng2+math2)/3.0);
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",name3,kor3,eng3,math3,kor3+eng3+math3,(kor3+eng3+math3)/3.0);
		
	
		// 배열
		String[] name= {"홍길동","심청이","박문수"};
		int[] kor= {90,80,85};
		int[] eng= {80,79,89};
		int[] math= {90,80,70};
		for(int i=0;i<name.length;i++) {
			System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",name[i],kor[i],eng[i],math[i],kor[i]+eng[i]+math[i],(kor[i]+eng[i]+math[i])/3.0);
		};
		/*
}
		 *  String[] names;
		 *  int[] kor;
		 *  int[] eng;
		 *  int[] math;
		 *  =================> 인덱스가 같은 것이 학생 한명에 대한 정보
		 */
		
		// 클래스
		/*
		 * class Student{
		 * 		String name;
		 * 		int kor,eng,math
		 * }
		 * 
		 *  new=>3명을 저장
		 *  Student hong;  =>hong.name => 해당 메모리 접근연산자
		 *  Student shim;
		 *  Student park;
		 */
		Student hong=new Student(); // hong=>name,kor,eng,math
		System.out.println(hong);
		hong.name="홍길동";
		hong.kor=90;
		hong.eng=89;
		hong.math=70;
		hong.school="SIST1"; // 클래스명.변수명
		Student shim=new Student(); // shim=>name,kor,eng,math
		System.out.println(shim);
		shim.name="심청이";
		shim.kor=85;
		shim.eng=99;
		shim.math=100;
		shim.school="SIST2";
		
		Student park=new Student(); // park=>name,kor,eng,math
		System.out.println(park);
		park.name="박문수";
		park.kor=80;
		park.eng=85;
		park.math=75;
		park.school="SIST3";
		// hong.school => SIST3
		System.out.println("hong.school?"+hong.school);
		
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",hong.name,hong.kor,hong.eng,hong.math,hong.kor+hong.eng+hong.math,(hong.kor+hong.eng+hong.math)/3.0);
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",shim.name,shim.kor,shim.eng,shim.math,shim.kor+shim.eng+shim.math,(shim.kor+shim.eng+shim.math)/3.0);
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",park.name,park.kor,park.eng,park.math,park.kor+park.eng+park.math,(park.kor+park.eng+park.math)/3.0);
		
		Student[] s= {hong,shim,park};
		for(int i=0;i<s.length;i++) {
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].kor+s[i].eng+s[i].math,(s[i].kor+s[i].eng+s[i].math)/3.0);
		}
	}
	//클래스 => 사용자 정의 => 일반 변수와 동일하게 사용 (배열,클래스...)

}

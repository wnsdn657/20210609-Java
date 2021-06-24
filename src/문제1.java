//웹(java)/앱(kotlin) 웹(자바:오라클 연결 =>브라우저로 전송, HTML:출력, 디자인:CSS, 오라클: 데이터 저장장소)
//					자바/오라클 => 브라우저에서 버튼, 메뉴 => 자바스크립트 (라이브러리 :JQuery,Ajax) => React,Vue
// Spring(서버), NodeJS
class Member{
	String memberSignUp;
	String id;
	String idCheck;
	String name;
	String pwd;
	String pwdCheck; // 비밀번호 확인은 자바에서 하는 게 아님 (빼도 댐)
	int hint;
	String pwdAnswer;
	boolean sex;
	int phone;
	int pax;
	String hphone;
	String email;
	int post;
	String address;
	String addressData;
	String signUp;
	String esc;
}

class Sawon{
	int eMPNO;
	String ename;
	String job; //직위
	int mgr; //사수번호
	String hiredate; // 입사일
	int sal; //급여
	int comm; //성과급
	int deptno; //부서번호
}

class Board{
	int num;
	String writer;
	String title;
	String date;
	String page;
	String write;
	
	String content;  // 내용           --눈에는 안보이지만 
	String password; // 삭제,수정용 비번  -- 게시판에 있는 기능들이다.
}

class Category{
	String title;
	String content;
	String poster;
}

class FoodHouse{
	String title;
	double score;
	String address;
	String tel;
	String food;
	String price;
	String parking;
	String workTime;
	String breakTime;
	String holiday;
	String[] menu; // 음식이름 , 가격 등 많은 값이 저장되었으니까 배열로 설정
	int goodInt;
	int sosoInt;
	int badInt;
}
class Movie1{
	String poster;
	String title;
	boolean isShow;
	String regDate;
	String genre;
	String country;
	String grade;
	int runningTime;
	double score;
	String watched;
	int boxOffice;
	int cookie;
	String content;
}
class Recipe{
	String poster;
	String title;
	String writer;
	String star;
	int starInt;
	int watched;
}
class Chef{
	int rank;
	String profile;
	String id;
	int mc1;
	int mc3;
	int mc7;
	int mc2;
	static String sosikbadgi;
}
/*
 *  1. 변수
 *  =======
 *  2. 연산자
 *  3. 제어문
 *  ======= 기본코딩 
 *  4. 묶어서 사용
 *  	=데이터 묶는 방법
 *  		=같은 것끼리 묶어서 사용 (크기가 동일:배열)
 *  		=다른 것끼리 묶어서 사용 (클래스)
 *  		 ==>클래스안에 설정할 수 있는 데이터형 
 *  			기본형 (int,byte,short,char,long,boolean,float)
 *  			클래스 (클래스, 배열)
 *  	=명령문을 묶는 방법
 *  	 = 메소드 (연산자,제어문,지역변수)
 *  ============================================================== 클래스 + 메소드 (242page)
 *  5.클래스 영역
 *  	클래스(구성요소)
 *    ==================
 *  	변수
 *  		=인스턴스 => new를 사용해서 메모리 생성 => 따로 메모리가 생성
 *  		=정적변수(클래스변수) => static => 메모리 공간을 한개만 생성 => 공유 데이터
 *  
 *  		==>생성 방법
 *  			class A
 *  			{
 *  				int aa;
 *  				static int bb;
 * 				}
 * 				A a=new A(); => a(aa) ==> a가 aa에 접근 시에는 a.aa
 * 				A b=new A(); => b(aa) ==> b가 aa에 접근 시에는 b.aa
 * 					=> 별도로 bb가 생성 => a,b공통으로 사용이 가능
 * 						a.bb (객체명으로 접근이 가능) , A.bb (클래스명.변수)
 *    ==================
 *      메소드
 *    ==================
 *      생성자
 *    ==================    
 */
class A{
	String name;
	int aa; // =0 (자동초기화)
	static int bb; //=0(자동초기화)
	// 변수 => 초기화(지역변수) , 멤버변수(인스턴스,static)=> 자동초기화
	/*
	 *  String => null
	 *  char   => ' '
	 *  double => 0.0
	 *  float  => 0.0f
	 *  int    => 0
	 *  long   => 0L
	 *  클래스   => null
	 */
}
public class 문제1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(); 
		System.out.println(A.bb);
		System.out.println(a.aa);
		a.bb=100;
		System.out.println(a.name);
	}

}

//��(java)/��(kotlin) ��(�ڹ�:����Ŭ ���� =>�������� ����, HTML:���, ������:CSS, ����Ŭ: ������ �������)
//					�ڹ�/����Ŭ => ���������� ��ư, �޴� => �ڹٽ�ũ��Ʈ (���̺귯�� :JQuery,Ajax) => React,Vue
// Spring(����), NodeJS
class Member{
	String memberSignUp;
	String id;
	String idCheck;
	String name;
	String pwd;
	String pwdCheck; // ��й�ȣ Ȯ���� �ڹٿ��� �ϴ� �� �ƴ� (���� ��)
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
	String job; //����
	int mgr; //�����ȣ
	String hiredate; // �Ի���
	int sal; //�޿�
	int comm; //������
	int deptno; //�μ���ȣ
}

class Board{
	int num;
	String writer;
	String title;
	String date;
	String page;
	String write;
	
	String content;  // ����           --������ �Ⱥ������� 
	String password; // ����,������ ���  -- �Խ��ǿ� �ִ� ��ɵ��̴�.
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
	String[] menu; // �����̸� , ���� �� ���� ���� ����Ǿ����ϱ� �迭�� ����
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
 *  1. ����
 *  =======
 *  2. ������
 *  3. ���
 *  ======= �⺻�ڵ� 
 *  4. ��� ���
 *  	=������ ���� ���
 *  		=���� �ͳ��� ��� ��� (ũ�Ⱑ ����:�迭)
 *  		=�ٸ� �ͳ��� ��� ��� (Ŭ����)
 *  		 ==>Ŭ�����ȿ� ������ �� �ִ� �������� 
 *  			�⺻�� (int,byte,short,char,long,boolean,float)
 *  			Ŭ���� (Ŭ����, �迭)
 *  	=��ɹ��� ���� ���
 *  	 = �޼ҵ� (������,���,��������)
 *  ============================================================== Ŭ���� + �޼ҵ� (242page)
 *  5.Ŭ���� ����
 *  	Ŭ����(�������)
 *    ==================
 *  	����
 *  		=�ν��Ͻ� => new�� ����ؼ� �޸� ���� => ���� �޸𸮰� ����
 *  		=��������(Ŭ��������) => static => �޸� ������ �Ѱ��� ���� => ���� ������
 *  
 *  		==>���� ���
 *  			class A
 *  			{
 *  				int aa;
 *  				static int bb;
 * 				}
 * 				A a=new A(); => a(aa) ==> a�� aa�� ���� �ÿ��� a.aa
 * 				A b=new A(); => b(aa) ==> b�� aa�� ���� �ÿ��� b.aa
 * 					=> ������ bb�� ���� => a,b�������� ����� ����
 * 						a.bb (��ü������ ������ ����) , A.bb (Ŭ������.����)
 *    ==================
 *      �޼ҵ�
 *    ==================
 *      ������
 *    ==================    
 */
class A{
	String name;
	int aa; // =0 (�ڵ��ʱ�ȭ)
	static int bb; //=0(�ڵ��ʱ�ȭ)
	// ���� => �ʱ�ȭ(��������) , �������(�ν��Ͻ�,static)=> �ڵ��ʱ�ȭ
	/*
	 *  String => null
	 *  char   => ' '
	 *  double => 0.0
	 *  float  => 0.0f
	 *  int    => 0
	 *  long   => 0L
	 *  Ŭ����   => null
	 */
}
public class ����1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(); 
		System.out.println(A.bb);
		System.out.println(a.aa);
		a.bb=100;
		System.out.println(a.name);
	}

}

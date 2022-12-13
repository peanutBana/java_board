package application;

import java.util.Scanner;

/*
 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
 * 목록출력, 게시글 내용 볼 수 있음
 * 게시물의 데이터를 저장 
 * 번호, 제목, 내용, 작성자, 작성일자 - key로 사용
 * 목록에서는 조회, 등록, 종료
 * 상세화면에서는 수정, 삭제, 목록
*/

public class BoardApplication {
	
	static boolean status = true;
	static Scanner sc = new Scanner(System.in);
	
	public static void login() {
		System.out.println("=============[자유 게시판]=============");
		System.out.println("==========로그인==========");
		System.out.println("=    Id: ");
		int id = sc.nextInt();
		System.out.print("=    Pw: ");
		int pw = sc.nextInt();
		System.out.println("========================");
	}
	
		
	public static void main(String[] args) {
		login();
		int choice;
		 while(status) {
			 System.out.println("1.게시글 목록 | 2.게시글 작성 | 3.게시글 수정 | 4.게시글 삭제 | 5.로그아웃 | 6.종료");
			 System.out.print("메뉴 선택==> ");choice = sc.nextInt();
			 switch(choice) {
			 case 1:
				 //showAllPost();
				 break;
			 case 2:
				 //cratePost();
				 break;
			 case 3:
				 //modifyPost();
				 break;
			 case 4:
				 //deletePost();
				 break;
			 case 5:
				 //logout();
				 break;
			 case 6:
				 System.out.println("게시판을 나갑니다.");
				 status = false;
			 default:
				 System.out.println("다시 입력해주세요.");
			 }
		 }
	}
	
}

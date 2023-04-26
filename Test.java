package JAVA_Register;

import java.util.Scanner;

public class Test {
    // 단위 테스트
    public static void main(String[] args) {
        UserField uf = new UserField();
        User user = new User();
        Scanner sc = new Scanner(System.in);
        String name = null, id = null, pw = null, phoneNum = null;

        System.out.println("이름 : ");
        name = sc.next();
        System.out.println("아이디 : ");
        id = sc.next();
        if(uf.checkId(id) != null) {
            System.out.println("중복된 아이디 입니다.");
            return;
        }

        System.out.println("비밀번호 : ");
        pw = sc.next();
        System.out.println("전화번호 : ");
        phoneNum = sc.next();

        // 위에서 입력한 정보 담아주기
        user.setName(name);
        user.setId(id);
        user.setPw(pw);
        user.setPhoneNum(phoneNum);

        if(uf.checkId(id) != null){ // null 이여야 DB에 없는 아이디
            System.out.println("중복된 아이디 입니다.");
        }else{
            uf.join(user); // 위에서 입력한 pw를 암호화해서 저장 (join 메소드 기능)
            System.out.println("회원가입 성공");
        }

        System.out.println("아이디 : ");
        id = sc.next();
        System.out.println("비밀번호 : ");
        pw = sc.next();

        if(uf.login(id, pw)){
            System.out.println("로그인 성공");
        }else System.out.println("로그인 실패");
    }
}

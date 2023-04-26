package JAVA_Register;

import java.util.ArrayList;

public class UserField {
    // 회원을 저장할 자료구조 선언
    ArrayList<User> users = new ArrayList<>();

    private static final int KEY = 3;

    public UserField(){  // 중복검사를 이한 더미 데이터
        User user = new User();
        user.setId("fhfkfk789");
        user.setPw("1234");
        users.add(user);
    }


    // 아이디 중복검사
    public User checkId(String id){
        User user = null;
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getId().equals(id)){
                user = users.get(i);
                break;
            }
        }
        return user;
    }


    // 회원가입
    public void join(User user){
        user.setPw(encrypt(user.getPw()));
        users.add(user);
    }
    // 로그인
    public boolean login(String id, String pw){
        User user = checkId(id);

        if(user != null){
//            if(decrypt(user.getPw()).equals(pw)){ // 양 방향
            if(user.getPw().equals(encrypt(pw))){   // 단 방향 (보안이 더 좋다)
                return true;
            }
        }
        return false;
    }

    // 암호화
    public String encrypt(String pw){
        String enPw = "";
        for (int i = 0; i < pw.length(); i++) {
            enPw += (char)(pw.charAt(i) * KEY);
        }
        return enPw;
    }

    // 복호화
    public String decrypt(String enPw){
        String dePw = "";
        for (int i = 0; i < enPw.length(); i++) {
            dePw += (char)(enPw.charAt(i) / KEY);
        }
        return dePw;
    }
}

package etc.exception.custom;

public class UserLogin {

    String userAccount; //계정명
    String userPassword; // 가입 시 설정한 패스워드

    // 객체 생성 시 id, pw 한번에 세팅
    public UserLogin(String userAccount, String userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }

    // 로그인 검증
    public String loginValidate(String inputAccount, String inputPassword) throws LoginValidateException {
        // 계정이 일치하는가?
        if(userAccount.equals(inputAccount)) {
            // 패스워드가 일치하는가?
            if(userPassword.equals(inputPassword)) {
                // 로그인 성공
                return "success";
            } else {
                // 패스워드가 틀림
                throw new LoginValidateException("패스워드 틀림");
            }
        } else {
            // 계정 정보가 틀림!
            throw new LoginValidateException("계정정보 틀림");
        }
    }
}

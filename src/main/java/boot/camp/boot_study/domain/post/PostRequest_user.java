package boot.camp.boot_study.domain.post;

import lombok.Getter;
import lombok.Setter;

//Request(유저 정보 요청이므로 getter setter 모두 사용
@Getter
@Setter
public class PostRequest_user {


        private Long sid;             // PK
        private String user_email;    // 사용자 이메일 (ID개념)
        private String user_name;     // 사용자 이름
        private String user_pw;       // 사용자 pw


}

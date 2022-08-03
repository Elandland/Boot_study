package boot.camp.boot_study.domain.post;

import lombok.Getter;

//Response(응답)이므로 getter만 사용하여 정보만 가져와도 됨
@Getter

public class PostResponse_user {


    private Long sid;             // PK
    private String user_email;    // 사용자 이메일 (ID개념)
    private String user_name;     // 사용자 이름
    private String user_pw;       // 사용자 pw


}

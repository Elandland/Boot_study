package boot.camp.boot_study.domain.post;

import lombok.Getter;
import lombok.Setter;

//Request(유저 정보 요청이므로 getter setter 모두 사용
@Getter
@Setter
public class PostRequest {


        private Long id;             // PK
        private String title;        // 제목
        private String content;      // 내용
        private String writer;       // 작성자
        private Boolean noticeYn;    // 공지글 여부


}

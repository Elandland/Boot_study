package boot.camp.boot_study.domain.post;

import lombok.Getter;

import java.time.LocalDateTime;

//Response(응답)이므로 getter만 사용하여 정보만 가져와도 됨 ( 사용자에게 보여줄 정보 )
@Getter

public class PostResponse{


    private Long id;                       // PK
    private String title;                  // 제목
    private String content;                // 내용
    private String writer;                 // 작성자
    private int viewCnt;                   // 조회 수
    private Boolean noticeYn;              // 공지글 여부
    private Boolean deleteYn;              // 삭제 여부
    private LocalDateTime createdDate;     // 생성일시
    private LocalDateTime modifiedDate;    // 최종 수정일시


}

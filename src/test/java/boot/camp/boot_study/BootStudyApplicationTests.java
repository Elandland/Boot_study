package boot.camp.boot_study;

import boot.camp.boot_study.domain.post.PostRequest;
import boot.camp.boot_study.domain.post.PostResponse;
import boot.camp.boot_study.mapper.PostMapper;
import boot.camp.boot_study.service.PostService;
import boot.camp.boot_study.domain.post.PostRequest;
import boot.camp.boot_study.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
class BootStudyApplicationTests {
	@Autowired
	PostMapper postMapper;

	@Test
	void save() {
		PostRequest params = new PostRequest();
		params.setTitle("1번 게시글 제목");
		params.setContent("1번 게시글 내용");
		params.setWriter("테스터");
		params.setNoticeYn(false);
		postMapper.save(params);

		List<PostResponse> posts = postMapper.findAll();
		System.out.println("전체 게시글 개수는 : " + posts.size() + "개입니다.");
	}


}

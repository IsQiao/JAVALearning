package im.qxw.stringbootbybatis;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = StringBootBybatisApplication.class)
@RunWith(SpringRunner.class)
@Transactional
@Rollback
class StringBootBybatisApplicationTests {

    //@Autowired
    //private TbUserMapper tbUserMapper;

    @Test
    public void testSelect() {

    }

}

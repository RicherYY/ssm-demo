package UserDaoTest;

import com.mbkj.entity.User;
import com.mbkj.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
@WebAppConfiguration
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void testCRUD(){
        List<User> users = userService.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}

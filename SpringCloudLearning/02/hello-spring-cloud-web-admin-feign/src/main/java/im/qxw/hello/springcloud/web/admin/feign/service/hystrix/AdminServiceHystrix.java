package im.qxw.hello.springcloud.web.admin.feign.service.hystrix;

import im.qxw.hello.springcloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("your message is %s but request is bad", message);
    }
}

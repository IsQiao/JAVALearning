package hello;

import org.springframework.stereotype.Component;

/**
 * 消息服务
 */
@Component
public class MessageService {
    public MessageService() {
        super();
        System.out.println("MessageService....");
    }

    /**
     * 执行打印结果
     *
     * @return
     */
    public String getMessage() {
        return "Hello World!";
    }
}

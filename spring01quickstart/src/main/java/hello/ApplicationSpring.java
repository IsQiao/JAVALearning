package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ApplicationSpring {
    public static void main(String[] args) {
        System.out.println("applicationString");
//        MessagePrinter printer = new MessagePrinter();
//        MessageService service = new MessageService();
//        printer.setMessageService(service);
//        printer.printMessage();
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);

        MessageService service = context.getBean(MessageService.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);

        System.out.println(service);
        System.out.println(printer);

        printer.setMessageService(service);
        printer.printMessage();
    }
}

package springboot.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by wuzhiyong on 2017/2/21.
 *
 */

@Controller
@EnableAutoConfiguration
public class SampleController {
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello world";
    }

    public static void main(String[] args) {
        new SampleController().scheduleTask();
        SpringApplication.run(SampleController.class, args);
    }


    @Scheduled()
    public void scheduleTask(){
        System.out.println(new Date());
    }

}

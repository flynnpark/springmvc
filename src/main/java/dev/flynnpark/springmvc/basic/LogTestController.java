package dev.flynnpark.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("log-test")
    public String logTest() {
        String name = "Spring";

        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        // 로그를 사용하지 않아도 a + b 로직이 먼저 실행된다. 이런 방식으로 사용하면 안 된다.
        // 로그 레벨에 따라 사용되지 않는 로그이더라도 로직이 실행되어 메모리 등 자원을 사용한다.
        log.debug("String concat log = " + name);
        return "ok";
    }
}

package com.lc.demo.system;

import com.lc.demo.jvm.TestStackDeep;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Order(1)
public class SystemComponent implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

//        try {
//            System.out.println("开始调用了。。。");
//            TestStackDeep.recursion(0L, 0L, 0L);
////            TestStackDeep.recursion();
//        } catch (Throwable e) {
//            System.out.println(e);
//            System.out.println("deep of calling = " + TestStackDeep.count);
//        }


        System.out.println("你准备好了吗？");

    }
}

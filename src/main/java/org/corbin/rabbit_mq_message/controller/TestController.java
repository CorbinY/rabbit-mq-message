package org.corbin.rabbit_mq_message.controller;

import org.corbin.rabbit_mq_message.server.Send;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yin
 * @date 2019/06/24
 */
@RestController
@RequestMapping("/")
public class TestController {
    @Autowired
    private Send sender;

    @GetMapping("/test1")
    public void Test1() {
        sender.sendMsg();
    }
}

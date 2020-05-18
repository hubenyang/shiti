package com.comm.weixin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//import com.topcom.cms.spider.core.config.SpiderConfigAware;
/**
 * @author hubenyang
 * @date 10:35 2019/07/29
 */
@Component
public class WeixinBoot implements CommandLineRunner {


    /**
     * 根据好友的昵称
     * @param nickName 好友昵称
     * @param msg 发送消息
     */
    public Boolean sendMsg(String nickName, String msg) {
        HelloBot helloBot = HelloBot.getInstance();
        if (null != helloBot) {
            String fromUserName = helloBot.api().getAccountByName(nickName).getUserName();
            return helloBot.sendMsg(fromUserName, msg);
        }
        return false;
    }

    @Override
    public void run(String... args) throws Exception {

    }

    public static void main(String[] args) {

    }
}

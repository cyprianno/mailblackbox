package com.mailblackbox.app.processing;

import com.mailblackbox.app.commands.BaseCommand;
import com.mailblackbox.app.commands.CommandResult;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/**
 * Created by cypri on 14.03.2017.
 */
@Service
public class TestService {

    public Message result(Message message) throws InterruptedException {
        Thread.sleep(100);
        System.out.println(message);
        System.out.println("msg?");
        return message;
    }
}

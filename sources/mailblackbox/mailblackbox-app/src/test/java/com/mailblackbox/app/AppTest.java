package com.mailblackbox.app;

import com.mailblackbox.app.commands.CommandResult;
import com.mailblackbox.app.commands.admin.UpdateDatabaseCommand;
import com.mailblackbox.app.processing.CommandGateway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Unit test for simple MbbApplication.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration()
@Import({MbbApplication.class, SIConfiguration.class})
@PropertySource({"classpath:application.properties"})
@WebAppConfiguration
public class AppTest {

    @Autowired
    private CommandGateway gateway;

    @Test
    public void checkGateway() throws ExecutionException, InterruptedException {
        //given
        UUID uuid = UUID.randomUUID();
        System.out.println(gateway);
        Map map = new HashMap();
/*
        map.put("id", uuid);
        map.put("timestamp", System.currentTimeMillis());
*/
        map.put("test", "value");
        Message m = new GenericMessage(new UpdateDatabaseCommand("0000", false), new MessageHeaders(map));
        //when
        Future<UpdateDatabaseCommand> send = gateway.send(new GenericMessage(new UpdateDatabaseCommand("1111", false), new MessageHeaders(map)));
        //then
        UpdateDatabaseCommand commandResult = send.get();
        System.out.println(commandResult);
    }
}

package com.mailblackbox.app.processing;

import com.mailblackbox.app.commands.BaseCommand;
import com.mailblackbox.app.commands.CommandResult;
import com.mailblackbox.app.commands.admin.UpdateDatabaseCommand;
import org.springframework.integration.annotation.Gateway;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

import java.util.concurrent.Future;

/**
 * Created by cypri on 14.03.2017.
 */
public interface CommandGateway {

    @Gateway(requestChannel = "gwChannel")
    Future<UpdateDatabaseCommand> send(GenericMessage command);

    @Gateway(requestChannel = "gw2Channel")
    void resp(Message result);
}

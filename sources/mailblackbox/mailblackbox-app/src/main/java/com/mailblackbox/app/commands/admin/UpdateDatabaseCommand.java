package com.mailblackbox.app.commands.admin;

import com.mailblackbox.app.commands.BaseCommand;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by cypri on 14.03.2017.
 */
@AllArgsConstructor()
@Getter
public class UpdateDatabaseCommand extends BaseCommand {
    private String aggregateUid;
    private boolean x;
}

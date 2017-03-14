package com.mailblackbox.app.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by cypri on 14.03.2017.
 */
public abstract class BaseCommand {

    public abstract String getAggregateUid();
}

package com.mailblackbox.app.apiv1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

/**
 * Created by csniegot on 2017-03-29.
 */
@AllArgsConstructor
@Getter
public class Project {
    private final String uid;
    private final String name;
    private final List<ShortUserAccount> users;
}

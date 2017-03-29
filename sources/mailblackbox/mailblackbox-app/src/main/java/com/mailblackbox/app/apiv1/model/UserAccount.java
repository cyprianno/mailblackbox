package com.mailblackbox.app.apiv1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by csniegot on 2017-03-29.
 */
@AllArgsConstructor
@Getter
public class UserAccount {
    private final String uid;
    private final String email;
    private final String password;
    private final String name;
}

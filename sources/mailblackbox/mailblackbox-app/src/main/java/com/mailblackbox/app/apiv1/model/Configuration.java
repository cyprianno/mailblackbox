package com.mailblackbox.app.apiv1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

/**
 * Created by csniegot on 2017-03-29.
 */
@AllArgsConstructor
@Getter
public class Configuration {
    private final Map<String, String> data;
}

package com.mailblackbox.app.apiv1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by cypri on 14.03.2017.
 */
@Getter
@AllArgsConstructor
public class Request {

    private boolean waitForResponse = true;
}

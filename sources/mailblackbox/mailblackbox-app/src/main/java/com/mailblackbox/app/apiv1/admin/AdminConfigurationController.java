package com.mailblackbox.app.apiv1.admin;

import com.mailblackbox.app.apiv1.model.Configuration;
import com.mailblackbox.app.apiv1.model.Result;
import com.mailblackbox.app.apiv1.model.ResultStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by csniegot on 2017-03-29.
 */
@RestController
@RequestMapping("/admin/configuration")
public class AdminConfigurationController {

    @RequestMapping(path = "")
    public Configuration getConfiguration() {
        return new Configuration(new HashMap<String, String>());
    }

    @RequestMapping(path = "", method = RequestMethod.PUT)
    public Result updateConfigurationOptions(Configuration configuration) {
        return new Result(ResultStatus.OK);
    }
}

package com.mailblackbox.app.apiv1.projectandemail;

import com.mailblackbox.app.apiv1.model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csniegot on 2017-03-29.
 */
@RestController
public class TemplateController {
    @RequestMapping(path = "template")
    public MailTemplate find(ProjectQuery query) {
        return new MailTemplate("");
    }

    @RequestMapping(path = "template", method = RequestMethod.POST)
    public Result create(MailTemplate userAccount) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "template", method = RequestMethod.PUT)
    public Result update(MailTemplate userAccount) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "template", method = RequestMethod.DELETE)
    public Result delete(MailTemplate userAccount) {
        return new Result(ResultStatus.OK);
    }
}

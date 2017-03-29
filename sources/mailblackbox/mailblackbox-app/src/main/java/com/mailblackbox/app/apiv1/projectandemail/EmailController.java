package com.mailblackbox.app.apiv1.projectandemail;

import com.mailblackbox.app.apiv1.model.MailMessage;
import com.mailblackbox.app.apiv1.model.MailMessageQuery;
import com.mailblackbox.app.apiv1.model.Result;
import com.mailblackbox.app.apiv1.model.ResultStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csniegot on 2017-03-29.
 */
@RestController
public class EmailController {

    @RequestMapping(path = "mail", method = RequestMethod.POST)
    public Result send(MailMessage message) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "mail", method = RequestMethod.PUT)
    public Result update(MailMessage message) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "mail", method = RequestMethod.GET)
    public MailMessage update(MailMessageQuery query) {
        return new MailMessage();
    }
}

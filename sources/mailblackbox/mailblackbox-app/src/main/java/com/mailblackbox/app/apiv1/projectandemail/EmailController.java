package com.mailblackbox.app.apiv1.projectandemail;

import com.mailblackbox.app.apiv1.model.MailMessage;
import com.mailblackbox.app.apiv1.model.MailMessageQuery;
import com.mailblackbox.app.apiv1.model.Result;
import com.mailblackbox.app.apiv1.model.ResultStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csniegot on 2017-03-29.
 */
@RestController
@RequestMapping(path = "/project/{projuid}/mail")
public class EmailController {

    @RequestMapping(path = "", method = RequestMethod.POST)
    public Result send(@PathVariable("projuid") String projectUid, MailMessage message) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.PUT)
    public Result update(@PathVariable("projuid") String projectUid, MailMessage message) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public MailMessage update(@PathVariable("projuid") String projectUid, MailMessageQuery query) {
        return new MailMessage("", null);
    }
}

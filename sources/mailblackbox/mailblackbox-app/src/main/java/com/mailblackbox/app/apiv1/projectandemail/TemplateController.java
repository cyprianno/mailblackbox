package com.mailblackbox.app.apiv1.projectandemail;

import com.mailblackbox.app.apiv1.model.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csniegot on 2017-03-29.
 */
@RestController
@RequestMapping(path = "/project/{projuid}/template")
public class TemplateController {
    @RequestMapping(path = "")
    public MailTemplate find(@PathVariable("projuid") String projectUid, TemplateQuery query) {
        return new MailTemplate("");
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public Result create(@PathVariable("projuid") String projectUid, MailTemplate userAccount) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.PUT)
    public Result update(@PathVariable("projuid") String projectUid, MailTemplate userAccount) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.DELETE)
    public Result delete(@PathVariable("projuid") String projectUid, MailTemplate userAccount) {
        return new Result(ResultStatus.OK);
    }
}

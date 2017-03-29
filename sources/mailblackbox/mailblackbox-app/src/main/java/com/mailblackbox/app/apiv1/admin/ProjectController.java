package com.mailblackbox.app.apiv1.admin;

import com.mailblackbox.app.apiv1.model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csniegot on 2017-03-29.
 */
@RestController
public class ProjectController {
    @RequestMapping(path = "project")
    public Project find(ProjectQuery query) {
        return new UserAccount("", "", "", "");
    }

    @RequestMapping(path = "project", method = RequestMethod.POST)
    public Result create(Project userAccount) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "project", method = RequestMethod.PUT)
    public Result update(Project userAccount) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "project", method = RequestMethod.DELETE)
    public Result delete(Project userAccount) {
        return new Result(ResultStatus.OK);
    }
}
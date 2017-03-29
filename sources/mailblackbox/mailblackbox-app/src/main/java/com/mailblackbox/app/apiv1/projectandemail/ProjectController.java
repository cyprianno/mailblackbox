package com.mailblackbox.app.apiv1.projectandemail;

import com.mailblackbox.app.apiv1.model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

/**
 * Created by csniegot on 2017-03-29.
 */
@RestController()
public class ProjectController {
    @RequestMapping(path = "project")
    public Project find(ProjectQuery query) {
        return new Project("", "", Collections.<ShortUserAccount>emptyList(),null);
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

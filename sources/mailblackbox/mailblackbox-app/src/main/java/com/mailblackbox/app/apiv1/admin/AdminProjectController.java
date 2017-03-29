package com.mailblackbox.app.apiv1.admin;

import com.mailblackbox.app.apiv1.model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

/**
 * Created by csniegot on 2017-03-29.
 */
@RestController
@RequestMapping(path = "/admin/project")
public class AdminProjectController {
    @RequestMapping(path = "")
    public Project find(ProjectQuery query) {
        return new Project("", "", Collections.<ShortUserAccount>emptyList(),null);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public Result create(Project userAccount) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.PUT)
    public Result update(Project userAccount) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.DELETE)
    public Result delete(Project userAccount) {
        return new Result(ResultStatus.OK);
    }
}

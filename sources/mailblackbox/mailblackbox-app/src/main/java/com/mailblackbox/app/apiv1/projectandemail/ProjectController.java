package com.mailblackbox.app.apiv1.projectandemail;

import com.mailblackbox.app.apiv1.model.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

/**
 * Created by csniegot on 2017-03-29.
 */
@RestController()
@RequestMapping(path = "/project")
public class ProjectController {
    @RequestMapping(path = "")
    public Project find(ProjectQuery query) {
        return new Project("", "", Collections.<ShortUserAccount>emptyList(),null);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public Result create(Project userAccount) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "/{projuid}", method = RequestMethod.PUT)
    public Result update(@PathVariable("projuid") String projectUid, Project project) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "/{projuid}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable("projuid") String projectUid) {
        return new Result(ResultStatus.OK);
    }
}

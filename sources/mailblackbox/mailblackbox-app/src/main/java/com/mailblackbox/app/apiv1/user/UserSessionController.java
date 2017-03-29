package com.mailblackbox.app.apiv1.user;

import com.mailblackbox.app.apiv1.model.Result;
import com.mailblackbox.app.apiv1.model.ResultStatus;
import com.mailblackbox.app.apiv1.model.UserAccount;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csniegot on 2017-03-29.
 */
@RestController
public class UserSessionController {

    @RequestMapping(path = "account/session", method = RequestMethod.POST)
    public Result login(UserAccount data) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "account/session", method = RequestMethod.DELETE)
    public Result logout(UserAccount data) {
        return new Result(ResultStatus.OK);
    }


}

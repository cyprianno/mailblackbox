package com.mailblackbox.app.apiv1.user;

import com.mailblackbox.app.apiv1.model.Result;
import com.mailblackbox.app.apiv1.model.ResultStatus;
import com.mailblackbox.app.apiv1.model.UserAccount;
import com.mailblackbox.app.apiv1.model.UserAccountQuery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csniegot on 2017-03-29.
 */
@RestController
public class UserAccountController {

    @RequestMapping(path = "account")
    public UserAccount details(UserAccountQuery query) {
        return new UserAccount("", "","","");
    }
    @RequestMapping(path = "account", method = RequestMethod.POST)
    public Result register(UserAccount data) {
        return new Result(ResultStatus.OK);
    }
    @RequestMapping(path = "account", method = RequestMethod.PUT)
    public Result update(UserAccount data) {
        return new Result(ResultStatus.OK);
    }




}

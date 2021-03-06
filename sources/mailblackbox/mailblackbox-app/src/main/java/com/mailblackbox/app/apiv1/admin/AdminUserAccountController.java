package com.mailblackbox.app.apiv1.admin;

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
@RequestMapping(path = "/admin/useraccount")
public class AdminUserAccountController {

    @RequestMapping(path = "")
    public UserAccount find(UserAccountQuery userAccountQuery) {
        return new UserAccount("", "", "", "");
    }
    @RequestMapping(path = "", method = RequestMethod.POST)
    public Result create(UserAccount userAccount) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.PUT)
    public Result update(UserAccount userAccount) {
        return new Result(ResultStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.DELETE)
    public Result delete(UserAccount userAccount) {
        return new Result(ResultStatus.OK);
    }


}

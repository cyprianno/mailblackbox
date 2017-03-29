package com.mailblackbox.app.apiv1.admin;

import com.mailblackbox.app.apiv1.model.Result;
import com.mailblackbox.app.apiv1.model.ResultStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * Created by cypri on 14.03.2017.
 */
@RestController
@RequestMapping("/admin/installation")
public class AdminInstallationController {
    private static final Logger log = LoggerFactory.getLogger(AdminInstallationController.class);

    @Value("${mbb.install.authtoken:}")
    private String installAuthToken;

    @PostConstruct
    private void initialize() {
        //TODO: move to business class
        if (StringUtils.isEmpty(installAuthToken)) {
            installAuthToken = "123";
        }
        log.info("Installation token is: " + installAuthToken);
    }

    @RequestMapping(path = "")
    public Result installation() {
        return new Result(ResultStatus.ERROR);
    }
}


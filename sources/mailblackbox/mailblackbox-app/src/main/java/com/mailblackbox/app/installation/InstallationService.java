package com.mailblackbox.app.installation;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.util.maven.example.tables.Installation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cyprian on 01.04.17.
 */
@Service
public class InstallationService {
    @Autowired
    DSLContext dsl;

    public void checkVersion() {
        Record record = dsl.select().from(Installation.INSTALLATION).where(Installation.INSTALLATION.ID.gt(1)).fetchAny();

    }
}


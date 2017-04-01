package com.mailblackbox.app;

import org.apache.commons.dbcp2.BasicDataSource;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;

/**
 * Created by cyprian on 01.04.17.
 */
@Configuration
public class DatabaseConfiguration {

    @Bean(destroyMethod = "close")
    public DataSource dataSource(@Value("${db.url}") String url,@Value("${db.user}") String user,@Value("${db.password}") String password) {
        org.apache.commons.dbcp2.BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }

    @Bean
    @Primary
    public TransactionAwareDataSourceProxy transactionAwareDataSource(DataSource dataSource) {
        TransactionAwareDataSourceProxy transactionAwareDataSourceProxy = new TransactionAwareDataSourceProxy();
        transactionAwareDataSourceProxy.setTargetDataSource(dataSource);
        transactionAwareDataSourceProxy.afterPropertiesSet();
        return transactionAwareDataSourceProxy;
    }

    @Bean
    public DataSourceConnectionProvider connectionProvider(DataSource dataSource) {
        return new DataSourceConnectionProvider(transactionAwareDataSource(dataSource));
    }

    @Bean
    public DSLContext dsl(DataSource dataSource) {
        return new DefaultDSLContext(jooqConfig(dataSource));
    }

    @Bean
    public DefaultConfiguration jooqConfig(DataSource dataSource) {
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        defaultConfiguration.setSQLDialect(SQLDialect.MYSQL);
        defaultConfiguration.setConnectionProvider(connectionProvider(dataSource));
//        defaultConfiguration.setExecuteListenerProvider(new DefaultExecuteListenerProvider(exceptionTranslator()));
        return defaultConfiguration;
    }

/*
    @Bean
    public ExecuteListener exceptionTranslator() {
        return new ExceptionTranslator

    }
*/
}

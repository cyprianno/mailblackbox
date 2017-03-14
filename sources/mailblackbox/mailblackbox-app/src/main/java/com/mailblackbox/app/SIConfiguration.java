package com.mailblackbox.app;

import com.mailblackbox.app.processing.CommandGateway;
import com.mailblackbox.app.processing.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.ServiceActivatorFactoryBean;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.gateway.GatewayProxyFactoryBean;
import org.springframework.integration.stream.CharacterStreamWritingMessageHandler;
import org.springframework.messaging.MessageChannel;

import java.io.OutputStreamWriter;

/**
 * Created by cypri on 14.03.2017.
 */
@Configuration
public class SIConfiguration {

    @Bean
    public GatewayProxyFactoryBean gateway() {
        GatewayProxyFactoryBean gatewayProxyFactoryBean = new GatewayProxyFactoryBean();
        gatewayProxyFactoryBean.setServiceInterface(CommandGateway.class);
        gatewayProxyFactoryBean.setDefaultRequestChannel(gwChannel());
        gatewayProxyFactoryBean.setDefaultReplyChannel(retChannel());
        return gatewayProxyFactoryBean;
    }

    @Bean
    public MessageChannel gwChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel gw2Channel() {
        return new DirectChannel();
    }


    @Bean
    public MessageChannel retChannel() {
        return new DirectChannel();
    }


    @Bean
    public IntegrationFlow integrationFlow(TestService testService) throws Exception {
        return IntegrationFlows.from(gwChannel())
                .handle(serviceActivatorFactoryBean(null).getObject()).handle(testService,"result")
                .get();
    }

    @Bean
    public IntegrationFlow integrationFlow2() throws Exception {
        return IntegrationFlows.from(gw2Channel())
                .handle(serviceActivatorFactoryBean2(null).getObject()).channel(retChannel())
                .get();
    }

    @Bean
    public ServiceActivatorFactoryBean serviceActivatorFactoryBean(TestService testService) {
        ServiceActivatorFactoryBean s = new ServiceActivatorFactoryBean();
        s.setTargetObject(testService);
        s.setTargetMethodName("result");
        return s;
    }
    @Bean
    public ServiceActivatorFactoryBean serviceActivatorFactoryBean2(TestService testService) {
        ServiceActivatorFactoryBean s = new ServiceActivatorFactoryBean();
        s.setTargetObject(testService);
        s.setTargetMethodName("result");
        return s;
    }

    @Bean
    public CharacterStreamWritingMessageHandler outChannelAdapter() {
        return new CharacterStreamWritingMessageHandler(new OutputStreamWriter(System.out));
    }

}

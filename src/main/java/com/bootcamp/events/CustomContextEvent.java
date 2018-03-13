package com.bootcamp.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;


class CustomContextEvent implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent event)
    {

        System.out.println("Welcome User...");
    }
}
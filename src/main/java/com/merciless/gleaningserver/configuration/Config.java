package com.merciless.gleaningserver.configuration;

import org.springframework.stereotype.Component;

@Component
public class Config {

    public static final int SERVER_PORT = 8300;

    public static final int GLEANER_PORT = 8010;

    public static final int PROVIDER_PORT = 8020;

    public static final String SELF = "beluga";
}

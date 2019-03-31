package com.example.tech_tea.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@ToString
@Component
@ConfigurationProperties(prefix="server")
public class ServerProperties {
    @Getter @Setter private String name;
    @Getter @Setter private Host host;

    @PostConstruct
    void prettyPrint() {
        System.out.println(toString());
    }

    @ToString
    private static class Host {
        @Getter @Setter private String ip;
        @Getter @Setter private int port;
    }
}

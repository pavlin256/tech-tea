package com.example.tech_tea.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
@ToString
public class Host {
    @Getter @Setter private String ip;
    @Getter @Setter private int port;
}

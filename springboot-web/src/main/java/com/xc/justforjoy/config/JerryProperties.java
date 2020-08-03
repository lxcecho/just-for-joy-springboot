package com.xc.justforjoy.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
@Component
@Data
public class JerryProperties {
    @Value("${com.xc.title")
    private String title;

    @Value("${com.xc.description}")
    private String description;
}

package net.theStol.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Руслан on 17.06.2017.
 */

@Configuration
@EnableWebMvc
@ComponentScan("net.theStol")
public class WebConfig extends WebMvcConfigurerAdapter{
}

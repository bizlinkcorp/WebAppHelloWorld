package org.test.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration(exclude = {
		org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration.class,
		org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
})
@ComponentScan({ "org.test.web" })
public class AppConfiguration {
}

/**
 * @author Oleksandr Ivanov
 * @since 1.0.0
 */
open module service.registry {
    requires static lombok;
    requires spring.beans;
    requires spring.context;
    requires spring.core;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.actuator;
    requires spring.boot.autoconfigure;
    requires spring.aop;
    requires spring.cloud.netflix.eureka.server;
}

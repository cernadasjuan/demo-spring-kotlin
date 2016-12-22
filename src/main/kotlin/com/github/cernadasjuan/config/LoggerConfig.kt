package com.github.cernadasjuan.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.InjectionPoint
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope

@Configuration
open class LoggerConfig {

    @Bean
    @Scope("prototype")
    open fun logger(injectionPoint: InjectionPoint): Logger = LoggerFactory.getLogger(injectionPoint.member.name)
}
package com.example.sprint12

import com.example.sprint12.model.GDP
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.DispatcherServlet
import org.springframework.web.servlet.config.annotation.EnableWebMvc


var ourGdpList: GdpList = GdpList()


@EnableWebMvc
@SpringBootApplication
class Sprint12Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var ctx: ApplicationContext = SpringApplication.run(Sprint12Application::class.java, *args)
            var dispatcherServlet: DispatcherServlet = ctx.getBean("dispatcherServlet") as DispatcherServlet
            dispatcherServlet.setThrowExceptionIfNoHandlerFound(true)
        }
    }

    @Bean
    fun producerJackson2MessageConverter(): Jackson2JsonMessageConverter {
        return Jackson2JsonMessageConverter()
    }
}
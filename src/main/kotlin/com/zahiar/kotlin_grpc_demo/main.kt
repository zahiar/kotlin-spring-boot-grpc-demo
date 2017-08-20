package com.zahiar.kotlin_grpc_demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class HelloProfileApplication {

    @Bean
    open fun demoService(): DemoService {
        return DemoService()
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(HelloProfileApplication::class.java, *args)
}

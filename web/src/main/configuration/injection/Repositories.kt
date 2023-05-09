package web.configuration.injection

import domain.order.OrderRepository
import infrastructure.repositories.OrderRepositoryImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Repositories {
    @Bean
    fun getOrderRepository() : OrderRepository {
        return OrderRepositoryImpl()
    }
}

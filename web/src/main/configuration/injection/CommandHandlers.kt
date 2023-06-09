package web.configuration.injection

import application.order.commandhandlers.OrderCommandHandlers
import domain.order.OrderRepository
import domain.order.payment.PaymentService
import org.axonframework.eventhandling.EventBus
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CommandHandlers {
    @Autowired
    lateinit var orderRepository: OrderRepository

    @Autowired
    lateinit var paymentService: PaymentService

    @Autowired
    lateinit var eventBus: EventBus

    @Bean
    fun getOrderCommandHandler(): OrderCommandHandlers {
        return OrderCommandHandlers(orderRepository, paymentService, eventBus)
    }
}
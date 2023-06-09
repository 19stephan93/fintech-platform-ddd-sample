package web.configuration.injection

import application.shipping.eventhandlers.ShipOrderAndNotifyUser
import domain.order.OrderRepository
import domain.shipping.ShippingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class EventHandlers {
    @Autowired
    lateinit var orderRepository: OrderRepository

    @Autowired
    lateinit var shippingService: ShippingService

    @Bean
    fun getShipPaidProductAndNotifyUserEventHandler(): ShipOrderAndNotifyUser {
        return ShipOrderAndNotifyUser(orderRepository, shippingService)
    }
}
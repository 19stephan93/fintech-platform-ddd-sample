package application.shipping.eventhandlers

import domain.order.OrderPaid
import domain.order.OrderRepository
import domain.shipping.ShippingService
import org.axonframework.eventhandling.EventHandler

open class ShipOrderAndNotifyUser(private val orderRepository: OrderRepository,
                                  private val shippingService: ShippingService) {
    @EventHandler
    fun handle(event: OrderPaid) {
        val order = orderRepository.findById(event.orderId)
        shippingService.shipOrder(order)
    }
}


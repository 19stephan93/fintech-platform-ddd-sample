package domain.shipping

import domain.order.customer.Customer
import java.util.UUID

interface NotificationService {
    fun notifyCustomerOrderShipped(customer: Customer, id: UUID, shippingLabel: ShippingLabel)
}
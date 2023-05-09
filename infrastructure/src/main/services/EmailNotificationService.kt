package infrastructure.services

import domain.order.customer.Customer
import domain.shipping.NotificationService
import domain.shipping.ShippingLabel
import java.util.*

class EmailNotificationService : NotificationService {
    override fun notifyCustomerOrderShipped(customer: Customer, id: UUID, shippingLabel: ShippingLabel) {
        // populate and send mail ...
    }
}
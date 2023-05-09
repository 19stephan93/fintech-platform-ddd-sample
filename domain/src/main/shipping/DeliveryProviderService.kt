package domain.shipping

import domain.order.Order

interface DeliveryProviderService {
    fun requestFastDelivery(order: Order) : ShippingLabel
    fun requestStandardDelivery(order: Order) : ShippingLabel
}
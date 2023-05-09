package application.order.commandhandlers.commands

import domain.order.payment.CreditCard
import java.util.UUID

data class PayOrderCommand(val orderId: UUID, val creditCard: CreditCard)
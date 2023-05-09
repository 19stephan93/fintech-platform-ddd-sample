package infrastructure.services

import domain.order.payment.CreditCard
import domain.order.payment.PaymentService

class PaymentServiceImpl : PaymentService {
    override fun debitValueByCreditCard(creditCard: CreditCard): Boolean {
        return true
    }
}
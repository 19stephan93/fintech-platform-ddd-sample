package domain.order.payment

interface PaymentService {
    fun debitValueByCreditCard(creditCard: CreditCard) : Boolean
}
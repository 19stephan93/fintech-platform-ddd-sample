package infrastructure.repositories

import domain.order.Order
import domain.order.OrderRepository
import domain.order.Product
import domain.order.customer.Address
import domain.order.customer.Customer
import org.javamoney.moneta.Money
import java.util.UUID
import javax.money.Monetary

class OrderRepositoryImpl : OrderRepository {
    private val fakeCustomer = Customer(UUID.randomUUID(), "John Doe", Address("a",1, "c", "d"))

    override fun findById(id: UUID): Order {
        return Order(id = id,
                     customer = fakeCustomer)
    }

    override fun findProductById(productId: UUID): Product {
        return Product(productId,
                       "Keyboard",
                       Money.of(19.90, Monetary.getCurrency("USD")))
    }

    override fun findCustomerById(customerId: UUID): Customer {
        return fakeCustomer
    }

    override fun save(order: Order) {
        //TODO
    }
}

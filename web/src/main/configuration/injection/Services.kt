package web.configuration.injection

import domain.shipping.ShippingService
import infrastructure.services.EmailNotificationService
import infrastructure.services.FedExDeliveryService
import infrastructure.services.PaymentServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Services {
    @Bean
    fun getPaymentService(): PaymentServiceImpl {
        return PaymentServiceImpl()
    }

    @Bean
    fun getFedExDeliveryService(): FedExDeliveryService {
        return FedExDeliveryService()
    }

    @Bean
    fun getEmailNotificationService(): EmailNotificationService {
        return EmailNotificationService()
    }

    @Bean
    fun getShippingService(): ShippingService {
        return ShippingService(getEmailNotificationService(), getFedExDeliveryService())
    }
}
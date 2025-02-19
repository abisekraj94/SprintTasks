package Service;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Cacheable(value = "products", key = "#productId")
    public String getProductById(String productId) {
        // Simulate a slow operation like a database call
        simulateSlowService();
        return "Product-" + productId;
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000L); // Simulating a delay to show caching
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package Repository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RedisProductRepository {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void saveProduct(String productId, String productData) {
        redisTemplate.opsForValue().set(productId, productData);
    }

    public String getProduct(String productId) {
        return (String) redisTemplate.opsForValue().get(productId);
    }
}

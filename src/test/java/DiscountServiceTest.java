import com.demo.lektion1.DiscountService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiscountServiceTest {
        //Discount
        // sum 500 - 10%
        @Test
        void applyDiscountWhenSumExceeds500With10Percent() {

                DiscountService discountService = new DiscountService();
                double sum = 500;
                double discount = 10;

                discountService.discount = discount;
                discountService.sum = sum;

                System.out.println(discountService.applyDiscount());

                //applyDiscount
                assertEquals(450, discountService.applyDiscount());

        }


}

package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    void checkDiscountPrices() {

        Product Table = new Product("Table", 20.0,"HOME");
        Product Laptop = new Product("Laptop", 300.0,"BUSINESS");
        Double businessPrice1=0.0, businessPrice2 = 0.0;

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> results = Arrays.asList(Table, Laptop);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier discApply = new DiscountApplier(dao);
        List<Product> result = discApply.setNewPrices();

        for (Product p : result)
        {
            if(p.getCategory().equals("BUSINESS")) businessPrice1 = p.getPrice();
            if(p.getCategory().equals("HOME")) businessPrice2 = p.getPrice();

        }

        Assertions.assertEquals(java.util.Optional.of(330.0),java.util.Optional.of(businessPrice1));
        Assertions.assertEquals(java.util.Optional.of(18.0),java.util.Optional.of(businessPrice2));

    }

}

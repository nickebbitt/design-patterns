package factorymethod;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class GuatemalanCoffeeShopShould {

    @Test
    public void create_guatemalan_coffee() {
        // Given
        final CoffeeShop coffeeShop = new GuatemalanCoffeeShop();

        // When
        Coffee coffee = coffeeShop.prepareCoffee();
        coffee.brew();

        // Then
        assertThat(coffee).isInstanceOf(GuatemalanCoffee.class);
        assertTrue(coffee.isReady());
    }

}

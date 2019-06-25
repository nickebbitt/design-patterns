package factorymethod;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class ColombianCoffeeShopShould {

    @Test
    public void create_colombian_coffee() {
        // Given
        final CoffeeShop coffeeShop = new ColombianCoffeeShop();

        // When
        Coffee coffee = coffeeShop.prepareCoffee();
        coffee.brew();

        // Then
        assertThat(coffee).isInstanceOf(ColombianCoffee.class);
        assertTrue(coffee.isReady());
    }
}

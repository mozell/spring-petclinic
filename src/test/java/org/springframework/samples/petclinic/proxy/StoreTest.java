package org.springframework.samples.petclinic.proxy;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {

	@Test
	public void testPay() {
		Payment cashPerf = new CashPerf();
		Store store = new Store(cashPerf);
		store.buySomething(100);

	}

}

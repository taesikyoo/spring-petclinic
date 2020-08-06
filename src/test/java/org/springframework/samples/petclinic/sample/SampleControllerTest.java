package org.springframework.samples.petclinic.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SampleControllerTest {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void testDI() {
		SampleController bean = applicationContext.getBean(SampleController.class);
		assertThat(bean).isNotNull();
	}
}

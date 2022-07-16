package me.lee_sh1673.core.discount;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import me.lee_sh1673.core.member.Grade;
import me.lee_sh1673.core.member.Member;

class RateDiscountPolicyTest {

	RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

	@Test
	@DisplayName("VIP 10% 할인 적용 테스트")
	void shouldApplyDiscountAIPCorrectly() {
		// given
		Member member = new Member(1L, "memeber-A", Grade.VIP);
		// when
		int discount = rateDiscountPolicy.discount(member, 10000);
		// then
		assertThat(discount).isEqualTo(1000);
	}

	@Test
	@DisplayName("VIP가 아닌 고객 할인은 할인 적용이 되지 않아야 함.")
	void shouldNoDiscountNonVIPCorrectly() {
		// given
		Member member = new Member(2L, "memeber-BASIC", Grade.BASIC);
		// when
		int discount = rateDiscountPolicy.discount(member, 10000);
		// then
		assertThat(discount).isEqualTo(0);
	}
}
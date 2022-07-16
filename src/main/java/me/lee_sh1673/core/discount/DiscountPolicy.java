package me.lee_sh1673.core.discount;

import me.lee_sh1673.core.member.Member;

public interface DiscountPolicy {

	/**
	 * @return 할인 대상 금액
	 */
	int discount(Member member, int price);
}

package me.lee_sh1673.core.discount;

import me.lee_sh1673.core.member.Grade;
import me.lee_sh1673.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

	private int discountPercent = 10;

	@Override
	public int discount(Member member, int price) {

		if (member.getGrade() == Grade.VIP) {
			return price *  discountPercent / 100;
		}
		return 0;
	}
}

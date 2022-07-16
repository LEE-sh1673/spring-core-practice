package me.lee_sh1673.core.discount;

import me.lee_sh1673.core.member.Grade;
import me.lee_sh1673.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

	private int discountFixAmount = 1000;

	@Override
	public int discount(Member member, int price) {

		if (member.getGrade() == Grade.VIP) {
			return discountFixAmount;
		}
		return 0;
	}
}

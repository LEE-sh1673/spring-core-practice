package me.lee_sh1673.core.order;

import me.lee_sh1673.core.discount.DiscountPolicy;
import me.lee_sh1673.core.discount.FixDiscountPolicy;
import me.lee_sh1673.core.discount.RateDiscountPolicy;
import me.lee_sh1673.core.member.Member;
import me.lee_sh1673.core.member.MemberRepository;
import me.lee_sh1673.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

	private final MemberRepository memberRepository
		= new MemoryMemberRepository();

	private DiscountPolicy discountPolicy;

	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		Member member = memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
		return new Order(memberId, itemName, itemPrice, discountPrice);
	}
}

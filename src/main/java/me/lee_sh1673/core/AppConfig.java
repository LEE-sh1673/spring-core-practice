package me.lee_sh1673.core;

import me.lee_sh1673.core.discount.DiscountPolicy;
import me.lee_sh1673.core.discount.RateDiscountPolicy;
import me.lee_sh1673.core.member.MemberRepository;
import me.lee_sh1673.core.member.MemberService;
import me.lee_sh1673.core.member.MemberServiceImpl;
import me.lee_sh1673.core.member.MemoryMemberRepository;
import me.lee_sh1673.core.order.OrderService;
import me.lee_sh1673.core.order.OrderServiceImpl;

public class AppConfig {

	public MemberService memberService() {
		return new MemberServiceImpl(memberRepository());
	}

	public OrderService orderService() {
		return new OrderServiceImpl(memberRepository(), DiscountPolicy());
	}

	private DiscountPolicy DiscountPolicy() {
		// return new FixDiscountPolicy();
		return new RateDiscountPolicy();
	}

	private MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}
}

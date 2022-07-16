package me.lee_sh1673.core;

import me.lee_sh1673.core.member.Grade;
import me.lee_sh1673.core.member.Member;
import me.lee_sh1673.core.member.MemberService;
import me.lee_sh1673.core.member.MemberServiceImpl;
import me.lee_sh1673.core.order.Order;
import me.lee_sh1673.core.order.OrderService;
import me.lee_sh1673.core.order.OrderServiceImpl;

public class OrderApp {

	public static void main(String[] args) {
		MemberService memberService = new MemberServiceImpl();
		OrderService orderService = new OrderServiceImpl();

		Long memberId = 1L;
		Member member = new Member(memberId, "member-A", Grade.VIP);
		memberService.join(member);

		Order order = orderService.createOrder(memberId, "item-A", 10000);
		System.out.println("order = " + order);
	}
}

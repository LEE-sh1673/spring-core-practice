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
		AppConfig appConfig = new AppConfig();
		MemberService memberService = appConfig.memberService();
		OrderService orderService = appConfig.orderService();

		// 참고로 MemoryMemberRepository에는 메모리에 저장하는 store 변수가
		// static 이기 때문에 다른 인스턴스 변수로 접근할 수 있음.
		Long memberId = 1L;
		Member member = new Member(memberId, "member-A", Grade.VIP);
		memberService.join(member);

		Order order = orderService.createOrder(memberId, "item-A", 10000);
		System.out.println("order = " + order);
	}
}

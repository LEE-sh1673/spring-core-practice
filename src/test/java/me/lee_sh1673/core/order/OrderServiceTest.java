package me.lee_sh1673.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.lee_sh1673.core.AppConfig;
import me.lee_sh1673.core.member.Grade;
import me.lee_sh1673.core.member.Member;
import me.lee_sh1673.core.member.MemberService;
import me.lee_sh1673.core.member.MemberServiceImpl;

class OrderServiceTest {

	MemberService memberService;
	OrderService orderService;

	@BeforeEach
	void beforeEach() {
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
		orderService = appConfig.orderService();
	}

	@Test
	void createOrder() {
		Long memberId = 1L;
		Member member = new Member(memberId, "Member-A", Grade.VIP);
		memberService.join(member);

		Order order = orderService.createOrder(memberId, "item-A", 10000);
		Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
	}
}
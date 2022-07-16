package me.lee_sh1673.core;

import me.lee_sh1673.core.member.Grade;
import me.lee_sh1673.core.member.Member;
import me.lee_sh1673.core.member.MemberService;
import me.lee_sh1673.core.member.MemberServiceImpl;

public class MemberApp {

	public static void main(String[] args) {
		MemberService memberService = new MemberServiceImpl();
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberService.join(member);
		Member findMember = memberService.findMember(1L);

		System.out.println("member = " + member.getName());
		System.out.println("findMember = " + findMember.getName());
	}
}

package me.lee_sh1673.core.member;

public interface MemberService {

	void join(Member member);

	Member findMember(Long memberId);
}

package me.lee_sh1673.core.member;

public interface MemberRepository {

	void save(Member member);

	Member findById(Long memberId);
}

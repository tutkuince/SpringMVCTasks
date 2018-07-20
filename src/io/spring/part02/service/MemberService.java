package io.spring.part02.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.spring.part02.domain.Member;

@Service
public class MemberService {
	public List<Member> list() {
		return null;
	}

	public void remove(String memberName) {
		Member member = find(memberName);
		list().remove(member);
	}

	public Member find(String member) {
		return list().stream().filter(m -> m.getName().equals(member)).findFirst().get();
	}
}

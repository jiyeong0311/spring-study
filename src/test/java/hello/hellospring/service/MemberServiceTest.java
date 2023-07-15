package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberService();

    @Test
    void join() {
        //given
        Member member = new Member();
        member.setName("hello");

        //when
        Long saveId = memberService.join(member);

        //then
        Member findmember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findmember.getName());
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}
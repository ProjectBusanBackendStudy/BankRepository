package bank.bankCore.member;

import bank.bankCore.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

public class MemberTest {
    @Test
    @DisplayName("회원가입한 멤버와 해당 아이디로 찾은 멤버가 일치하는지 찾기.")
    public void beforeEach() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);

        //given
        Member member = new Member(1L, "test", 1000000);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then
        assertThat(member).isEqualTo(findMember);
        System.out.println("findMember = " + findMember.getName());
        System.out.println("member = " + member.getName());
    }


}

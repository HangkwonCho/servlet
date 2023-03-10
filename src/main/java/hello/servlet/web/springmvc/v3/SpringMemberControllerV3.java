package hello.servlet.web.springmvc.v3;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 가장 실용적인 방법
 */
@Controller
@RequestMapping("/springmvc/v3/members")
public class SpringMemberControllerV3 {

    /**
     * 1. Http 요청 (고객 요청)
     * 2. DispatcherServlet -> 핸들러 매핑 (조회)
     * 3. DispatcherServlet -> 핸들러 어댑터 목록 (핸들러를 처리할 수 있는 핸들러 어댑터 조회)
     * 4. call Handler by HandlerAdapter - > 핸들러 어댑터를 통해서 핸들러 호출
     * 5. ModelAndView -> 호출된 핸들러를 통해서 ModelAndView 반환
     * 6. ViewResolver -> viewResolver를 호출
     * 7. View -> View 를 찾은후 반환
     * 8. Render -> View가 Render되면서 html로 변환
     * 9. Http 응답 (고객 응답)
     */


    private MemberRepository memberRepository = MemberRepository.getInstance();

    //@RequestMapping(value = "/new-form", method = RequestMethod.GET)
    @GetMapping("/new-form")
    public String newForm() {
        return "new-form";
    }

    //@RequestMapping(value = "/save", method = RequestMethod.POST)
    @PostMapping("/save")
    public String save(@RequestParam("username") String username,
                       @RequestParam("age") int age,
                       Model model) {

        Member member = new Member(username, age);
        memberRepository.save(member);

        model.addAttribute("member", member);
        return "save-result";
    }

    //@GetMapping
    @RequestMapping(method = RequestMethod.GET)
    public String members(Model model) {
        List<Member> members = memberRepository.findAll();
        model.addAttribute("members", members);
        return "members";
    }
}

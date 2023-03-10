package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component("/springmvc/request-handler")
public class MyHttpRequestHandler implements HttpRequestHandler {

    // HandlerMapping - 핸들러 매핑으로 핸들러 조회
    // 0. RequestMappingHandlerMapping : 애노테이션 기반의 컨트롤러면 @RequestMapping에서 사용
    // 1. BeanNameUrlHandlerMapping : 스프링 빈의 이름으로 핸들러를 찾는다. (현재 이게 적용됨)

    // HandlerAdapter - 핸들러 어댑터 조회 & 실행
    // 0. RequestMappingHandlerAdapter : 애노테이션 기반의 컨트롤러면 @RequestMapping에서 사용
    // 1. HttpRequestHandlerAdapter : HttpRequestHandler 처리 (현재 이게 적용됨)
    // 2. SimpleControllerHandlerAdapter : Controller 인터페이스(애노테이션X, 과거에 사용) 처리

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MyHttpRequestHandler.handleRequest");
    }
}

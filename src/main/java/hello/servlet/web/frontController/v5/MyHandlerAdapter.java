package hello.servlet.web.frontController.v5;

import hello.servlet.web.frontController.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAdapter {

    /**
     * handler를 컨트롤
     * 어댑터가 해당 컨트롤러를 처리할 수 있는지 판단하는 메서드
     * @param handler
     * @return boolean
     */
    boolean supports(Object handler);

    /**
     * 어댑터는 실제 컨트롤러를 호출하고 그결과 ModelView를 반환.
     * @param request
     * @param response
     * @param handler
     * @return modelView
     * @throws ServletException
     * @throws IOException
     */
    ModelView handler(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}

package cn.goods.user.web_servlet;


import cn.goods.user.domain.User;
import cn.goods.user.service.UserService;
import cn.itcast.commons.CommonUtils;
import cn.itcast.servlet.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zyh
 * @date 2019/8/18 0018 21:58
 * 佛祖保佑
 */
@WebServlet(name = "UerServlet")
public class UerServlet extends BaseServlet {
    UserService userService  =new UserService();
    public String ajaxFindloginname(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginname = request.getParameter("username");
        boolean b = userService.ajaxFindloginname(loginname);
        System.out.println(b);
       response.getWriter().print(b);
        return null;
    }
    public String ajaxFindEmail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email1 = request.getParameter("email");
        boolean b = userService.ajaxFindEmail(email1);
        response.getWriter().print(b);

        return null;
    }
    public String ajaxFindVerifycode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginname = request.getParameter("verficode");
        String  vCode = (String)request.getSession().getAttribute("vCode");
        if (vCode.equalsIgnoreCase(loginname)){
            response.getWriter().print("true");
        }
        return null;
    }

    public void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User formUser = CommonUtils.toBean(request.getParameterMap(),User.class);

    }
}

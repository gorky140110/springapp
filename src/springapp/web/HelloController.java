package springapp.web;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.Date;

// page controller
public class HelloController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        logger.info("Returning hello view");
//
//        return new ModelAndView("hello.jsp");
    	
        String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);
//        第一個引數為要呈現的目標網頁（或資源）路徑，第二個引數是設定用來取得Model物件的鍵（Key），而第三個引數為要給 View層呈現資料用的Model物件。
//        Ideally we would like to map to the view using a logical name
//        , allowing us to switch the view without having to change the controller.
//        return new ModelAndView("WEB-INF/jsp/hello.jsp", "now", now);
        return new ModelAndView("hello", "now", now);
    }

}
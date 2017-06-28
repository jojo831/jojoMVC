package org1.coding.demo.springmvc.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org1.coding.demo.springmvc.FACADE.Podcast2;
import org1.coding.demo.springmvc.Service.BoardURLService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mason on 2017/5/25.
 */
@Controller
@RequestMapping("/info")
public class testController {
    private static final Logger logger = LoggerFactory.getLogger(testController.class);
    /**
     * user路径下默认显示用户列表
     *
     * @return
     */
    @Autowired
    private BoardURLService boardURLService;

    //    @RequestMapping(method=RequestMethod.GET)
    @RequestMapping("showMsg")
    public ModelAndView index(HttpServletRequest request,
                              @RequestParam(required = false) String textfield1, @RequestParam(required = false) String textfield2,
                              @RequestParam(required = false) String textfield3, @RequestParam(required = false) String textfield4,
                              @RequestParam(required = false) String textfield5, @RequestParam(required = false) String textfield6,
                              @RequestParam(required = false) String token) {
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/api/";

        StringBuffer combineURL = new StringBuffer();
        combineURL.append(basePath).append(textfield1).append("/").append(textfield2).
                append("/").append(textfield3).append("/").append(textfield4).append("/").append(textfield5).append("/");
        logger.info(String.valueOf(combineURL));
        if (token == null || "".equals(token)) {
            boardURLService.saveBoardURL(String.valueOf(combineURL), textfield6);
            token = "has filled value";
        }

        List<Podcast2> list = boardURLService.getBoardURL();
        ModelMap model = new ModelMap();
        model.addAttribute("arrlist", list);
        model.addAttribute("token",token);
        return new ModelAndView("testcase", model);
    }

    @RequestMapping("showMsg1")
    public ModelAndView index1() {
        ModelMap model = new ModelMap();
        return new ModelAndView("testcase_edit", model);
    }
}

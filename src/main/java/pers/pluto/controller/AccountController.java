package pers.pluto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.pluto.domain.Account;
import pers.pluto.service.AccountService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有执行...");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }


    @RequestMapping("/save")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response){
        System.out.println("表现层：保存账户执行...");
        accountService.saveAccount(account);
        try {
            response.sendRedirect(request.getContextPath()+"findAll");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }
}

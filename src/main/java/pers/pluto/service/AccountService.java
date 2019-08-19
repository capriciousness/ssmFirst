package pers.pluto.service;

import pers.pluto.domain.Account;
import java.util.List;

/**
 * 账户service接口
 */
public interface AccountService {
    //查询所有
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);
}

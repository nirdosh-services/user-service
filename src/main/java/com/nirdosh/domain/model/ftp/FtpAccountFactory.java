package com.nirdosh.domain.model.ftp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FtpAccountFactory {
    public FtpAccountFactory() {
    }

    public List<FtpAccount> getFtpAccounts() {
        FtpAccount ftpAccount = new FtpAccount(AccountType.SUNDAY_SABHA, "user123", "123456");
        List<FtpAccount> ftpAccounts = new ArrayList<FtpAccount>();
        ftpAccounts.add(ftpAccount);
        return ftpAccounts;
    }
}
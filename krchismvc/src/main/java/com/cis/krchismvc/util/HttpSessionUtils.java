package com.cis.krchismvc.util;

import com.cis.krchismvc.repository.KrUser;

import javax.servlet.http.HttpSession;

public class HttpSessionUtils {
    public static final String USER_SESSION_KEY ="krchissessionuser";

    public static boolean isLoginKruser(HttpSession session)
    {
        Object sessionedUser = session.getAttribute(USER_SESSION_KEY);
        if (sessionedUser==null){
            return false;
        }
        return true;


    }

    public static KrUser getSessionedUser(HttpSession session){
        if (!isLoginKruser(session)){
            return null;
        }
        return (KrUser) session.getAttribute(USER_SESSION_KEY);
    }

}

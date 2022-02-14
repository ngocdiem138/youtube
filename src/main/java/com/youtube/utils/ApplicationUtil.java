package com.youtube.utils;

import javax.servlet.http.HttpServletRequest;

public class ApplicationUtil {

    private static ApplicationUtil applicationUtil = null;

    public static ApplicationUtil getInstance() {
        if (applicationUtil == null) {
            applicationUtil = new ApplicationUtil();
        }
        return applicationUtil;
    }

    public void putValue(HttpServletRequest req, String key, Object value) {
        req.getSession().getServletContext().setAttribute(key, value);
    }

    public Object getValue(HttpServletRequest req, String key) {
        return req.getSession().getServletContext().getAttribute(key);
    }

    public void removeValue(HttpServletRequest req, String key) {
        req.getSession().getServletContext().removeAttribute(key);
    }
}

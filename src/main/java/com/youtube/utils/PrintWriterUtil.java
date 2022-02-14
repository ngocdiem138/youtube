package com.youtube.utils;

import com.google.gson.Gson;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterUtil {

    private PrintWriter printWriter;

    public PrintWriterUtil() {
        printWriter = null;
    }

    public void getInstance(HttpServletResponse resp) throws IOException {
        printWriter = resp.getWriter();
    }

    public void println(Object value) {
        printWriter.println(new Gson().toJson(value));
        printWriter.flush();
    }

    public void printlnFalse() {
        printWriter.println(new Gson().toJson(false));
        printWriter.flush();
    }

    public void printlnTrue() {
        printWriter.println(new Gson().toJson(true));
        printWriter.flush();
    }
}

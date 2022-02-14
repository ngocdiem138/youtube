package com.youtube.services.impls;

import com.youtube.services.ICommonService;

import java.lang.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class CommonService implements ICommonService {

    @Override
    public String formatNumber(long number) {

        StringBuilder result = new StringBuilder();
        if (number > 1000000) {
            result.append(number / 1000000).append(" Tr");
        } else if (number > 1000) {
            result.append(number / 1000).append(" N");
        } else {
            result.append(number);
        }
        return result.toString();
    }

    @Override
    public String addFPoint(long number) {
        String src = String.valueOf(number);
        StringBuilder result = new StringBuilder();
        for (int i = src.length() - 1, j = 1; i >= 0; i--, j++) {
            if (j % 3 == 0) {
                result.append(src.charAt(i)).append(".");
            } else {
                result.append(src.charAt(i));
            }
        }
        result.reverse();
        if (result.charAt(0) == '.') {
            result.replace(0, 1, "");
        }
        return result.toString();
    }

    @Override
    public String formatTime(Timestamp timestamp) {
        long time = timestamp.getTime();
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time);
        return cal.get(Calendar.DATE) + " thg " + cal.get(Calendar.MONTH) + ", " + (cal.get(Calendar.YEAR));
    }

    @Override
    public String distanceTime(Timestamp timestamp) {
        Timestamp now = Timestamp.from(Instant.now());
        long getDiff = now.getTime() - timestamp.getTime();

        // using TimeUnit class from java.util.concurrent package
        long distanceSeconds = getDiff / 1000;

        StringBuilder result = new StringBuilder();

        if (distanceSeconds > 365 * 24 * 60 * 60) {
            result.append(distanceSeconds / (365 * 24 * 60 * 60)).append(" năm trước");
        } else if (distanceSeconds > 30 * 24 * 60 * 60) {
            result.append(distanceSeconds / (30 * 24 * 60 * 60)).append(" tháng trước");
        } else if (distanceSeconds > 7 * 24 * 60 * 60) {
            result.append(distanceSeconds / (7 * 24 * 60 * 60)).append(" tuần trước");
        } else if (distanceSeconds > 24 * 60 * 60) {
            result.append(distanceSeconds / (24 * 60 * 60)).append(" ngày trước");
        } else if (distanceSeconds > 60 * 60) {
            result.append(distanceSeconds / (60 * 60)).append(" giờ trước");
        } else if (distanceSeconds > 60) {
            result.append(distanceSeconds / 60).append(" phút trước");
        } else {
            result.append(distanceSeconds).append(" giây trước");
        }
        return result.toString();
    }

    @Override
    public String formatString(String src) {
        StringBuilder result = new StringBuilder(src);
        if (result.length() > 55) {
            result.replace(55, result.length(), "");
            result.append("...");
        }
        return result.toString();
    }

    @Override
    public List<String> formatXML(String content) {
        return Arrays.asList(content.split("\\n"));
    }
}

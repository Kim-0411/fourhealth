package com.fourhealth.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.fourhealth.dto.NoticePromotionTrainerDto;

import org.springframework.stereotype.Component;

@Component
public class TotalDate {

    public String utilTotalDate(String start, String end) throws ParseException {

        System.out.println("proInsert start-------------" + start);
        System.out.println("proInsert end-------------" + end);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date stDt = format.parse(start);
        java.util.Date edDt = format.parse(end);

        long diff = edDt.getTime() - stDt.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        String totalDate = Long.toString(diffDays);

        System.out.println(diffDays);

        return totalDate;

    }

}

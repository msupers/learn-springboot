package com.myself.springboot.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/v1/tvseries")
public class TvSeriesController {
    @GetMapping
    public List<TvSeriesDto> getAll() {
        List<TvSeriesDto> lists = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 6, 1, 0, 0, 0);
        lists.add(new TvSeriesDto(1, "西部世界", 1, calendar.getTime()));
        calendar.set(2006, 3, 22, 0, 0, 0);
        lists.add(new TvSeriesDto(2, "哈利波特", 1, calendar.getTime()));
        return lists;
    }
}

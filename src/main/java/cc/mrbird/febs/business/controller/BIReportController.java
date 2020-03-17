package cc.mrbird.febs.business.controller;


import cc.mrbird.febs.business.entity.Tlbegin;
import cc.mrbird.febs.business.entity.Tlye;
import cc.mrbird.febs.business.service.Impl.TlweekReportService;
import cc.mrbird.febs.common.controller.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("business")
public class BIReportController extends BaseController {

    @Autowired
    TlweekReportService tlweekReportService;

    @GetMapping("/tlxs")
    public String tlxs(@RequestParam(defaultValue = "") String begin,@RequestParam(defaultValue = "")String end){
        begin = "2016-03-01";
        end = "2016-03-31";
        List<Tlye> list = tlweekReportService.getU8TlYe(begin,end);
        List<Tlbegin> list1 = tlweekReportService.getLocalYe();
        return "hello world";
    }

}

package com.example.aopzhujie.service;

import com.example.aopzhujie.mapper.AppCoopReportMapper;
import com.example.aopzhujie.model.AppCoopReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Leo
 * @date 2021/2/1
 */
@Service("reportService")
public class ReportService {

    @Autowired
    private AppCoopReportMapper appCoopReportMapper;

    public void insert(){
        for (int i = 0;i<=100000;i++){
            AppCoopReport app = new AppCoopReport();
            app.setDimDateId("2021-02-01");

            appCoopReportMapper.insert(app);
        }

    }
}

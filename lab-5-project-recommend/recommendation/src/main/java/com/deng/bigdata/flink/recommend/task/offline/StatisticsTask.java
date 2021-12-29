package com.deng.bigdata.flink.recommend.task.offline;

import com.deng.bigdata.flink.recommend.datasource.HbaseTableSource;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.table.api.bridge.java.BatchTableEnvironment;

/**
 * 历史热门、近期热门、历史好评商品
 */
public class StatisticsTask {
    private static ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
    private static BatchTableEnvironment benv = BatchTableEnvironment.create(env);
    public static void main(String[] args) {
        //数据源
        env.createInput(new HbaseTableSource());
        //数据处理

        //数据输出
    }
}

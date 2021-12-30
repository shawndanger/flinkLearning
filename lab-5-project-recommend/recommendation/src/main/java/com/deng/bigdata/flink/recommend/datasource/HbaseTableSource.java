package com.deng.bigdata.flink.recommend.datasource;


import org.apache.flink.addons.hbase.TableInputFormat;
import org.apache.flink.api.java.tuple.Tuple4;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;

public class HbaseTableSource  extends TableInputFormat<Tuple4<String, String, Double, String>> {
    @Override
    protected Scan getScanner() {
        return null;
    }

    @Override
    protected String getTableName() {
        return null;
    }

    @Override
    protected Tuple4<String, String, Double, String> mapResultToTuple(Result result) {
        return null;
    }
}

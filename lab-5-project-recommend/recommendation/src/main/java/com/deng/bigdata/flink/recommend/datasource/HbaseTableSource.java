package com.deng.bigdata.flink.recommend.datasource;

import org.apache.flink.addons.hbase.TableInputFormat;
import org.apache.flink.api.java.tuple.Tuple4;

public class HbaseTableSource  extends TableInputFormat<Tuple4<String, String, Double, String>> {
}

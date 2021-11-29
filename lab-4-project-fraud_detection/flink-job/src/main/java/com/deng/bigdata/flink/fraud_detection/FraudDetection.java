package com.deng.bigdata.flink.fraud_detection;

import com.deng.bigdata.flink.fraud_detection.config.Config;
import org.apache.flink.api.java.utils.ParameterTool;

/**
 * Hello world!
 *
 */
public class FraudDetection
{

    public static void main(String[] args) throws Exception {
        ParameterTool tool = ParameterTool.fromArgs(args);
        Parameters inputParams = new Parameters(tool);
        Config config = new Config(inputParams, STRING_PARAMS, INT_PARAMS, BOOL_PARAMS);
        RulesEvaluator rulesEvaluator = new RulesEvaluator(config);
        rulesEvaluator.run();
    }
}

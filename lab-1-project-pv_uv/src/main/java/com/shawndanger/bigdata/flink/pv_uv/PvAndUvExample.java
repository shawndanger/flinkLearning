package com.shawndanger.bigdata.flink.pv_uv;

import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumerBase;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Properties;

public class PvAndUvExample {
    public static void main(String[] args) {
        final ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String kafkaTopic = parameterTool.get("kafka-topic","test");
        String brokers = parameterTool.get("brokers", "192.168.4.2:9092");
        System.out.printf("Reading from kafka topic %s @ %s\n", kafkaTopic, brokers);
        System.out.println();

        Properties kafkaProps = new Properties();
        kafkaProps.setProperty("bootstrap.servers", brokers);
        kafkaProps.setProperty("topic", kafkaTopic);
        kafkaProps.setProperty("brokers", brokers);
//        new FlinkKafkaConsumerBase<>()
        new FlinkKafkaConsumer<UserBehaviorEvent>("test",new UserBehaviorEventSchema(), kafkaProps);
//        KafkaConsumer<String, UserBehaviorEvent> kafka = new KafkaConsumer<>(kafkaProps);
    }
}

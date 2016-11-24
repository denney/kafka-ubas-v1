package cn.jikexueyuan.kafka.ubas.cli;

import cn.jikexueyuan.kafka.ubas.conf.KafkaConfigureAPI.KafkaConf;
import cn.jikexueyuan.kafka.ubas.conf.KafkaConfigureAPI.KafkaParam;
import kafka.admin.TopicCommand;

/**
 * @Date Aug 5, 2015
 *
 * @Author dengjie
 *
 * @Note Test kafka cluster info
 */
public class TestKafkaCli {

	public static void main(String[] args) {
		// list();
		// delete("ubas");
		// create("kafka-ubas", 3, 1);
	}

	/**
	 * List current kafka topic info
	 */
	public static void list() {
		String[] opts = new String[] { KafkaConf.LIST, KafkaConf.ZK, KafkaParam.ZK_HOSTS };
		TopicCommand.main(opts);
	}

	/**
	 * Create topic to kafka
	 * 
	 * @param topic
	 * @param replication
	 * @param partition
	 */
	public static void create(String topic, int replication, int partition) {
		String[] opts = new String[] { KafkaConf.CREATE, KafkaConf.ZK, KafkaParam.ZK_HOSTS, KafkaConf.TOPIC, topic,
				KafkaConf.REPLICATION, replication + "", KafkaConf.PARTITIONS, partition + "" };
		TopicCommand.main(opts);
	}

	/**
	 * Delete topic from kafka
	 * 
	 * @param topic
	 */
	public static void delete(String topic) {
		String[] opts = new String[] { KafkaConf.DELETE, KafkaConf.ZK, KafkaParam.ZK_HOSTS, KafkaConf.TOPIC, topic };
		TopicCommand.main(opts);
	}

}

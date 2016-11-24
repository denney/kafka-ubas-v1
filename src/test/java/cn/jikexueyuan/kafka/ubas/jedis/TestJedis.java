package cn.jikexueyuan.kafka.ubas.jedis;

import redis.clients.jedis.Jedis;
import cn.jikexueyuan.kafka.ubas.util.JedisFactory;

/**
 * @Date Aug 6, 2015
 *
 * @Author dengjie
 *
 * @Note TODO
 */
public class TestJedis {

	public static void main(String[] args) {
		Jedis jedis = JedisFactory.getJedisInstance("real-time");
//		jedis.set("20150805" + "_" + "jedis", "1");
		jedis.flushAll();
	}

}

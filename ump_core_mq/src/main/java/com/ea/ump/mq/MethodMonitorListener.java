package com.ea.ump.mq;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by xuliangxiao on 2018/3/6 14:41
 */
@Component
public class MethodMonitorListener {
    private final static Logger logger = LoggerFactory.getLogger(MethodMonitorListener.class);

    /**
     * 接收方法监控消息
     * @param data
     */
    public void methodMonitor( JSONObject data ){
        logger.info("methodMonitor,接收数据:{}", data);

    }

}

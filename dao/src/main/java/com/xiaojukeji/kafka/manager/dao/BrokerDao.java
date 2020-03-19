package com.xiaojukeji.kafka.manager.dao;

import com.xiaojukeji.kafka.manager.common.entity.po.BrokerDO;

import java.util.List;

/**
 * @author zengqiao
 * @date 19/4/21
 */
public interface BrokerDao {
    int replace(BrokerDO brokerInfoDO);

    int deleteById(Long clusterId, Integer brokerId);

    List<BrokerDO> getDead(Long clusterId);
}

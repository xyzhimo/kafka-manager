package com.xiaojukeji.kafka.manager.dao;

import com.xiaojukeji.kafka.manager.common.entity.po.ControllerDO;

import java.util.List;

public interface ControllerDao {
    int insert(ControllerDO controllerDO);

    List<ControllerDO> getByClusterId(Long clusterId);
}
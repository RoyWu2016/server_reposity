package com.roy.server.seckill.dao;

import org.apache.ibatis.annotations.Param;

import com.roy.publics.seckill.bean.SuccessKilled;

/**
 * <p>User: yeyaohui
 * <p>Date: Jun 20, 2016
 * <p>Version: 1.0
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     * @param secKillId
     * @param userPhone
     * @return插入的行数
     */
    int insertSuccessKilled(@Param("secKillId") long secKillId,@Param("userPhone") long userPhone);

    /**
     *根据ID和用户手机号码查询SuccessKilled并携带秒杀产品对象实体
     * @param secKillId ID
     * @param userPhone 用户手机号码
     * @return
     */
    SuccessKilled queryByIdWithSecKill(@Param("secKillId") long secKillId,@Param("userPhone") long userPhone);
}



package com.scoprion.mall.littlesoft.mapper;

import com.github.pagehelper.Page;
import com.scoprion.mall.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author by admin1
 * @created on 2017/11/2.
 */
@Mapper
public interface OrderWxMapper {

    /**
     * 查询我的订单列表
     *
     * @param userId
     * @param status
     * @return
     */
    Page<Order> getOrderList(@Param("userId") Long userId, @Param("status") String status);

    /**
     * 新增订单
     *
     * @param order
     * @return
     */
    int add(Order order);

    /**
     * 修改订单微信返回的预付款订单号
     *
     * @param orderId
     * @param wxOrderNo
     * @return
     */
    int updateOrderForWxOrderNo(@Param("orderId") Long orderId, @Param("wxOrderNo") String wxOrderNo);


    /**
     * 根据openid 订单号 查询预付款单号
     *
     * @param openid
     * @param orderId
     * @return
     */
    String findPrepayIdByOpenid(@Param("openid") String openid, @Param("orderId") Long orderId);

    /**
     * 根据wxOrderNo修改订单状态 以及付款状态
     *
     * @param wxOrderNo
     * @return
     */
    int updateOrderStatusAndPayStatus(String payDate, String wxOrderNo);

    /**
     * 根据微信单号查询订单信息
     *
     * @param wxOrderNo
     * @return
     */
    Order findByWxOrderNo(@Param("wxOrderNo") String wxOrderNo);


}

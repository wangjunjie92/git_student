package wjj.alibaba.cloud.order.server.domain.dto;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: wangjunjie 2019/7/29 11:28
 * @Description:
 * @Version: 1.0.0
 * @Modified By: xxx 2019/7/29 11:28
 */

@Slf4j
public class IdOrderSegment {

    private final int step=1000;

    private String bizTg;

    private long idServerId;

    private AtomicInteger orderId;

    private int middleId;

    public IdOrderSegment(String bizTg, long idServerId) {
        this.bizTg = bizTg;
        this.idServerId = idServerId;
        this.orderId = new AtomicInteger(0);
        this.middleId = this.step/2;
    }

    public int getStep() {
        return step;
    }

    public String getBizTg() {
        return bizTg;
    }

    public long getIdServerId() {
        return idServerId;
    }

    public AtomicInteger getOrderId() {
        return orderId;
    }

    public int getMiddleId() {
        return middleId;
    }
}

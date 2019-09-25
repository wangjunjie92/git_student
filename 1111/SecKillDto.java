package wjj.alibaba.cloud.order.server.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangjunjie 2019/9/23 17:18
 * @Description:
 * @Version: 1.0.0
 * @Modified By: xxx 2019/9/23 17:18
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class SecKillDto {

    private String killId;

    private String pspId;

    private long starTime;

    private long endTime;

    private int totalCount;

    private int count;

    private boolean finishFlag;




}

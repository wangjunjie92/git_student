package wjj.alibaba.user.order.domain.dto;

import lombok.Data;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wangjunjie 2019/8/17 11:43
 * @Description: jwt 包含用户信息
 * @Version: 1.0.0
 * @Modified By: xxx 2019/8/17 11:43
 */
@Data
public class JwtUserInfoDto {

    private String uid;

    private String deviceId;

    private String deviceType;

    private int version;

    private String role;

    private int userStatus;


    public Map<String,Object> getJwtUserInfoMap() {
        Map<String, Object> map = new HashMap<>(5);
        map.put("uid",uid);
        map.put("deviceId",deviceId);
        map.put("deviceType",deviceType);
        map.put("userStatus",userStatus);
        map.put("role",role);
        map.put("version",version);
        return map;
    }
}

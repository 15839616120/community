package life.majiang.community.dto;

import lombok.Data;

/**
 * Data Transfer Object (dto)
 * 经验：一般多于两个字段的入参，需要考虑新建一个实体
 */
@Data
public class AccessTokenDTO {

    private String clientId;
    private String clientSecret;
    private String code;
    private String redirectUri;
    private String state;
}

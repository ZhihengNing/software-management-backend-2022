package com.campus.love.common.feign.module.user;

import com.campus.love.common.core.api.MessageModel;
import com.campus.love.common.feign.domain.FeignConstant;
import com.campus.love.common.feign.module.user.dto.SubscribedUserDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("flipped-user")
public interface UserFeignClient {

    @ApiOperation("获取关注着的信息")
    @GetMapping(FeignConstant.FEIGN_INSIDE_URL_PREFIX+"/subscribed")
    MessageModel<List<SubscribedUserDto>> querySubscribedInfo(Integer userId);


}
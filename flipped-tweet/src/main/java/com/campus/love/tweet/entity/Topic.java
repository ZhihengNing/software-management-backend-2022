package com.campus.love.tweet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.campus.love.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * 
 * @TableName topic
 */
@TableName(value ="topic")
@Data
public class Topic extends BaseEntity {
    /**
     * 话题id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String heading;

    /**
     * 参与人数
     */
    private String participants;

    /**
     * 动态数
     */
    private Integer tweetNum;

    /**
     * 话题介绍
     */
    private String introduction;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
package com.campus.love.message.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.campus.love.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * 
 * @TableName chat_record
 */
@TableName(value ="chat_record")
@Data
public class ChatRecord extends BaseEntity {
    /**
     * 聊天记录Id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 发送者Id
     */
    private Integer sendUserId;

    /**
     * 接收者Id
     */
    private Integer receiveUserId;

    /**
     * 聊天内容
     */
    private String content;

    /**
     * 0-未读，1-已读
     */
    private Integer isRead;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
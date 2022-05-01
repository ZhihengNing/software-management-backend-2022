package com.campus.love.message.component;

import com.campus.love.common.mq.component.notice.IMessageConsumer;
import com.campus.love.common.mq.constant.UserConstant;
import com.campus.love.common.mq.domain.dto.NoticeDto;
import com.campus.love.message.service.NoticeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SubscribedConsumer implements IMessageConsumer {
    private final NoticeService noticeService;

    public SubscribedConsumer(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name = UserConstant.USER_EXCHANGE),
            value = @Queue(name = UserConstant.SUBSCRIBED_QUEUE),
            key = UserConstant.SUBSCRIBED_KEY
    ))
    @Override
    public void consumeMsg(NoticeDto message) {
        log.info("消费者接收到来自{},{}", UserConstant.SUBSCRIBED_QUEUE, message.toString());
        noticeService.insertNotice(message);
    }
}
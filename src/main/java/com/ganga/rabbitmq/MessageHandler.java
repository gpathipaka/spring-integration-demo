package com.ganga.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

public class MessageHandler implements MessageListener {

	@Autowired
    private MessageChannel oddNumbersChannel;
	
	@Autowired
    private MessageChannel evenNumbersChannel;
	int count = 0;
	
	@Override
	public void onMessage(Message message) {
		System.out.println("Received message: " + message);
		String msg = new String(message.getBody());
      //  System.out.println("Text: " +msg);
		if(++count%2 == 0) {
			oddNumbersChannel.send( MessageBuilder.withPayload( msg ).build() );
		} else {
			evenNumbersChannel.send( MessageBuilder.withPayload( msg ).build() );
		}
	}

}

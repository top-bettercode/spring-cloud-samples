/*
 * Copyright 2013-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cloud.integrated.praise.consumer.listener;

import com.alibaba.cloud.integrated.praise.consumer.database.item.ItemIntegService;
import com.alibaba.cloud.integrated.praise.consumer.message.PraiseMessage;
import com.alibaba.cloud.integrated.praise.consumer.message.PraiseSink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @author TrevorLink
 */
@Component
public class PraiseConsumer {

	@Autowired
	private ItemIntegService praiseService;

	@StreamListener(PraiseSink.PRAISE_INPUT)
	public void onMessage(@Payload PraiseMessage message) {
		praiseService.praiseItem(message.getItemId());
	}

}
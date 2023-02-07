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

package com.alibaba.cloud.integrated.order.feign;

import com.alibaba.cloud.integrated.order.feign.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import top.bettercode.summer.web.RespEntity;

/**
 * @author TrevorLink
 */
@FeignClient(name = "integrated-account")
public interface AccountServiceFeignClient {

  @PostMapping("/account/reduce-balance")
  RespEntity<?> reduceBalance(@RequestBody AccountDTO accountReduceBalanceDTO);

}

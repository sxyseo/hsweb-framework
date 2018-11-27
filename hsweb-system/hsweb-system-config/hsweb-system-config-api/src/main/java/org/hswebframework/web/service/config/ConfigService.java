/*
 *
 *  * Copyright 2016 http://www.hswebframework.org
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.hswebframework.web.service.config;

import org.hswebframework.web.entity.config.ConfigEntity;
import org.hswebframework.web.service.CrudService;

/**
 * @author zhouhao
 */
public interface ConfigService extends CrudService<ConfigEntity, String> {
    Number getNumber(String configId, String key, Number defaultValue);

    String getString(String configId, String key, String defaultValue);

    boolean getBoolean(String configId, String key, boolean defaultValue);

}

/**
 *  Copyright 2013 SmartBear Software, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.smartbear.swagger4j;

import java.util.Collection;
import java.util.List;

/**
 * Holds a Swagger API defined in an API Declaration - see <a href="https://github.com/wordnik/swagger-core/wiki/API-Declaration"
 * target="_new">https://github.com/wordnik/swagger-core/wiki/API-Declaration</a>
 */

public interface Api {

    public String getPath();

    public void setPath(String path);

    public String getDescription();

    public void setDescription(String description);

    public Operation getOperation( String nickName );

    public List<Operation> getOperations();

    public void removeOperation(Operation operation);

    public Operation addOperation(String nickName, Operation.Method method);

    public ApiDeclaration getApiDeclaration();
}

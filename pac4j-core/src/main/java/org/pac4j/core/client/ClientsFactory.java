/*
  Copyright 2012 - 2015 pac4j organization

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.pac4j.core.client;

/**
 * A factory to build clients.
 *
 * @author Jerome Leleu
 * @since 1.7.0
 *
 */
public interface ClientsFactory {

    /**
     * Build clients from env.
     *
     * @param env some current initialization environment.
     * @return the clients.
     */
    Clients build(Object env);
}

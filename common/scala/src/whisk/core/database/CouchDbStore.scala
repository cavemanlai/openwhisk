/*
 * Copyright 2015-2016 IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package whisk.core.database

import org.lightcouch.{ View => CouchView }

object CouchDbStore {
  def make[R,D](host: String, port: Int, dbUsername: String, dbPassword: String, dbName: String)(implicit ev: D <:< DocumentSerializer) = {
      new CouchDbLikeStore[CouchView,R,D](CouchDbProvider, host, port, dbUsername, dbPassword, dbName)
  }
}

/*
 *
 *  Copyright(c) 2018 VerstSiu
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.ijoic.archittest.base.util

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Transformations

/**
 * Live data extension.
 *
 * @author verstsiu@126.com on 2018/4/18.
 * @version 1.0
 */

/**
 * Map live data.
 *
 * @param func map function: fun(X?): Y?.
 *
 * @see Transformations.map
 */
fun<X, Y> LiveData<X>.map(func: (X?) -> Y?): LiveData<Y> = Transformations.map(this, func)
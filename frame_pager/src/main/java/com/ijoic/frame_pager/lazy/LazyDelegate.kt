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
package com.ijoic.frame_pager.lazy

/**
 * lazy delegate.
 *
 * @author verstsiu@126.com on 2018/4/20.
 * @version 1.0
 */
interface LazyDelegate {
  /**
   * Callback simple
   *
   * @since 1.1.2
   */
  interface CallbackSimple {
    /**
     * Lazy resume.
     */
    fun onLazyResume() {}

    /**
     * Lazy pause.
     */
    fun onLazyPause() {}
  }

  /**
   * Lazy callback.
   */
  interface Callback : CallbackSimple {
    /**
     * Returns user visible status.
     */
    fun getUserVisibleHint(): Boolean

    /**
     * Returns resume status.
     */
    fun isResumed(): Boolean
  }

  /**
   * Attach lazy [callback]
   */
  fun attachLazy(callback: Callback)

  /**
   * Resume.
   */
  fun onResume()

  /**
   * Pause.
   */
  fun onPause()

  /**
   * Set user visible hint.
   *
   * @param isVisibleToUser visible status.
   */
  fun setUserVisibleHint(isVisibleToUser: Boolean)

}
/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.utils

fun Throwable.sanitizeStackTrace(className: String, methodName: String, additionalOffset: Int = 0) {
    val stackTrace = this.stackTrace
    var firstUsage = -1
    for (i in stackTrace.indices) {
        val trace = stackTrace[i]
        if (trace.className == className && trace.methodName == methodName) {
            firstUsage = i
            break
        }
    }
    if (firstUsage == -1) return
    val offset = maxOf(0, firstUsage + additionalOffset)
    if (offset == 0) return
    this.stackTrace = stackTrace.copyOfRange(0, offset)
}

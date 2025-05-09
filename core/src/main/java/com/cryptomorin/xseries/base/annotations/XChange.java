/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2025 Crypto Morin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.cryptomorin.xseries.base.annotations;

import org.jetbrains.annotations.ApiStatus;

import java.lang.annotation.*;

/**
 * Regex used:
 * * Search: {@code \s+/\*\*\s+\* (?<from>\w+) -> (?<to>\w+) \((?<version>[\w\.]+)\)\s+\*\/}
 * * Replace: {@code \n\n@XChange(version = "$3", from = "$1", to = "$2")}
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
@Repeatable(XChanges.class)
@Documented
@ApiStatus.Internal
public @interface XChange {
    /**
     * In what version of Minecraft (SemVer format) did this change occur?
     */
    String version();

    /**
     * The previous name of this element.
     */
    String from();

    /**
     * The new name of this element.
     */
    String to();
}

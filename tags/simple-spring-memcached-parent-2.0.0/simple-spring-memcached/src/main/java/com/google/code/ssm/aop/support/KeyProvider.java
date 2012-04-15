/*
 * Copyright (c) 2008-2009 Nelson Carpentier
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 */

package com.google.code.ssm.aop.support;

/**
 * 
 * @author Nelson Carpentier
 * @author Jakub Białek
 * 
 */
public interface KeyProvider {

    /**
     * From the supplied object, create a (no-whitespace) part of the key by which a value will be stored in Memcached.
     * (Hint: This value, plus the Namespace value, plus optional other key should be no longer than 250 characters.)
     * 
     * @param keyObject
     * @return
     */
    String generateKey(final Object keyObject);

    /**
     * This is the multi-plexed version of <code>generateKey(...)</code>
     * 
     * @param keyObjects
     * @return
     */
    String[] generateKeys(final Object[] keyObjects);

}

/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

/*
 * @(#)AuthContext.java	1.13 07/04/27
 *
 *  (C) Copyright IBM Corp. 1999 All Rights Reserved.
 *  Copyright 1997 The Open Group Research Institute.  All rights reserved.
 */

package sun.security.krb5.internal;

import sun.security.krb5.EncryptionKey;
import java.util.BitSet;

public class AuthContext {
    public HostAddress remoteAddress;
    public int remotePort;
    public HostAddress localAddress;
    public int localPort;
    public EncryptionKey keyBlock;
    public EncryptionKey localSubkey;
    public EncryptionKey remoteSubkey;
    public BitSet authContextFlags;
    public int remoteSeqNumber;
    public int localSeqNumber;
    public Authenticator authenticator;
    public int reqCksumType;
    public int safeCksumType;
    public byte[] initializationVector;
    //public ReplayCache replayCache;
};

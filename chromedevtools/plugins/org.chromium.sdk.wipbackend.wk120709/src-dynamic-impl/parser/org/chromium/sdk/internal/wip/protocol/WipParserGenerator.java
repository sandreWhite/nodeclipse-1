// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.wip.protocol;

import org.chromium.sdk.internal.protocolparser.dynamicimpl.ParserGeneratorBase;

/**
 * A main class that generates WIP static parser implementation.
 */
public class WipParserGenerator extends ParserGeneratorBase {
  public static void main(String[] args) {
    mainImpl(args, createConfiguration());
  }

  public static GenerateConfiguration createConfiguration() {
    return new GenerateConfiguration("org.chromium.sdk.internal.wip.protocol",
        "GeneratedWipProtocolParser", WipDynamicParser.create());
  }
}

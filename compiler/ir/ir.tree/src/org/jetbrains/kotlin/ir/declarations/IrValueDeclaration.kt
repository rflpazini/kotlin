/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.declarations

import org.jetbrains.kotlin.descriptors.ValueDescriptor
import org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
import org.jetbrains.kotlin.ir.symbols.IrValueSymbol
import org.jetbrains.kotlin.ir.types.IrType

interface IrValueDeclaration : IrDeclarationWithName, IrSymbolOwner {
    @ObsoleteDescriptorBasedAPI
    override val descriptor: ValueDescriptor

    @ObsoleteDescriptorBasedAPI
    override val initialDescriptor: ValueDescriptor

    override val symbol: IrValueSymbol
    val type: IrType
}
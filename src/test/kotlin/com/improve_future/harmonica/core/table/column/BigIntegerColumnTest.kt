/*
 * Harmonica: Kotlin Database Migration Tool
 * Copyright (C) 2020  Kenji Otsuka
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.improve_future.harmonica.core.table.column

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BigIntegerColumnTest {
    @Test
    fun testInstanceVariable() {
        val bigIntegerColumn = BigIntegerColumn("name")
        assertEquals("name", bigIntegerColumn.name)
        assertEquals(false, bigIntegerColumn.hasDefault)
        bigIntegerColumn.default = 1L
        assertEquals(true, bigIntegerColumn.hasDefault)
        assertEquals("1", bigIntegerColumn.sqlDefault)
    }
}
// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Printer: ImageVector
  get() {
    val current = _printer
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Printer",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 9 h-3 V3 H7 v6 H4 a2 2 0 0 0 -2 2 v10 a2 2 0 0 0 2 2 h3 v6 h18 v-6 h3 a2 2 0 0 0 2 -2 V11 a2 2 0 0 0 -2 -2 M9 5 h14 v4 H9Z m14 22 H9 V17 h14Z m5 -6 h-3 v-6 H7 v6 H4 V11 h24Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 9
          moveTo(x = 28.0f, y = 9.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // M 9 5
          moveTo(x = 9.0f, y = 5.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 9z
          horizontalLineTo(x = 9.0f)
          close()
          // m 14 22
          moveToRelative(dx = 14.0f, dy = 22.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // V 17
          verticalLineTo(y = 17.0f)
          // h 14z
          horizontalLineToRelative(dx = 14.0f)
          close()
          // m 5 -6
          moveToRelative(dx = 5.0f, dy = -6.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h 24z
          horizontalLineToRelative(dx = 24.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
        horizontalLineToRelative(dx = 32.0f)
        // v 32
        verticalLineToRelative(dy = 32.0f)
        // h -32z
        horizontalLineToRelative(dx = -32.0f)
        close()
      }
    }.build()
      .also { _printer = it }
  }

@Suppress("ObjectPropertyName")
private var _printer: ImageVector? = null

// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FunctionMath: ImageVector
  get() {
    val current = _functionMath
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FunctionMath",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="26.0 18.0 24.0 18.0 22.0 21.897 20.0 18.0 18.0 18.0 20.905 23.0 18.0 28.0 20.0 28.0 22.0 24.201 24.0 28.0 26.0 28.0 23.098 23.0 26.0 18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 18
          moveTo(x = 26.0f, y = 18.0f)
          // L 24 18
          lineTo(x = 24.0f, y = 18.0f)
          // L 22 21.897
          lineTo(x = 22.0f, y = 21.897f)
          // L 20 18
          lineTo(x = 20.0f, y = 18.0f)
          // L 18 18
          lineTo(x = 18.0f, y = 18.0f)
          // L 20.905 23
          lineTo(x = 20.905f, y = 23.0f)
          // L 18 28
          lineTo(x = 18.0f, y = 28.0f)
          // L 20 28
          lineTo(x = 20.0f, y = 28.0f)
          // L 22 24.201
          lineTo(x = 22.0f, y = 24.201f)
          // L 24 28
          lineTo(x = 24.0f, y = 28.0f)
          // L 26 28
          lineTo(x = 26.0f, y = 28.0f)
          // L 23.098 23
          lineTo(x = 23.098f, y = 23.0f)
          // L 26 18z
          lineTo(x = 26.0f, y = 18.0f)
          close()
        }
        // M19 6 V4 h-5.09 a2 2 0 0 0 -1.99 1.82 L11.27 13 H7 v2 h4.09 l-1 11 H5 v2 h5.09 a2 2 0 0 0 1.99 -1.82 L13.1 15 H18 v-2 h-4.72 l.63 -7Z
        path(
          fill = SolidColor(Color(0xFF1C1C1C)),
        ) {
          // M 19 6
          moveTo(x = 19.0f, y = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h -5.09
          horizontalLineToRelative(dx = -5.09f)
          // a 2 2 0 0 0 -1.99 1.82
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.99f,
            dy1 = 1.82f,
          )
          // L 11.27 13
          lineTo(x = 11.27f, y = 13.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4.09
          horizontalLineToRelative(dx = 4.09f)
          // l -1 11
          lineToRelative(dx = -1.0f, dy = 11.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5.09
          horizontalLineToRelative(dx = 5.09f)
          // a 2 2 0 0 0 1.99 -1.82
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.99f,
            dy1 = -1.82f,
          )
          // L 13.1 15
          lineTo(x = 13.1f, y = 15.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4.72
          horizontalLineToRelative(dx = -4.72f)
          // l 0.63 -7z
          lineToRelative(dx = 0.63f, dy = -7.0f)
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
      .also { _functionMath = it }
  }

@Suppress("ObjectPropertyName")
private var _functionMath: ImageVector? = null

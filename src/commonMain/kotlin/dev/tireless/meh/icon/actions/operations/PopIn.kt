// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PopIn: ImageVector
  get() {
    val current = _popIn
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PopIn",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 28 H6 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h8 v2 H6 v20 h20 v-8.03 h2 V26 a2 2 0 0 1 -2 2 m2 -14 v-2 l-6.59 -.03 L30 3.4 l-1.41 -1.42 L20 10.56 V4 h-2 v10 l10 -.03z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 28
          moveTo(x = 26.0f, y = 28.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v -8.03
          verticalLineToRelative(dy = -8.03f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 26
          verticalLineTo(y = 26.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m 2 -14
          moveToRelative(dx = 2.0f, dy = -14.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // l -6.59 -0.03
          lineToRelative(dx = -6.59f, dy = -0.03f)
          // L 30 3.4
          lineTo(x = 30.0f, y = 3.4f)
          // l -1.41 -1.42
          lineToRelative(dx = -1.41f, dy = -1.42f)
          // L 20 10.56
          lineTo(x = 20.0f, y = 10.56f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // l 10 -0.03z
          lineToRelative(dx = 10.0f, dy = -0.03f)
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
      .also { _popIn = it }
  }

@Suppress("ObjectPropertyName")
private var _popIn: ImageVector? = null

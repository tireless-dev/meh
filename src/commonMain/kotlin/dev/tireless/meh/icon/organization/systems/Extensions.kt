// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Extensions: ImageVector
  get() {
    val current = _extensions
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Extensions",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m30.87 10.16 -5 -8.66 a1 1 0 0 0 -1.37 -.37 L17 5.46 V4 a1 1 0 0 0 -1 -1 H4 a1 1 0 0 0 -1 1 v24 a1 1 0 0 0 1 1 h24 a1 1 0 0 0 1 -1 V16 a1 1 0 0 0 -1 -1 h-3.52 l6.02 -3.47 a1 1 0 0 0 .37 -1.37 M5 5 h10 v10 H5z m0 12 h10 v10 H5z m22 10 H17 V17 h10z M17 15 v-4.86 L19.8 15z m4.7 -.7 -4 -6.93 6.93 -4 4 6.92z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30.87 10.16
          moveTo(x = 30.87f, y = 10.16f)
          // l -5 -8.66
          lineToRelative(dx = -5.0f, dy = -8.66f)
          // a 1 1 0 0 0 -1.37 -0.37
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.37f,
            dy1 = -0.37f,
          )
          // L 17 5.46
          lineTo(x = 17.0f, y = 5.46f)
          // V 4
          verticalLineTo(y = 4.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -3.52
          horizontalLineToRelative(dx = -3.52f)
          // l 6.02 -3.47
          lineToRelative(dx = 6.02f, dy = -3.47f)
          // a 1 1 0 0 0 0.37 -1.37
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.37f,
            dy1 = -1.37f,
          )
          // M 5 5
          moveTo(x = 5.0f, y = 5.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // H 5z
          horizontalLineTo(x = 5.0f)
          close()
          // m 0 12
          moveToRelative(dx = 0.0f, dy = 12.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // H 5z
          horizontalLineTo(x = 5.0f)
          close()
          // m 22 10
          moveToRelative(dx = 22.0f, dy = 10.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // V 17
          verticalLineTo(y = 17.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
          // M 17 15
          moveTo(x = 17.0f, y = 15.0f)
          // v -4.86
          verticalLineToRelative(dy = -4.86f)
          // L 19.8 15z
          lineTo(x = 19.8f, y = 15.0f)
          close()
          // m 4.7 -0.7
          moveToRelative(dx = 4.7f, dy = -0.7f)
          // l -4 -6.93
          lineToRelative(dx = -4.0f, dy = -6.93f)
          // l 6.93 -4
          lineToRelative(dx = 6.93f, dy = -4.0f)
          // l 4 6.92z
          lineToRelative(dx = 4.0f, dy = 6.92f)
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
      .also { _extensions = it }
  }

@Suppress("ObjectPropertyName")
private var _extensions: ImageVector? = null

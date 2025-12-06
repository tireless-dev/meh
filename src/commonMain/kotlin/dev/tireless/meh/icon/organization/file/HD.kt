// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HD: ImageVector
  get() {
    val current = _hD
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HD",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 6 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 M4 24 V8 h24 v16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 6
          moveTo(x = 28.0f, y = 6.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // V 8
          verticalLineTo(y = 8.0f)
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
          // M 4 24
          moveTo(x = 4.0f, y = 24.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 16z
          verticalLineToRelative(dy = 16.0f)
          close()
        }
        // M22 11 h-4 v10 h4 a3 3 0 0 0 3 -3 v-4 a3 3 0 0 0 -3 -3 m1 7 a1 1 0 0 1 -1 1 h-2 v-6 h2 a1 1 0 0 1 1 1Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 11
          moveTo(x = 22.0f, y = 11.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 3 3 0 0 0 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // m 1 7
          moveToRelative(dx = 1.0f, dy = 7.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 1 1 0 0 1 1 1z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          close()
        }
        // <polygon points="13.0 11.0 13.0 15.0 10.0 15.0 10.0 11.0 8.0 11.0 8.0 21.0 10.0 21.0 10.0 17.0 13.0 17.0 13.0 21.0 15.0 21.0 15.0 11.0 13.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 11
          moveTo(x = 13.0f, y = 11.0f)
          // L 13 15
          lineTo(x = 13.0f, y = 15.0f)
          // L 10 15
          lineTo(x = 10.0f, y = 15.0f)
          // L 10 11
          lineTo(x = 10.0f, y = 11.0f)
          // L 8 11
          lineTo(x = 8.0f, y = 11.0f)
          // L 8 21
          lineTo(x = 8.0f, y = 21.0f)
          // L 10 21
          lineTo(x = 10.0f, y = 21.0f)
          // L 10 17
          lineTo(x = 10.0f, y = 17.0f)
          // L 13 17
          lineTo(x = 13.0f, y = 17.0f)
          // L 13 21
          lineTo(x = 13.0f, y = 21.0f)
          // L 15 21
          lineTo(x = 15.0f, y = 21.0f)
          // L 15 11
          lineTo(x = 15.0f, y = 11.0f)
          // L 13 11z
          lineTo(x = 13.0f, y = 11.0f)
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
      .also { _hD = it }
  }

@Suppress("ObjectPropertyName")
private var _hD: ImageVector? = null

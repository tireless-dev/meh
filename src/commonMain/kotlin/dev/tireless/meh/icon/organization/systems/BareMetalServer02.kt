// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BareMetalServer02: ImageVector
  get() {
    val current = _bareMetalServer02
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BareMetalServer02",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="17.0 28.0 17.0 22.0 15.0 22.0 15.0 28.0 5.0 28.0 5.0 30.0 27.0 30.0 27.0 28.0 17.0 28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 28
          moveTo(x = 17.0f, y = 28.0f)
          // L 17 22
          lineTo(x = 17.0f, y = 22.0f)
          // L 15 22
          lineTo(x = 15.0f, y = 22.0f)
          // L 15 28
          lineTo(x = 15.0f, y = 28.0f)
          // L 5 28
          lineTo(x = 5.0f, y = 28.0f)
          // L 5 30
          lineTo(x = 5.0f, y = 30.0f)
          // L 27 30
          lineTo(x = 27.0f, y = 30.0f)
          // L 27 28
          lineTo(x = 27.0f, y = 28.0f)
          // L 17 28z
          lineTo(x = 17.0f, y = 28.0f)
          close()
        }
        // <circle cx="9.0" cy="16.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 16
          moveTo(x = 9.0f, y = 16.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M26 20 H6 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 M6 14 v4 h20 v-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 20
          moveTo(x = 26.0f, y = 20.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // M 6 14
          moveTo(x = 6.0f, y = 14.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
        }
        // <circle cx="9.0" cy="6.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 6
          moveTo(x = 9.0f, y = 6.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M26 10 H6 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 M6 4 v4 h20 V4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 10
          moveTo(x = 26.0f, y = 10.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // M 6 4
          moveTo(x = 6.0f, y = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
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
      .also { _bareMetalServer02 = it }
  }

@Suppress("ObjectPropertyName")
private var _bareMetalServer02: ImageVector? = null

// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InstanceClassic: ImageVector
  get() {
    val current = _instanceClassic
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.InstanceClassic",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23.5 21 H23 v-2 h.5 a4.5 4.5 0 0 0 .36 -8.98 l-.82 -.06 -.1 -.82 a7 7 0 0 0 -13.88 0 l-.1 .82 -.82 .06 A4.5 4.5 0 0 0 8.5 19 H9 v2 H8.5 A6.5 6.5 0 0 1 7.2 8.14 a9 9 0 0 1 17.6 0 A6.5 6.5 0 0 1 23.5 21
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.5 21
          moveTo(x = 23.5f, y = 21.0f)
          // H 23
          horizontalLineTo(x = 23.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // a 4.5 4.5 0 0 0 0.36 -8.98
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.36f,
            dy1 = -8.98f,
          )
          // l -0.82 -0.06
          lineToRelative(dx = -0.82f, dy = -0.06f)
          // l -0.1 -0.82
          lineToRelative(dx = -0.1f, dy = -0.82f)
          // a 7 7 0 0 0 -13.88 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -13.88f,
            dy1 = 0.0f,
          )
          // l -0.1 0.82
          lineToRelative(dx = -0.1f, dy = 0.82f)
          // l -0.82 0.06
          lineToRelative(dx = -0.82f, dy = 0.06f)
          // A 4.5 4.5 0 0 0 8.5 19
          arcTo(
            horizontalEllipseRadius = 4.5f,
            verticalEllipseRadius = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.5f,
            y1 = 19.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 8.5
          horizontalLineTo(x = 8.5f)
          // A 6.5 6.5 0 0 1 7.2 8.14
          arcTo(
            horizontalEllipseRadius = 6.5f,
            verticalEllipseRadius = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.2f,
            y1 = 8.14f,
          )
          // a 9 9 0 0 1 17.6 0
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 17.6f,
            dy1 = 0.0f,
          )
          // A 6.5 6.5 0 0 1 23.5 21
          arcTo(
            horizontalEllipseRadius = 6.5f,
            verticalEllipseRadius = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.5f,
            y1 = 21.0f,
          )
        }
        // <circle cx="9.0" cy="27.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 27
          moveTo(x = 9.0f, y = 27.0f)
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
        // M26 23 h-9 v-7.17 l2.59 2.58 L21 17 l-5 -5 -5 5 1.41 1.41 L15 15.83 V23 H6 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 v-4 a2 2 0 0 0 -2 -2 m0 6 H6 v-4 h20Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 23
          moveTo(x = 26.0f, y = 23.0f)
          // h -9
          horizontalLineToRelative(dx = -9.0f)
          // v -7.17
          verticalLineToRelative(dy = -7.17f)
          // l 2.59 2.58
          lineToRelative(dx = 2.59f, dy = 2.58f)
          // L 21 17
          lineTo(x = 21.0f, y = 17.0f)
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 15 15.83
          lineTo(x = 15.0f, y = 15.83f)
          // V 23
          verticalLineTo(y = 23.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 20z
          horizontalLineToRelative(dx = 20.0f)
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
      .also { _instanceClassic = it }
  }

@Suppress("ObjectPropertyName")
private var _instanceClassic: ImageVector? = null

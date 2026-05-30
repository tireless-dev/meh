// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InstanceBx: ImageVector
  get() {
    val current = _instanceBx
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.InstanceBx",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12 5 a3 3 0 0 0 -3 -3 H4 v13 h5 a3 3 0 0 0 3 -3 v-1.5 a3 3 0 0 0 -.78 -2 3 3 0 0 0 .78 -2Z M6 4 h3 a1 1 0 0 1 1 1 v1.55 A.96 .96 0 0 1 9 7.5 H6Z m4 8 a1 1 0 0 1 -1 1 H6 V9.5 h3 a1 1 0 0 1 1 1Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 5
          moveTo(x = 12.0f, y = 5.0f)
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
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
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
          // v -1.5
          verticalLineToRelative(dy = -1.5f)
          // a 3 3 0 0 0 -0.78 -2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.78f,
            dy1 = -2.0f,
          )
          // a 3 3 0 0 0 0.78 -2z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.78f,
            dy1 = -2.0f,
          )
          close()
          // M 6 4
          moveTo(x = 6.0f, y = 4.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 1.55
          verticalLineToRelative(dy = 1.55f)
          // A 0.96 0.96 0 0 1 9 7.5
          arcTo(
            horizontalEllipseRadius = 0.96f,
            verticalEllipseRadius = 0.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 7.5f,
          )
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // m 4 8
          moveToRelative(dx = 4.0f, dy = 8.0f)
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
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 9.5
          verticalLineTo(y = 9.5f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
        // <polygon points="22.0 5.0 20.0 5.0 18.0 8.897 16.0 5.0 14.0 5.0 16.905 10.0 14.0 15.0 16.0 15.0 18.0 11.201 20.0 15.0 22.0 15.0 19.098 10.0 22.0 5.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 5
          moveTo(x = 22.0f, y = 5.0f)
          // L 20 5
          lineTo(x = 20.0f, y = 5.0f)
          // L 18 8.897
          lineTo(x = 18.0f, y = 8.897f)
          // L 16 5
          lineTo(x = 16.0f, y = 5.0f)
          // L 14 5
          lineTo(x = 14.0f, y = 5.0f)
          // L 16.905 10
          lineTo(x = 16.905f, y = 10.0f)
          // L 14 15
          lineTo(x = 14.0f, y = 15.0f)
          // L 16 15
          lineTo(x = 16.0f, y = 15.0f)
          // L 18 11.201
          lineTo(x = 18.0f, y = 11.201f)
          // L 20 15
          lineTo(x = 20.0f, y = 15.0f)
          // L 22 15
          lineTo(x = 22.0f, y = 15.0f)
          // L 19.098 10
          lineTo(x = 19.098f, y = 10.0f)
          // L 22 5z
          lineTo(x = 22.0f, y = 5.0f)
          close()
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
        // <rect width="4" height="2" x="2.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 18
          moveTo(x = 2.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="8.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 18
          moveTo(x = 8.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="14.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 18
          moveTo(x = 14.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="20.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 18
          moveTo(x = 20.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="26.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 18
          moveTo(x = 26.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M26 31 H6 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 M6 25 v4 h20 v-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 31
          moveTo(x = 26.0f, y = 31.0f)
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
          // M 6 25
          moveTo(x = 6.0f, y = 25.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
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
      .also { _instanceBx = it }
  }

@Suppress("ObjectPropertyName")
private var _instanceBx: ImageVector? = null

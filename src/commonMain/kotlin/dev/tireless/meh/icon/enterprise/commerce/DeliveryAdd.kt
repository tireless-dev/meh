// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeliveryAdd: ImageVector
  get() {
    val current = _deliveryAdd
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DeliveryAdd",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="12.0 6.0 8.0 6.0 8.0 2.0 6.0 2.0 6.0 6.0 2.0 6.0 2.0 8.0 6.0 8.0 6.0 12.0 8.0 12.0 8.0 8.0 12.0 8.0 12.0 6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 6
          moveTo(x = 12.0f, y = 6.0f)
          // L 8 6
          lineTo(x = 8.0f, y = 6.0f)
          // L 8 2
          lineTo(x = 8.0f, y = 2.0f)
          // L 6 2
          lineTo(x = 6.0f, y = 2.0f)
          // L 6 6
          lineTo(x = 6.0f, y = 6.0f)
          // L 2 6
          lineTo(x = 2.0f, y = 6.0f)
          // L 2 8
          lineTo(x = 2.0f, y = 8.0f)
          // L 6 8
          lineTo(x = 6.0f, y = 8.0f)
          // L 6 12
          lineTo(x = 6.0f, y = 12.0f)
          // L 8 12
          lineTo(x = 8.0f, y = 12.0f)
          // L 8 8
          lineTo(x = 8.0f, y = 8.0f)
          // L 12 8
          lineTo(x = 12.0f, y = 8.0f)
          // L 12 6z
          lineTo(x = 12.0f, y = 6.0f)
          close()
        }
        // m29.92 16.6 -3 -7 A1 1 0 0 0 26 9 h-3 V7 a1 1 0 0 0 -1 -1 h-7 v2 h6 v12.56 A4 4 0 0 0 19.14 23 h-6.28 a3.98 3.98 0 0 0 -7.72 0 H4 v-9 H2 v10 a1 1 0 0 0 1 1 h2.14 a3.98 3.98 0 0 0 7.72 0 h6.28 a3.98 3.98 0 0 0 7.72 0 H29 a1 1 0 0 0 1 -1 v-7 a1 1 0 0 0 -.08 -.4 M9 26 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m14 -15 h2.34 l2.14 5 H23Z m0 15 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m5 -3 h-1.14 A4 4 0 0 0 23 20 v-2 h5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.92 16.6
          moveTo(x = 29.92f, y = 16.6f)
          // l -3 -7
          lineToRelative(dx = -3.0f, dy = -7.0f)
          // A 1 1 0 0 0 26 9
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 9.0f,
          )
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // V 7
          verticalLineTo(y = 7.0f)
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
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 12.56
          verticalLineToRelative(dy = 12.56f)
          // A 4 4 0 0 0 19.14 23
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.14f,
            y1 = 23.0f,
          )
          // h -6.28
          horizontalLineToRelative(dx = -6.28f)
          // a 3.98 3.98 0 0 0 -7.72 0
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.72f,
            dy1 = 0.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
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
          // h 2.14
          horizontalLineToRelative(dx = 2.14f)
          // a 3.98 3.98 0 0 0 7.72 0
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.72f,
            dy1 = 0.0f,
          )
          // h 6.28
          horizontalLineToRelative(dx = 6.28f)
          // a 3.98 3.98 0 0 0 7.72 0
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.72f,
            dy1 = 0.0f,
          )
          // H 29
          horizontalLineTo(x = 29.0f)
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
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // a 1 1 0 0 0 -0.08 -0.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.08f,
            dy1 = -0.4f,
          )
          // M 9 26
          moveTo(x = 9.0f, y = 26.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
          // m 14 -15
          moveToRelative(dx = 14.0f, dy = -15.0f)
          // h 2.34
          horizontalLineToRelative(dx = 2.34f)
          // l 2.14 5
          lineToRelative(dx = 2.14f, dy = 5.0f)
          // H 23z
          horizontalLineTo(x = 23.0f)
          close()
          // m 0 15
          moveToRelative(dx = 0.0f, dy = 15.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
          // m 5 -3
          moveToRelative(dx = 5.0f, dy = -3.0f)
          // h -1.14
          horizontalLineToRelative(dx = -1.14f)
          // A 4 4 0 0 0 23 20
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 20.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 5z
          horizontalLineToRelative(dx = 5.0f)
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
      .also { _deliveryAdd = it }
  }

@Suppress("ObjectPropertyName")
private var _deliveryAdd: ImageVector? = null

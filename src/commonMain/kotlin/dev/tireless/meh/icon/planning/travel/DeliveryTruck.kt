// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeliveryTruck: ImageVector
  get() {
    val current = _deliveryTruck
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DeliveryTruck",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.92 16.61 -3 -7 A1 1 0 0 0 26 9 h-3 V7 a1 1 0 0 0 -1 -1 H3 a1 1 0 0 0 -1 1 v17 a1 1 0 0 0 1 1 h2.14 a4 4 0 0 0 7.72 0 h6.28 a4 4 0 0 0 7.72 0 H29 a1 1 0 0 0 1 -1 v-7 a1 1 0 0 0 -.08 -.39 M23 11 h2.34 l2.14 5 H23Z M9 26 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m10.14 -3 h-6.28 a4 4 0 0 0 -7.72 0 H4 V8 h17 v12.56 A4 4 0 0 0 19.14 23 M23 26 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m5 -3 h-1.14 A4 4 0 0 0 23 20 v-2 h5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.92 16.61
          moveTo(x = 29.92f, y = 16.61f)
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
          // H 3
          horizontalLineTo(x = 3.0f)
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
          // v 17
          verticalLineToRelative(dy = 17.0f)
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
          // a 4 4 0 0 0 7.72 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.72f,
            dy1 = 0.0f,
          )
          // h 6.28
          horizontalLineToRelative(dx = 6.28f)
          // a 4 4 0 0 0 7.72 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
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
          // a 1 1 0 0 0 -0.08 -0.39
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.08f,
            dy1 = -0.39f,
          )
          // M 23 11
          moveTo(x = 23.0f, y = 11.0f)
          // h 2.34
          horizontalLineToRelative(dx = 2.34f)
          // l 2.14 5
          lineToRelative(dx = 2.14f, dy = 5.0f)
          // H 23z
          horizontalLineTo(x = 23.0f)
          close()
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
          // m 10.14 -3
          moveToRelative(dx = 10.14f, dy = -3.0f)
          // h -6.28
          horizontalLineToRelative(dx = -6.28f)
          // a 4 4 0 0 0 -7.72 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.72f,
            dy1 = 0.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 17
          horizontalLineToRelative(dx = 17.0f)
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
          // M 23 26
          moveTo(x = 23.0f, y = 26.0f)
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
      .also { _deliveryTruck = it }
  }

@Suppress("ObjectPropertyName")
private var _deliveryTruck: ImageVector? = null

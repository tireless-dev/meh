// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeliverySettings: ImageVector
  get() {
    val current = _deliverySettings
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DeliverySettings",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.92 18.6 -3 -7 A1 1 0 0 0 26 11 h-3 V9 a1 1 0 0 0 -1 -1 h-3 v2 h2 v12.56 A4 4 0 0 0 19.14 25 h-6.28 a4 4 0 0 0 -7.72 0 H4 v-8 H2 v9 a1 1 0 0 0 1 1 h2.14 a4 4 0 0 0 7.72 0 h6.28 a4 4 0 0 0 7.72 0 H29 a1 1 0 0 0 1 -1 v-7 a1 1 0 0 0 -.08 -.4 M9 28 a2 2 0 1 1 0 -4 2 2 0 0 1 0 4 m14 -15 h2.34 l2.14 5 H23z m0 15 a2 2 0 1 1 0 -4 2 2 0 0 1 0 4 m5 -3 h-1.14 A4 4 0 0 0 23 22 v-2 h5z M4.83 11.75 l-1.49 1.5 1.42 1.4 1.49 -1.48 A5 5 0 0 0 8 13.9 V16 h2 v-2.1 a5 5 0 0 0 1.75 -.73 l1.5 1.49 1.4 -1.42 -1.48 -1.49 A5 5 0 0 0 13.9 10 H16 V8 h-2.1 a5 5 0 0 0 -.73 -1.75 l1.49 -1.5 -1.42 -1.4 -1.49 1.48 A5 5 0 0 0 10 4.1 V2 H8 v2.1 a5 5 0 0 0 -1.75 .73 l-1.5 -1.49 -1.4 1.42 1.48 1.49 A5 5 0 0 0 4.1 8 H2 v2 h2.1 a5 5 0 0 0 .73 1.75 M9 6 a3 3 0 1 1 0 6 3 3 0 0 1 0 -6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.92 18.6
          moveTo(x = 29.92f, y = 18.6f)
          // l -3 -7
          lineToRelative(dx = -3.0f, dy = -7.0f)
          // A 1 1 0 0 0 26 11
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 11.0f,
          )
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // V 9
          verticalLineTo(y = 9.0f)
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
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 12.56
          verticalLineToRelative(dy = 12.56f)
          // A 4 4 0 0 0 19.14 25
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.14f,
            y1 = 25.0f,
          )
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
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
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
          // M 9 28
          moveTo(x = 9.0f, y = 28.0f)
          // a 2 2 0 1 1 0 -4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.0f,
          )
          // a 2 2 0 0 1 0 4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 4.0f,
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
          // a 2 2 0 1 1 0 -4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.0f,
          )
          // a 2 2 0 0 1 0 4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 4.0f,
          )
          // m 5 -3
          moveToRelative(dx = 5.0f, dy = -3.0f)
          // h -1.14
          horizontalLineToRelative(dx = -1.14f)
          // A 4 4 0 0 0 23 22
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 22.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 5z
          horizontalLineToRelative(dx = 5.0f)
          close()
          // M 4.83 11.75
          moveTo(x = 4.83f, y = 11.75f)
          // l -1.49 1.5
          lineToRelative(dx = -1.49f, dy = 1.5f)
          // l 1.42 1.4
          lineToRelative(dx = 1.42f, dy = 1.4f)
          // l 1.49 -1.48
          lineToRelative(dx = 1.49f, dy = -1.48f)
          // A 5 5 0 0 0 8 13.9
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 13.9f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.1
          verticalLineToRelative(dy = -2.1f)
          // a 5 5 0 0 0 1.75 -0.73
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.75f,
            dy1 = -0.73f,
          )
          // l 1.5 1.49
          lineToRelative(dx = 1.5f, dy = 1.49f)
          // l 1.4 -1.42
          lineToRelative(dx = 1.4f, dy = -1.42f)
          // l -1.48 -1.49
          lineToRelative(dx = -1.48f, dy = -1.49f)
          // A 5 5 0 0 0 13.9 10
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.9f,
            y1 = 10.0f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h -2.1
          horizontalLineToRelative(dx = -2.1f)
          // a 5 5 0 0 0 -0.73 -1.75
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.73f,
            dy1 = -1.75f,
          )
          // l 1.49 -1.5
          lineToRelative(dx = 1.49f, dy = -1.5f)
          // l -1.42 -1.4
          lineToRelative(dx = -1.42f, dy = -1.4f)
          // l -1.49 1.48
          lineToRelative(dx = -1.49f, dy = 1.48f)
          // A 5 5 0 0 0 10 4.1
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 4.1f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2.1
          verticalLineToRelative(dy = 2.1f)
          // a 5 5 0 0 0 -1.75 0.73
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.75f,
            dy1 = 0.73f,
          )
          // l -1.5 -1.49
          lineToRelative(dx = -1.5f, dy = -1.49f)
          // l -1.4 1.42
          lineToRelative(dx = -1.4f, dy = 1.42f)
          // l 1.48 1.49
          lineToRelative(dx = 1.48f, dy = 1.49f)
          // A 5 5 0 0 0 4.1 8
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.1f,
            y1 = 8.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.1
          horizontalLineToRelative(dx = 2.1f)
          // a 5 5 0 0 0 0.73 1.75
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.73f,
            dy1 = 1.75f,
          )
          // M 9 6
          moveTo(x = 9.0f, y = 6.0f)
          // a 3 3 0 1 1 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 6.0f,
          )
        // a 3 3 0 0 1 0 -6
        arcToRelative(
          a = 3.0f,
          b = 3.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          dx1 = 0.0f,
          dy1 = -6.0f,
        )
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
      .also { _deliverySettings = it }
  }

@Suppress("ObjectPropertyName")
private var _deliverySettings: ImageVector? = null

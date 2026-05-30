// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SubflowLocal: ImageVector
  get() {
    val current = _subflowLocal
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SubflowLocal",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M15.35 29.99 a14 14 0 0 1 -4.2 -.86 l.69 -1.87 a12 12 0 0 0 3.6 .73Z m4.26 -.46 L19.1 27.6 a12 12 0 0 0 3.36 -1.49 l1.08 1.69 a14 14 0 0 1 -3.93 1.73 M7.4 27.04 a14 14 0 0 1 -2.95 -3.12 L6.1 22.8 a12 12 0 0 0 2.53 2.68Z m-4.8 -6.99 A14 14 0 0 1 2 16 h2 a12 12 0 0 0 .51 3.48Z M26 17 l-1.41 1.41 L26.17 20 H15.82 a3 3 0 0 0 -.28 -.58 l4.48 -5.6 A3 3 0 0 0 21 14 a3 3 0 1 0 -2.82 -4 h-4.36 a2.98 2.98 0 0 0 -5.64 0 H2 v2 h6.18 a2.98 2.98 0 0 0 5.64 0 h4.36 a3 3 0 0 0 .28 .58 l-4.48 5.6 A3 3 0 0 0 13 18 a3 3 0 1 0 2.82 4 h10.35 l-1.58 1.59 L26 25 l4 -4Z m-5 -7 a1 1 0 1 1 -1 1 1 1 0 0 1 1 -1 m-10 2 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 m2 10 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 m15 -6 a12 12 0 0 0 -.51 -3.48 l1.91 -.57 A14 14 0 0 1 30 16Z m-2.1 -6.79 a12 12 0 0 0 -2.53 -2.68 l1.23 -1.57 a14 14 0 0 1 2.94 3.12Z M9.54 5.9 8.46 4.2 a14 14 0 0 1 3.93 -1.73 L12.9 4.4 A12 12 0 0 0 9.54 5.9 m10.62 -1.15 a12 12 0 0 0 -3.6 -.73 l.1 -2 a14 14 0 0 1 4.2 .86Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15.35 29.99
          moveTo(x = 15.35f, y = 29.99f)
          // a 14 14 0 0 1 -4.2 -0.86
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.2f,
            dy1 = -0.86f,
          )
          // l 0.69 -1.87
          lineToRelative(dx = 0.69f, dy = -1.87f)
          // a 12 12 0 0 0 3.6 0.73z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.6f,
            dy1 = 0.73f,
          )
          close()
          // m 4.26 -0.46
          moveToRelative(dx = 4.26f, dy = -0.46f)
          // L 19.1 27.6
          lineTo(x = 19.1f, y = 27.6f)
          // a 12 12 0 0 0 3.36 -1.49
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.36f,
            dy1 = -1.49f,
          )
          // l 1.08 1.69
          lineToRelative(dx = 1.08f, dy = 1.69f)
          // a 14 14 0 0 1 -3.93 1.73
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.93f,
            dy1 = 1.73f,
          )
          // M 7.4 27.04
          moveTo(x = 7.4f, y = 27.04f)
          // a 14 14 0 0 1 -2.95 -3.12
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.95f,
            dy1 = -3.12f,
          )
          // L 6.1 22.8
          lineTo(x = 6.1f, y = 22.8f)
          // a 12 12 0 0 0 2.53 2.68z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.53f,
            dy1 = 2.68f,
          )
          close()
          // m -4.8 -6.99
          moveToRelative(dx = -4.8f, dy = -6.99f)
          // A 14 14 0 0 1 2 16
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 12 12 0 0 0 0.51 3.48z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.51f,
            dy1 = 3.48f,
          )
          close()
          // M 26 17
          moveTo(x = 26.0f, y = 17.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 26.17 20
          lineTo(x = 26.17f, y = 20.0f)
          // H 15.82
          horizontalLineTo(x = 15.82f)
          // a 3 3 0 0 0 -0.28 -0.58
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.28f,
            dy1 = -0.58f,
          )
          // l 4.48 -5.6
          lineToRelative(dx = 4.48f, dy = -5.6f)
          // A 3 3 0 0 0 21 14
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 14.0f,
          )
          // a 3 3 0 1 0 -2.82 -4
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = -4.0f,
          )
          // h -4.36
          horizontalLineToRelative(dx = -4.36f)
          // a 2.98 2.98 0 0 0 -5.64 0
          arcToRelative(
            a = 2.98f,
            b = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.64f,
            dy1 = 0.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6.18
          horizontalLineToRelative(dx = 6.18f)
          // a 2.98 2.98 0 0 0 5.64 0
          arcToRelative(
            a = 2.98f,
            b = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.64f,
            dy1 = 0.0f,
          )
          // h 4.36
          horizontalLineToRelative(dx = 4.36f)
          // a 3 3 0 0 0 0.28 0.58
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.28f,
            dy1 = 0.58f,
          )
          // l -4.48 5.6
          lineToRelative(dx = -4.48f, dy = 5.6f)
          // A 3 3 0 0 0 13 18
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.0f,
            y1 = 18.0f,
          )
          // a 3 3 0 1 0 2.82 4
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.82f,
            dy1 = 4.0f,
          )
          // h 10.35
          horizontalLineToRelative(dx = 10.35f)
          // l -1.58 1.59
          lineToRelative(dx = -1.58f, dy = 1.59f)
          // L 26 25
          lineTo(x = 26.0f, y = 25.0f)
          // l 4 -4z
          lineToRelative(dx = 4.0f, dy = -4.0f)
          close()
          // m -5 -7
          moveToRelative(dx = -5.0f, dy = -7.0f)
          // a 1 1 0 1 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // m -10 2
          moveToRelative(dx = -10.0f, dy = 2.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
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
          // m 2 10
          moveToRelative(dx = 2.0f, dy = 10.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
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
          // m 15 -6
          moveToRelative(dx = 15.0f, dy = -6.0f)
          // a 12 12 0 0 0 -0.51 -3.48
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.51f,
            dy1 = -3.48f,
          )
          // l 1.91 -0.57
          lineToRelative(dx = 1.91f, dy = -0.57f)
          // A 14 14 0 0 1 30 16z
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 16.0f,
          )
          close()
          // m -2.1 -6.79
          moveToRelative(dx = -2.1f, dy = -6.79f)
          // a 12 12 0 0 0 -2.53 -2.68
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.53f,
            dy1 = -2.68f,
          )
          // l 1.23 -1.57
          lineToRelative(dx = 1.23f, dy = -1.57f)
          // a 14 14 0 0 1 2.94 3.12z
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.94f,
            dy1 = 3.12f,
          )
          close()
          // M 9.54 5.9
          moveTo(x = 9.54f, y = 5.9f)
          // L 8.46 4.2
          lineTo(x = 8.46f, y = 4.2f)
          // a 14 14 0 0 1 3.93 -1.73
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.93f,
            dy1 = -1.73f,
          )
          // L 12.9 4.4
          lineTo(x = 12.9f, y = 4.4f)
          // A 12 12 0 0 0 9.54 5.9
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.54f,
            y1 = 5.9f,
          )
          // m 10.62 -1.15
          moveToRelative(dx = 10.62f, dy = -1.15f)
          // a 12 12 0 0 0 -3.6 -0.73
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.6f,
            dy1 = -0.73f,
          )
          // l 0.1 -2
          lineToRelative(dx = 0.1f, dy = -2.0f)
          // a 14 14 0 0 1 4.2 0.86z
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.2f,
            dy1 = 0.86f,
          )
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
      .also { _subflowLocal = it }
  }

@Suppress("ObjectPropertyName")
private var _subflowLocal: ImageVector? = null

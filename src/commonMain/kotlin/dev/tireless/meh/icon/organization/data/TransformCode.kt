// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TransformCode: ImageVector
  get() {
    val current = _transformCode
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TransformCode",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M11.9 4.74 a12 12 0 0 0 -3.6 2.09 L7.02 5.3 a14 14 0 0 1 4.2 -2.44z M3.9 9 a14 14 0 0 0 -1.68 4.56 l1.99 .35 a12 12 0 0 1 1.42 -3.9z m.3 9.07 -1.97 .35 a14 14 0 0 0 1.66 4.56 l1.73 -1 a12 12 0 0 1 -1.43 -3.9 m4.1 7.09 L7.02 26.7 a14 14 0 0 0 4.2 2.44 l.69 -1.89 a12 12 0 0 1 -3.6 -2.1 m21.47 -11.6 A14 14 0 0 0 25 5.3 14 14 0 0 0 16 2 v2 a11.8 11.8 0 0 1 7.7 2.83 13 13 0 0 1 2.68 3.18 11.94 11.94 0 0 1 -6.28 17.25 A12 12 0 0 1 16 28 v2 a14 14 0 0 0 8.98 -3.3 A14.1 14.1 0 0 0 30 16 q-.01 -1.25 -.23 -2.43 m-17.05 .54 .92 -.92 .78 -.78 L13 11 l-.65 .65 -1.42 1.42 L9.2 14.8 8 16 l1.2 1.2 1.73 1.73 1.42 1.42 L13 21 l1.42 -1.41 -.78 -.78 -.92 -.92 -1.11 -1.12 L10.83 16 l.78 -.77z m6.56 3.78 -.92 .92 -.78 .78 L19 21 l.65 -.65 1.42 -1.42 1.73 -1.73 L24 16 l-1.2 -1.2 -1.73 -1.73 -1.42 -1.42 L19 11 l-1.42 1.41 .78 .78 .92 .92 1.11 1.12 .78 .77 -.78 .77z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.9 4.74
          moveTo(x = 11.9f, y = 4.74f)
          // a 12 12 0 0 0 -3.6 2.09
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.6f,
            dy1 = 2.09f,
          )
          // L 7.02 5.3
          lineTo(x = 7.02f, y = 5.3f)
          // a 14 14 0 0 1 4.2 -2.44z
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.2f,
            dy1 = -2.44f,
          )
          close()
          // M 3.9 9
          moveTo(x = 3.9f, y = 9.0f)
          // a 14 14 0 0 0 -1.68 4.56
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.68f,
            dy1 = 4.56f,
          )
          // l 1.99 0.35
          lineToRelative(dx = 1.99f, dy = 0.35f)
          // a 12 12 0 0 1 1.42 -3.9z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.42f,
            dy1 = -3.9f,
          )
          close()
          // m 0.3 9.07
          moveToRelative(dx = 0.3f, dy = 9.07f)
          // l -1.97 0.35
          lineToRelative(dx = -1.97f, dy = 0.35f)
          // a 14 14 0 0 0 1.66 4.56
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.66f,
            dy1 = 4.56f,
          )
          // l 1.73 -1
          lineToRelative(dx = 1.73f, dy = -1.0f)
          // a 12 12 0 0 1 -1.43 -3.9
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.43f,
            dy1 = -3.9f,
          )
          // m 4.1 7.09
          moveToRelative(dx = 4.1f, dy = 7.09f)
          // L 7.02 26.7
          lineTo(x = 7.02f, y = 26.7f)
          // a 14 14 0 0 0 4.2 2.44
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.2f,
            dy1 = 2.44f,
          )
          // l 0.69 -1.89
          lineToRelative(dx = 0.69f, dy = -1.89f)
          // a 12 12 0 0 1 -3.6 -2.1
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.6f,
            dy1 = -2.1f,
          )
          // m 21.47 -11.6
          moveToRelative(dx = 21.47f, dy = -11.6f)
          // A 14 14 0 0 0 25 5.3
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 5.3f,
          )
          // A 14 14 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 11.8 11.8 0 0 1 7.7 2.83
          arcToRelative(
            a = 11.8f,
            b = 11.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.7f,
            dy1 = 2.83f,
          )
          // a 13 13 0 0 1 2.68 3.18
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.68f,
            dy1 = 3.18f,
          )
          // a 11.94 11.94 0 0 1 -6.28 17.25
          arcToRelative(
            a = 11.94f,
            b = 11.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.28f,
            dy1 = 17.25f,
          )
          // A 12 12 0 0 1 16 28
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 28.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 14 14 0 0 0 8.98 -3.3
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.98f,
            dy1 = -3.3f,
          )
          // A 14.1 14.1 0 0 0 30 16
          arcTo(
            horizontalEllipseRadius = 14.1f,
            verticalEllipseRadius = 14.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 16.0f,
          )
          // q -0.01 -1.25 -0.23 -2.43
          quadToRelative(
            dx1 = -0.01f,
            dy1 = -1.25f,
            dx2 = -0.23f,
            dy2 = -2.43f,
          )
          // m -17.05 0.54
          moveToRelative(dx = -17.05f, dy = 0.54f)
          // l 0.92 -0.92
          lineToRelative(dx = 0.92f, dy = -0.92f)
          // l 0.78 -0.78
          lineToRelative(dx = 0.78f, dy = -0.78f)
          // L 13 11
          lineTo(x = 13.0f, y = 11.0f)
          // l -0.65 0.65
          lineToRelative(dx = -0.65f, dy = 0.65f)
          // l -1.42 1.42
          lineToRelative(dx = -1.42f, dy = 1.42f)
          // L 9.2 14.8
          lineTo(x = 9.2f, y = 14.8f)
          // L 8 16
          lineTo(x = 8.0f, y = 16.0f)
          // l 1.2 1.2
          lineToRelative(dx = 1.2f, dy = 1.2f)
          // l 1.73 1.73
          lineToRelative(dx = 1.73f, dy = 1.73f)
          // l 1.42 1.42
          lineToRelative(dx = 1.42f, dy = 1.42f)
          // L 13 21
          lineTo(x = 13.0f, y = 21.0f)
          // l 1.42 -1.41
          lineToRelative(dx = 1.42f, dy = -1.41f)
          // l -0.78 -0.78
          lineToRelative(dx = -0.78f, dy = -0.78f)
          // l -0.92 -0.92
          lineToRelative(dx = -0.92f, dy = -0.92f)
          // l -1.11 -1.12
          lineToRelative(dx = -1.11f, dy = -1.12f)
          // L 10.83 16
          lineTo(x = 10.83f, y = 16.0f)
          // l 0.78 -0.77z
          lineToRelative(dx = 0.78f, dy = -0.77f)
          close()
          // m 6.56 3.78
          moveToRelative(dx = 6.56f, dy = 3.78f)
          // l -0.92 0.92
          lineToRelative(dx = -0.92f, dy = 0.92f)
          // l -0.78 0.78
          lineToRelative(dx = -0.78f, dy = 0.78f)
          // L 19 21
          lineTo(x = 19.0f, y = 21.0f)
          // l 0.65 -0.65
          lineToRelative(dx = 0.65f, dy = -0.65f)
          // l 1.42 -1.42
          lineToRelative(dx = 1.42f, dy = -1.42f)
          // l 1.73 -1.73
          lineToRelative(dx = 1.73f, dy = -1.73f)
          // L 24 16
          lineTo(x = 24.0f, y = 16.0f)
          // l -1.2 -1.2
          lineToRelative(dx = -1.2f, dy = -1.2f)
          // l -1.73 -1.73
          lineToRelative(dx = -1.73f, dy = -1.73f)
          // l -1.42 -1.42
          lineToRelative(dx = -1.42f, dy = -1.42f)
          // L 19 11
          lineTo(x = 19.0f, y = 11.0f)
          // l -1.42 1.41
          lineToRelative(dx = -1.42f, dy = 1.41f)
          // l 0.78 0.78
          lineToRelative(dx = 0.78f, dy = 0.78f)
          // l 0.92 0.92
          lineToRelative(dx = 0.92f, dy = 0.92f)
          // l 1.11 1.12
          lineToRelative(dx = 1.11f, dy = 1.12f)
          // l 0.78 0.77
          lineToRelative(dx = 0.78f, dy = 0.77f)
          // l -0.78 0.77z
          lineToRelative(dx = -0.78f, dy = 0.77f)
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
      .also { _transformCode = it }
  }

@Suppress("ObjectPropertyName")
private var _transformCode: ImageVector? = null

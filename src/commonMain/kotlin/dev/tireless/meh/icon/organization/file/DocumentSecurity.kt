// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentSecurity: ImageVector
  get() {
    val current = _documentSecurity
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DocumentSecurity",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m23 30 -2.14 -1.01 A5 5 0 0 1 18 24.47 V18 h10 v6.47 a5 5 0 0 1 -2.86 4.52Z m-3 -10 v4.47 a3 3 0 0 0 1.72 2.7 L23 27.8 l1.28 -.61 A3 3 0 0 0 26 24.47 V20Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 30
          moveTo(x = 23.0f, y = 30.0f)
          // l -2.14 -1.01
          lineToRelative(dx = -2.14f, dy = -1.01f)
          // A 5 5 0 0 1 18 24.47
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 18.0f,
            y1 = 24.47f,
          )
          // V 18
          verticalLineTo(y = 18.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 6.47
          verticalLineToRelative(dy = 6.47f)
          // a 5 5 0 0 1 -2.86 4.52z
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.86f,
            dy1 = 4.52f,
          )
          close()
          // m -3 -10
          moveToRelative(dx = -3.0f, dy = -10.0f)
          // v 4.47
          verticalLineToRelative(dy = 4.47f)
          // a 3 3 0 0 0 1.72 2.7
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.72f,
            dy1 = 2.7f,
          )
          // L 23 27.8
          lineTo(x = 23.0f, y = 27.8f)
          // l 1.28 -0.61
          lineToRelative(dx = 1.28f, dy = -0.61f)
          // A 3 3 0 0 0 26 24.47
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 24.47f,
          )
          // V 20z
          verticalLineTo(y = 20.0f)
          close()
        }
        // M16 28 H6 V4 h8 v6 a2 2 0 0 0 2 2 h6 v3 h2 v-5 a1 1 0 0 0 -.3 -.7 l-7 -7 A1 1 0 0 0 16 2 H6 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h10Z m0 -23.6 5.6 5.6 H16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 1 1 0 0 0 -0.3 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -0.7f,
          )
          // l -7 -7
          lineToRelative(dx = -7.0f, dy = -7.0f)
          // A 1 1 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
          // m 0 -23.6
          moveToRelative(dx = 0.0f, dy = -23.6f)
          // l 5.6 5.6
          lineToRelative(dx = 5.6f, dy = 5.6f)
          // H 16z
          horizontalLineTo(x = 16.0f)
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
      .also { _documentSecurity = it }
  }

@Suppress("ObjectPropertyName")
private var _documentSecurity: ImageVector? = null

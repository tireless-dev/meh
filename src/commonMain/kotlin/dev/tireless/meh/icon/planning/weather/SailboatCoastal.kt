// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SailboatCoastal: ImageVector
  get() {
    val current = _sailboatCoastal
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SailboatCoastal",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m24.78 26 1.19 -4.76 A1 1 0 0 0 25 20 h-5 v-3 h5 a1 1 0 0 0 .9 -1.42 l-6 -13 a1 1 0 0 0 -1.7 -.19 l-10 13 A1 1 0 0 0 9 17 h9 v3 H7 a1 1 0 0 0 -.97 1.24 L7.22 26 H2 v2 h28 v-2Z M20 7.55 23.44 15 H20Z M11.03 15 18 5.94 V15Z m11.69 11 H9.28 l-1 -4 h15.44Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.78 26
          moveTo(x = 24.78f, y = 26.0f)
          // l 1.19 -4.76
          lineToRelative(dx = 1.19f, dy = -4.76f)
          // A 1 1 0 0 0 25 20
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 20.0f,
          )
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 1 1 0 0 0 0.9 -1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.9f,
            dy1 = -1.42f,
          )
          // l -6 -13
          lineToRelative(dx = -6.0f, dy = -13.0f)
          // a 1 1 0 0 0 -1.7 -0.19
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.7f,
            dy1 = -0.19f,
          )
          // l -10 13
          lineToRelative(dx = -10.0f, dy = 13.0f)
          // A 1 1 0 0 0 9 17
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 17.0f,
          )
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // a 1 1 0 0 0 -0.97 1.24
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.97f,
            dy1 = 1.24f,
          )
          // L 7.22 26
          lineTo(x = 7.22f, y = 26.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // M 20 7.55
          moveTo(x = 20.0f, y = 7.55f)
          // L 23.44 15
          lineTo(x = 23.44f, y = 15.0f)
          // H 20z
          horizontalLineTo(x = 20.0f)
          close()
          // M 11.03 15
          moveTo(x = 11.03f, y = 15.0f)
          // L 18 5.94
          lineTo(x = 18.0f, y = 5.94f)
          // V 15z
          verticalLineTo(y = 15.0f)
          close()
          // m 11.69 11
          moveToRelative(dx = 11.69f, dy = 11.0f)
          // H 9.28
          horizontalLineTo(x = 9.28f)
          // l -1 -4
          lineToRelative(dx = -1.0f, dy = -4.0f)
          // h 15.44z
          horizontalLineToRelative(dx = 15.44f)
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
      .also { _sailboatCoastal = it }
  }

@Suppress("ObjectPropertyName")
private var _sailboatCoastal: ImageVector? = null

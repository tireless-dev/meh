// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AccumulationPrecipitation: ImageVector
  get() {
    val current = _accumulationPrecipitation
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AccumulationPrecipitation",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="2" x="16.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 16
          moveTo(x = 16.0f, y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="18.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 18
          moveTo(x = 18.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="20.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 20
          moveTo(x = 20.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="20.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 16
          moveTo(x = 20.0f, y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="16.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 20
          moveTo(x = 16.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M20 12 a3.9 3.9 0 0 1 -4 -3.78 4 4 0 0 1 .65 -2.06 l2.52 -3.75 a1.04 1.04 0 0 1 1.66 0 l2.49 3.7 A4 4 0 0 1 24 8.22 3.9 3.9 0 0 1 20 12 m0 -7.24 -1.66 2.47 a2 2 0 0 0 -.34 1 A1.9 1.9 0 0 0 20 10 a1.9 1.9 0 0 0 2 -1.78 2 2 0 0 0 -.37 -1.04Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 12
          moveTo(x = 20.0f, y = 12.0f)
          // a 3.9 3.9 0 0 1 -4 -3.78
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -3.78f,
          )
          // a 4 4 0 0 1 0.65 -2.06
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.65f,
            dy1 = -2.06f,
          )
          // l 2.52 -3.75
          lineToRelative(dx = 2.52f, dy = -3.75f)
          // a 1.04 1.04 0 0 1 1.66 0
          arcToRelative(
            a = 1.04f,
            b = 1.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.66f,
            dy1 = 0.0f,
          )
          // l 2.49 3.7
          lineToRelative(dx = 2.49f, dy = 3.7f)
          // A 4 4 0 0 1 24 8.22
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 8.22f,
          )
          // A 3.9 3.9 0 0 1 20 12
          arcTo(
            horizontalEllipseRadius = 3.9f,
            verticalEllipseRadius = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 20.0f,
            y1 = 12.0f,
          )
          // m 0 -7.24
          moveToRelative(dx = 0.0f, dy = -7.24f)
          // l -1.66 2.47
          lineToRelative(dx = -1.66f, dy = 2.47f)
          // a 2 2 0 0 0 -0.34 1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.34f,
            dy1 = 1.0f,
          )
          // A 1.9 1.9 0 0 0 20 10
          arcTo(
            horizontalEllipseRadius = 1.9f,
            verticalEllipseRadius = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 10.0f,
          )
          // a 1.9 1.9 0 0 0 2 -1.78
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -1.78f,
          )
          // a 2 2 0 0 0 -0.37 -1.04z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.37f,
            dy1 = -1.04f,
          )
          close()
        }
        // M28 4 a2 2 0 0 0 -2 2 v20 H6 V10 h2 v8 l1 2 1 -2 v-8 h2 v4 l1 2 1 -2 V8 H6 V6 a2 2 0 0 0 -2 -2 H2 v2 h2 v20 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V6 h2 V4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 4
          moveTo(x = 28.0f, y = 4.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // l 1 2
          lineToRelative(dx = 1.0f, dy = 2.0f)
          // l 1 -2
          lineToRelative(dx = 1.0f, dy = -2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // l 1 2
          lineToRelative(dx = 1.0f, dy = 2.0f)
          // l 1 -2
          lineToRelative(dx = 1.0f, dy = -2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _accumulationPrecipitation = it }
  }

@Suppress("ObjectPropertyName")
private var _accumulationPrecipitation: ImageVector? = null

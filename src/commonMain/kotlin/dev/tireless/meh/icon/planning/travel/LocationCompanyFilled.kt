// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationCompanyFilled: ImageVector
  get() {
    val current = _locationCompanyFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LocationCompanyFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 18 h-2 v-8 h-6 v8 h-2 v-8 a2 2 0 0 1 2 -2 h6 a2 2 0 0 1 2 2Z m-4 -2 h-2 v2 h2Z m0 -4 h-2 v2 h2Z
        path {
          // M 21 18
          moveTo(x = 21.0f, y = 18.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 1 2 2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          close()
          // m -4 -2
          moveToRelative(dx = -4.0f, dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // M16 2 A11 11 0 0 0 5 13 a11 11 0 0 0 2.22 6.6 s.3 .4 .34 .45 L16 30 l8.44 -9.95 .34 -.45 A11 11 0 0 0 27 13 11 11 0 0 0 16 2 m1 16 h-2 v-2 h2Z m0 -4 h-2 v-2 h2Z m4 4 h-2 v-8 h-6 v8 h-2 v-8 a2 2 0 0 1 2 -2 h6 a2 2 0 0 1 2 2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // A 11 11 0 0 0 5 13
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.0f,
            y1 = 13.0f,
          )
          // a 11 11 0 0 0 2.22 6.6
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.22f,
            dy1 = 6.6f,
          )
          // s 0.3 0.4 0.34 0.45
          reflectiveCurveToRelative(
            dx1 = 0.3f,
            dy1 = 0.4f,
            dx2 = 0.34f,
            dy2 = 0.45f,
          )
          // L 16 30
          lineTo(x = 16.0f, y = 30.0f)
          // l 8.44 -9.95
          lineToRelative(dx = 8.44f, dy = -9.95f)
          // l 0.34 -0.45
          lineToRelative(dx = 0.34f, dy = -0.45f)
          // A 11 11 0 0 0 27 13
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.0f,
            y1 = 13.0f,
          )
          // A 11 11 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // m 1 16
          moveToRelative(dx = 1.0f, dy = 16.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 4 4
          moveToRelative(dx = 4.0f, dy = 4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 1 2 2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          close()
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _locationCompanyFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _locationCompanyFilled: ImageVector? = null

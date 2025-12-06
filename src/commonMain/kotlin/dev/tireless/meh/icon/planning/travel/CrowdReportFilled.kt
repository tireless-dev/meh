// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CrowdReportFilled: ImageVector
  get() {
    val current = _crowdReportFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CrowdReportFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16.83 19.55 -1.66 -1.1 2.3 -3.45 H20 v-5 h-8 v5 h2 v2 h-2 a2 2 0 0 1 -2 -2 v-5 a2 2 0 0 1 2 -2 h8 a2 2 0 0 1 2 2 v5 a2 2 0 0 1 -2 2 h-1.46Z
        path {
          // M 16.83 19.55
          moveTo(x = 16.83f, y = 19.55f)
          // l -1.66 -1.1
          lineToRelative(dx = -1.66f, dy = -1.1f)
          // l 2.3 -3.45
          lineToRelative(dx = 2.3f, dy = -3.45f)
          // H 20
          horizontalLineTo(x = 20.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
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
          // v -5
          verticalLineToRelative(dy = -5.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // v 5
          verticalLineToRelative(dy = 5.0f)
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
          // h -1.46z
          horizontalLineToRelative(dx = -1.46f)
          close()
        }
        // M16 2 A11 11 0 0 0 5 13 a11 11 0 0 0 2.22 6.6 s.3 .4 .34 .45 L16 30 l8.44 -9.95 .34 -.45 A11 11 0 0 0 27 13 11 11 0 0 0 16 2 m6 13 a2 2 0 0 1 -2 2 h-1.46 l-1.7 2.55 -1.67 -1.1 2.3 -3.45 H20 v-5 h-8 v5 h2 v2 h-2 a2 2 0 0 1 -2 -2 v-5 a2 2 0 0 1 2 -2 h8 a2 2 0 0 1 2 2Z
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
          // m 6 13
          moveToRelative(dx = 6.0f, dy = 13.0f)
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
          // h -1.46
          horizontalLineToRelative(dx = -1.46f)
          // l -1.7 2.55
          lineToRelative(dx = -1.7f, dy = 2.55f)
          // l -1.67 -1.1
          lineToRelative(dx = -1.67f, dy = -1.1f)
          // l 2.3 -3.45
          lineToRelative(dx = 2.3f, dy = -3.45f)
          // H 20
          horizontalLineTo(x = 20.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
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
          // v -5
          verticalLineToRelative(dy = -5.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
      .also { _crowdReportFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _crowdReportFilled: ImageVector? = null

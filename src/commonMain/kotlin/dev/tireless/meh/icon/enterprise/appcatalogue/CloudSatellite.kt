// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudSatellite: ImageVector
  get() {
    val current = _cloudSatellite
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CloudSatellite",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="9.0" cy="20.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 20
          moveTo(x = 9.0f, y = 20.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M16 20 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF1C1C1C)),
        ) {
          // M 16 20
          moveTo(x = 16.0f, y = 20.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
        }
        // <circle cx="23.0" cy="12.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 12
          moveTo(x = 23.0f, y = 12.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M16 31 a1 1 0 0 1 -.5 -.14 l-12 -7 A1 1 0 0 1 3 23 V9 a1 1 0 0 1 .5 -.86 l12 -7 a1 1 0 0 1 1 0 l12 7 -1 1.72 L16 3.16 5 9.57 v12.86 l11 6.41 11 -6.41 V15 h2 v8 a1 1 0 0 1 -.5 .86 l-12 7 A1 1 0 0 1 16 31
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 31
          moveTo(x = 16.0f, y = 31.0f)
          // a 1 1 0 0 1 -0.5 -0.14
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.5f,
            dy1 = -0.14f,
          )
          // l -12 -7
          lineToRelative(dx = -12.0f, dy = -7.0f)
          // A 1 1 0 0 1 3 23
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 3.0f,
            y1 = 23.0f,
          )
          // V 9
          verticalLineTo(y = 9.0f)
          // a 1 1 0 0 1 0.5 -0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.5f,
            dy1 = -0.86f,
          )
          // l 12 -7
          lineToRelative(dx = 12.0f, dy = -7.0f)
          // a 1 1 0 0 1 1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 0.0f,
          )
          // l 12 7
          lineToRelative(dx = 12.0f, dy = 7.0f)
          // l -1 1.72
          lineToRelative(dx = -1.0f, dy = 1.72f)
          // L 16 3.16
          lineTo(x = 16.0f, y = 3.16f)
          // L 5 9.57
          lineTo(x = 5.0f, y = 9.57f)
          // v 12.86
          verticalLineToRelative(dy = 12.86f)
          // l 11 6.41
          lineToRelative(dx = 11.0f, dy = 6.41f)
          // l 11 -6.41
          lineToRelative(dx = 11.0f, dy = -6.41f)
          // V 15
          verticalLineTo(y = 15.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // a 1 1 0 0 1 -0.5 0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.5f,
            dy1 = 0.86f,
          )
          // l -12 7
          lineToRelative(dx = -12.0f, dy = 7.0f)
          // A 1 1 0 0 1 16 31
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 31.0f,
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
      .also { _cloudSatellite = it }
  }

@Suppress("ObjectPropertyName")
private var _cloudSatellite: ImageVector? = null

// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudSatelliteLink: ImageVector
  get() {
    val current = _cloudSatelliteLink
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CloudSatelliteLink",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m30.98 24.97 -5 5 a3.5 3.5 0 0 1 -4.96 -4.94 l1.42 1.41 a1.5 1.5 0 0 0 2.12 2.12 l5 -5 a1.5 1.5 0 0 0 -2.12 -2.12 l-1.41 -1.42 a3.5 3.5 0 0 1 4.95 4.95
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30.98 24.97
          moveTo(x = 30.98f, y = 24.97f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // a 3.5 3.5 0 0 1 -4.96 -4.94
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.96f,
            dy1 = -4.94f,
          )
          // l 1.42 1.41
          lineToRelative(dx = 1.42f, dy = 1.41f)
          // a 1.5 1.5 0 0 0 2.12 2.12
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.12f,
            dy1 = 2.12f,
          )
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // a 1.5 1.5 0 0 0 -2.12 -2.12
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.12f,
            dy1 = -2.12f,
          )
          // l -1.41 -1.42
          lineToRelative(dx = -1.41f, dy = -1.42f)
          // a 3.5 3.5 0 0 1 4.95 4.95
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.95f,
            dy1 = 4.95f,
          )
        }
        // m20.03 21.02 -5 5 a3.5 3.5 0 0 0 4.94 4.96 l-1.41 -1.42 a1.5 1.5 0 0 1 -2.12 -2.12 l5 -5 a1.5 1.5 0 0 1 2.12 2.12 l1.42 1.41 a3.5 3.5 0 0 0 -4.95 -4.95
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.03 21.02
          moveTo(x = 20.03f, y = 21.02f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // a 3.5 3.5 0 0 0 4.94 4.96
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.94f,
            dy1 = 4.96f,
          )
          // l -1.41 -1.42
          lineToRelative(dx = -1.41f, dy = -1.42f)
          // a 1.5 1.5 0 0 1 -2.12 -2.12
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.12f,
            dy1 = -2.12f,
          )
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // a 1.5 1.5 0 0 1 2.12 2.12
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.12f,
            dy1 = 2.12f,
          )
          // l 1.42 1.41
          lineToRelative(dx = 1.42f, dy = 1.41f)
          // a 3.5 3.5 0 0 0 -4.95 -4.95
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.95f,
            dy1 = -4.95f,
          )
        }
        // <circle cx="7.0" cy="20.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 20
          moveTo(x = 7.0f, y = 20.0f)
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
        // M14 20 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 20
          moveTo(x = 14.0f, y = 20.0f)
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
        // <circle cx="21.0" cy="12.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 12
          moveTo(x = 21.0f, y = 12.0f)
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
        // M11.3 27.27 3 22.43 V9.57 l11 -6.41 11.5 6.7 1 -1.72 -12 -7 a1 1 0 0 0 -1 0 l-12 7 A1 1 0 0 0 1 9 v14 a1 1 0 0 0 .5 .86 L10.3 29Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.3 27.27
          moveTo(x = 11.3f, y = 27.27f)
          // L 3 22.43
          lineTo(x = 3.0f, y = 22.43f)
          // V 9.57
          verticalLineTo(y = 9.57f)
          // l 11 -6.41
          lineToRelative(dx = 11.0f, dy = -6.41f)
          // l 11.5 6.7
          lineToRelative(dx = 11.5f, dy = 6.7f)
          // l 1 -1.72
          lineToRelative(dx = 1.0f, dy = -1.72f)
          // l -12 -7
          lineToRelative(dx = -12.0f, dy = -7.0f)
          // a 1 1 0 0 0 -1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 0.0f,
          )
          // l -12 7
          lineToRelative(dx = -12.0f, dy = 7.0f)
          // A 1 1 0 0 0 1 9
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 1.0f,
            y1 = 9.0f,
          )
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // a 1 1 0 0 0 0.5 0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.5f,
            dy1 = 0.86f,
          )
          // L 10.3 29z
          lineTo(x = 10.3f, y = 29.0f)
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
      .also { _cloudSatelliteLink = it }
  }

@Suppress("ObjectPropertyName")
private var _cloudSatelliteLink: ImageVector? = null

// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DroneVideo: ImageVector
  get() {
    val current = _droneVideo
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DroneVideo",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="16.0" cy="21.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 21
          moveTo(x = 16.0f, y = 21.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M28 19 v-4 h-2 v2 H6 v-2 H4 v4 h7 v4.41 l-4 2.23 V30 h2 v-3.19 L12.26 25 h7.48 L23 26.81 V30 h2 v-4.36 l-4 -2.23 V19Z m-9 4 h-6 v-4 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 19
          moveTo(x = 28.0f, y = 19.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 4.41
          verticalLineToRelative(dy = 4.41f)
          // l -4 2.23
          lineToRelative(dx = -4.0f, dy = 2.23f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3.19
          verticalLineToRelative(dy = -3.19f)
          // L 12.26 25
          lineTo(x = 12.26f, y = 25.0f)
          // h 7.48
          horizontalLineToRelative(dx = 7.48f)
          // L 23 26.81
          lineTo(x = 23.0f, y = 26.81f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4.36
          verticalLineToRelative(dy = -4.36f)
          // l -4 -2.23
          lineToRelative(dx = -4.0f, dy = -2.23f)
          // V 19z
          verticalLineTo(y = 19.0f)
          close()
          // m -9 4
          moveToRelative(dx = -9.0f, dy = 4.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
        }
        // <rect width="10" height="2" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 0 11
          moveTo(x = 0.0f, y = 11.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="10" height="2" x="22.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 11
          moveTo(x = 22.0f, y = 11.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // M16 6 a6 6 0 0 0 -4.24 1.76 l1.41 1.41 a4 4 0 0 1 5.66 0 l1.41 -1.41 A6 6 0 0 0 16 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 6
          moveTo(x = 16.0f, y = 6.0f)
          // a 6 6 0 0 0 -4.24 1.76
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.24f,
            dy1 = 1.76f,
          )
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // a 4 4 0 0 1 5.66 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.66f,
            dy1 = 0.0f,
          )
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // A 6 6 0 0 0 16 6
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 6.0f,
          )
        }
        // m8.93 4.93 1.42 1.42 a8 8 0 0 1 11.3 0 l1.42 -1.42 a10 10 0 0 0 -14.14 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.93 4.93
          moveTo(x = 8.93f, y = 4.93f)
          // l 1.42 1.42
          lineToRelative(dx = 1.42f, dy = 1.42f)
          // a 8 8 0 0 1 11.3 0
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 11.3f,
            dy1 = 0.0f,
          )
          // l 1.42 -1.42
          lineToRelative(dx = 1.42f, dy = -1.42f)
          // a 10 10 0 0 0 -14.14 0
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -14.14f,
            dy1 = 0.0f,
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
      .also { _droneVideo = it }
  }

@Suppress("ObjectPropertyName")
private var _droneVideo: ImageVector? = null

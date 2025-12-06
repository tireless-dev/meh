// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DroneDelivery: ImageVector
  get() {
    val current = _droneDelivery
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DroneDelivery",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 30 h-8 v-8 h8Z m-6 -2 h4 v-4 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 30
          moveTo(x = 20.0f, y = 30.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m -6 -2
          moveToRelative(dx = -6.0f, dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <polygon points="32.0 11.0 22.0 11.0 22.0 13.0 26.0 13.0 26.0 16.0 6.0 16.0 6.0 13.0 10.0 13.0 10.0 11.0 0.0 11.0 0.0 13.0 4.0 13.0 4.0 18.0 9.132 18.0 6.0 22.697 6.0 27.0 8.0 27.0 8.0 23.303 11.535 18.0 20.465 18.0 24.0 23.303 24.0 27.0 26.0 27.0 26.0 22.697 22.868 18.0 28.0 18.0 28.0 13.0 32.0 13.0 32.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 32 11
          moveTo(x = 32.0f, y = 11.0f)
          // L 22 11
          lineTo(x = 22.0f, y = 11.0f)
          // L 22 13
          lineTo(x = 22.0f, y = 13.0f)
          // L 26 13
          lineTo(x = 26.0f, y = 13.0f)
          // L 26 16
          lineTo(x = 26.0f, y = 16.0f)
          // L 6 16
          lineTo(x = 6.0f, y = 16.0f)
          // L 6 13
          lineTo(x = 6.0f, y = 13.0f)
          // L 10 13
          lineTo(x = 10.0f, y = 13.0f)
          // L 10 11
          lineTo(x = 10.0f, y = 11.0f)
          // L 0 11
          lineTo(x = 0.0f, y = 11.0f)
          // L 0 13
          lineTo(x = 0.0f, y = 13.0f)
          // L 4 13
          lineTo(x = 4.0f, y = 13.0f)
          // L 4 18
          lineTo(x = 4.0f, y = 18.0f)
          // L 9.132 18
          lineTo(x = 9.132f, y = 18.0f)
          // L 6 22.697
          lineTo(x = 6.0f, y = 22.697f)
          // L 6 27
          lineTo(x = 6.0f, y = 27.0f)
          // L 8 27
          lineTo(x = 8.0f, y = 27.0f)
          // L 8 23.303
          lineTo(x = 8.0f, y = 23.303f)
          // L 11.535 18
          lineTo(x = 11.535f, y = 18.0f)
          // L 20.465 18
          lineTo(x = 20.465f, y = 18.0f)
          // L 24 23.303
          lineTo(x = 24.0f, y = 23.303f)
          // L 24 27
          lineTo(x = 24.0f, y = 27.0f)
          // L 26 27
          lineTo(x = 26.0f, y = 27.0f)
          // L 26 22.697
          lineTo(x = 26.0f, y = 22.697f)
          // L 22.868 18
          lineTo(x = 22.868f, y = 18.0f)
          // L 28 18
          lineTo(x = 28.0f, y = 18.0f)
          // L 28 13
          lineTo(x = 28.0f, y = 13.0f)
          // L 32 13
          lineTo(x = 32.0f, y = 13.0f)
          // L 32 11z
          lineTo(x = 32.0f, y = 11.0f)
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
      .also { _droneDelivery = it }
  }

@Suppress("ObjectPropertyName")
private var _droneDelivery: ImageVector? = null

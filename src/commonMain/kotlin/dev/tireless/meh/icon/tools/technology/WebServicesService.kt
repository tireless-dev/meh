// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WebServicesService: ImageVector
  get() {
    val current = _webServicesService
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WebServicesService",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 18 h-2 v-7 h-7 V9 h8 a1 1 0 0 1 1 1z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 18
          moveTo(x = 23.0f, y = 18.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 1 1 0 0 1 1 1z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          close()
        }
        // M18 23 h-8 a1 1 0 0 1 -1 -1 v-8 a1 1 0 0 1 1 -1 h8 a1 1 0 0 1 1 1 v8 a1 1 0 0 1 -1 1 m-7 -2 h6 v-6 h-6z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 23
          moveTo(x = 18.0f, y = 23.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // m -7 -2
          moveToRelative(dx = -7.0f, dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // M16 1 a1 1 0 0 0 -.5 .14 l-12 7 A1 1 0 0 0 3 9 v14 a1 1 0 0 0 .5 .86 l12 7 a1 1 0 0 0 1 0 l11 -6.41 -1 -1.73 L16 28.84 5 22.43 V9.57 l11 -6.41 11 6.41 V17 h2 V9 a1 1 0 0 0 -.5 -.86 l-12 -7 A1 1 0 0 0 16 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 1
          moveTo(x = 16.0f, y = 1.0f)
          // a 1 1 0 0 0 -0.5 0.14
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.5f,
            dy1 = 0.14f,
          )
          // l -12 7
          lineToRelative(dx = -12.0f, dy = 7.0f)
          // A 1 1 0 0 0 3 9
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
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
          // l 12 7
          lineToRelative(dx = 12.0f, dy = 7.0f)
          // a 1 1 0 0 0 1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 0.0f,
          )
          // l 11 -6.41
          lineToRelative(dx = 11.0f, dy = -6.41f)
          // l -1 -1.73
          lineToRelative(dx = -1.0f, dy = -1.73f)
          // L 16 28.84
          lineTo(x = 16.0f, y = 28.84f)
          // L 5 22.43
          lineTo(x = 5.0f, y = 22.43f)
          // V 9.57
          verticalLineTo(y = 9.57f)
          // l 11 -6.41
          lineToRelative(dx = 11.0f, dy = -6.41f)
          // l 11 6.41
          lineToRelative(dx = 11.0f, dy = 6.41f)
          // V 17
          verticalLineTo(y = 17.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // a 1 1 0 0 0 -0.5 -0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.5f,
            dy1 = -0.86f,
          )
          // l -12 -7
          lineToRelative(dx = -12.0f, dy = -7.0f)
          // A 1 1 0 0 0 16 1
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 1.0f,
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
      .also { _webServicesService = it }
  }

@Suppress("ObjectPropertyName")
private var _webServicesService: ImageVector? = null

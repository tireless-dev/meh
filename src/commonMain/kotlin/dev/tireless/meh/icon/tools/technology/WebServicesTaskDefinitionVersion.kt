// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WebServicesTaskDefinitionVersion: ImageVector
  get() {
    val current = _webServicesTaskDefinitionVersion
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WebServicesTaskDefinitionVersion",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="24.0 15.0 22.25 15.0 20.0 22.0312 17.7917 15.0003 16.0 15.0003 18.5 23.0 21.5 23.0 24.0 15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 15
          moveTo(x = 24.0f, y = 15.0f)
          // L 22.25 15
          lineTo(x = 22.25f, y = 15.0f)
          // L 20 22.0312
          lineTo(x = 20.0f, y = 22.0312f)
          // L 17.7917 15.0003
          lineTo(x = 17.7917f, y = 15.0003f)
          // L 16 15.0003
          lineTo(x = 16.0f, y = 15.0003f)
          // L 18.5 23
          lineTo(x = 18.5f, y = 23.0f)
          // L 21.5 23
          lineTo(x = 21.5f, y = 23.0f)
          // L 24 15z
          lineTo(x = 24.0f, y = 15.0f)
          close()
        }
        // M16 23 h-5 a1 1 0 0 1 -1 -1 V10 a1 1 0 0 1 1 -1 h10 a1 1 0 0 1 1 1 v4 h-2 v-3 h-8 v10 h4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 23
          moveTo(x = 16.0f, y = 23.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
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
          // V 10
          verticalLineTo(y = 10.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _webServicesTaskDefinitionVersion = it }
  }

@Suppress("ObjectPropertyName")
private var _webServicesTaskDefinitionVersion: ImageVector? = null

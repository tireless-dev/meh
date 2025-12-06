// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WebServicesDefinition: ImageVector
  get() {
    val current = _webServicesDefinition
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WebServicesDefinition",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="2" x="14.0" y="17.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 17
          moveTo(x = 14.0f, y = 17.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="4" height="2" x="14.0" y="13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 13
          moveTo(x = 14.0f, y = 13.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M21 23 H11 a1 1 0 0 1 -1 -1 V10 a1 1 0 0 1 1 -1 h10 a1 1 0 0 1 1 1 v12 a1 1 0 0 1 -1 1 m-9 -2 h8 V11 h-8z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 23
          moveTo(x = 21.0f, y = 23.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
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
          // m -9 -2
          moveToRelative(dx = -9.0f, dy = -2.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
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
      .also { _webServicesDefinition = it }
  }

@Suppress("ObjectPropertyName")
private var _webServicesDefinition: ImageVector? = null

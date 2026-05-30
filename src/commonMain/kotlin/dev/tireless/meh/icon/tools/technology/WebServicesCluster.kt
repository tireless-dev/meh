// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WebServicesCluster: ImageVector
  get() {
    val current = _webServicesCluster
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WebServicesCluster",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 26 a1 1 0 0 1 -.7 -.3 l-3 -3 a1 1 0 0 1 0 -1.4 l3 -3 a1 1 0 0 1 1.4 0 l3 3 a1 1 0 0 1 0 1.4 l-3 3 A1 1 0 0 1 16 26 m-1.59 -4 L16 23.59 17.59 22 16 20.41z M22 20 a1 1 0 0 1 -.7 -.3 l-3 -3 a1 1 0 0 1 0 -1.4 l3 -3 a1 1 0 0 1 1.4 0 l3 3 a1 1 0 0 1 0 1.4 l-3 3 A1 1 0 0 1 22 20 m-1.59 -4 L22 17.59 23.59 16 22 14.41z M16 14 a1 1 0 0 1 -.7 -.3 l-3 -3 a1 1 0 0 1 0 -1.4 l3 -3 a1 1 0 0 1 1.4 0 l3 3 a1 1 0 0 1 0 1.4 l-3 3 A1 1 0 0 1 16 14 m-1.59 -4 L16 11.59 17.59 10 16 8.41z M10 20 a1 1 0 0 1 -.7 -.3 l-3 -3 a1 1 0 0 1 0 -1.4 l3 -3 a1 1 0 0 1 1.4 0 l3 3 a1 1 0 0 1 0 1.4 l-3 3 A1 1 0 0 1 10 20 m-1.59 -4 L10 17.59 11.59 16 10 14.41z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 26
          moveTo(x = 16.0f, y = 26.0f)
          // a 1 1 0 0 1 -0.7 -0.3
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.7f,
            dy1 = -0.3f,
          )
          // l -3 -3
          lineToRelative(dx = -3.0f, dy = -3.0f)
          // a 1 1 0 0 1 0 -1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -1.4f,
          )
          // l 3 -3
          lineToRelative(dx = 3.0f, dy = -3.0f)
          // a 1 1 0 0 1 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // l 3 3
          lineToRelative(dx = 3.0f, dy = 3.0f)
          // a 1 1 0 0 1 0 1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.4f,
          )
          // l -3 3
          lineToRelative(dx = -3.0f, dy = 3.0f)
          // A 1 1 0 0 1 16 26
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 26.0f,
          )
          // m -1.59 -4
          moveToRelative(dx = -1.59f, dy = -4.0f)
          // L 16 23.59
          lineTo(x = 16.0f, y = 23.59f)
          // L 17.59 22
          lineTo(x = 17.59f, y = 22.0f)
          // L 16 20.41z
          lineTo(x = 16.0f, y = 20.41f)
          close()
          // M 22 20
          moveTo(x = 22.0f, y = 20.0f)
          // a 1 1 0 0 1 -0.7 -0.3
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.7f,
            dy1 = -0.3f,
          )
          // l -3 -3
          lineToRelative(dx = -3.0f, dy = -3.0f)
          // a 1 1 0 0 1 0 -1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -1.4f,
          )
          // l 3 -3
          lineToRelative(dx = 3.0f, dy = -3.0f)
          // a 1 1 0 0 1 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // l 3 3
          lineToRelative(dx = 3.0f, dy = 3.0f)
          // a 1 1 0 0 1 0 1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.4f,
          )
          // l -3 3
          lineToRelative(dx = -3.0f, dy = 3.0f)
          // A 1 1 0 0 1 22 20
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 20.0f,
          )
          // m -1.59 -4
          moveToRelative(dx = -1.59f, dy = -4.0f)
          // L 22 17.59
          lineTo(x = 22.0f, y = 17.59f)
          // L 23.59 16
          lineTo(x = 23.59f, y = 16.0f)
          // L 22 14.41z
          lineTo(x = 22.0f, y = 14.41f)
          close()
          // M 16 14
          moveTo(x = 16.0f, y = 14.0f)
          // a 1 1 0 0 1 -0.7 -0.3
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.7f,
            dy1 = -0.3f,
          )
          // l -3 -3
          lineToRelative(dx = -3.0f, dy = -3.0f)
          // a 1 1 0 0 1 0 -1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -1.4f,
          )
          // l 3 -3
          lineToRelative(dx = 3.0f, dy = -3.0f)
          // a 1 1 0 0 1 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // l 3 3
          lineToRelative(dx = 3.0f, dy = 3.0f)
          // a 1 1 0 0 1 0 1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.4f,
          )
          // l -3 3
          lineToRelative(dx = -3.0f, dy = 3.0f)
          // A 1 1 0 0 1 16 14
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 14.0f,
          )
          // m -1.59 -4
          moveToRelative(dx = -1.59f, dy = -4.0f)
          // L 16 11.59
          lineTo(x = 16.0f, y = 11.59f)
          // L 17.59 10
          lineTo(x = 17.59f, y = 10.0f)
          // L 16 8.41z
          lineTo(x = 16.0f, y = 8.41f)
          close()
          // M 10 20
          moveTo(x = 10.0f, y = 20.0f)
          // a 1 1 0 0 1 -0.7 -0.3
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.7f,
            dy1 = -0.3f,
          )
          // l -3 -3
          lineToRelative(dx = -3.0f, dy = -3.0f)
          // a 1 1 0 0 1 0 -1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -1.4f,
          )
          // l 3 -3
          lineToRelative(dx = 3.0f, dy = -3.0f)
          // a 1 1 0 0 1 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // l 3 3
          lineToRelative(dx = 3.0f, dy = 3.0f)
          // a 1 1 0 0 1 0 1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.4f,
          )
          // l -3 3
          lineToRelative(dx = -3.0f, dy = 3.0f)
          // A 1 1 0 0 1 10 20
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.0f,
            y1 = 20.0f,
          )
          // m -1.59 -4
          moveToRelative(dx = -1.59f, dy = -4.0f)
          // L 10 17.59
          lineTo(x = 10.0f, y = 17.59f)
          // L 11.59 16
          lineTo(x = 11.59f, y = 16.0f)
          // L 10 14.41z
          lineTo(x = 10.0f, y = 14.41f)
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
      .also { _webServicesCluster = it }
  }

@Suppress("ObjectPropertyName")
private var _webServicesCluster: ImageVector? = null

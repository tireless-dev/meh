// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeploymentPattern: ImageVector
  get() {
    val current = _deploymentPattern
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DeploymentPattern",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M8 20 H4.73 A2 2 0 0 0 3 19 a2 2 0 0 0 0 4 2 2 0 0 0 1.73 -1 H8Z M29 9 a2 2 0 0 0 -1.73 1 H24 v2 h3.27 A2 2 0 1 0 29 9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 20
          moveTo(x = 8.0f, y = 20.0f)
          // H 4.73
          horizontalLineTo(x = 4.73f)
          // A 2 2 0 0 0 3 19
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 19.0f,
          )
          // a 2 2 0 0 0 0 4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 4.0f,
          )
          // a 2 2 0 0 0 1.73 -1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.73f,
            dy1 = -1.0f,
          )
          // H 8z
          horizontalLineTo(x = 8.0f)
          close()
          // M 29 9
          moveTo(x = 29.0f, y = 9.0f)
          // a 2 2 0 0 0 -1.73 1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.73f,
            dy1 = 1.0f,
          )
          // H 24
          horizontalLineTo(x = 24.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3.27
          horizontalLineToRelative(dx = 3.27f)
          // A 2 2 0 1 0 29 9
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 29.0f,
            y1 = 9.0f,
          )
        }
        // M25.41 5 21 .59 16.59 5 20 8.41 V18 h2 V8.41Z M21 3.41 22.59 5 21 6.59 19.41 5Z M12 23.6 V14 h-2 v9.59 L6.59 27 11 31.41 15.41 27Z M9.41 27 11 25.41 12.59 27 11 28.59Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.41 5
          moveTo(x = 25.41f, y = 5.0f)
          // L 21 0.59
          lineTo(x = 21.0f, y = 0.59f)
          // L 16.59 5
          lineTo(x = 16.59f, y = 5.0f)
          // L 20 8.41
          lineTo(x = 20.0f, y = 8.41f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8.41z
          verticalLineTo(y = 8.41f)
          close()
          // M 21 3.41
          moveTo(x = 21.0f, y = 3.41f)
          // L 22.59 5
          lineTo(x = 22.59f, y = 5.0f)
          // L 21 6.59
          lineTo(x = 21.0f, y = 6.59f)
          // L 19.41 5z
          lineTo(x = 19.41f, y = 5.0f)
          close()
          // M 12 23.6
          moveTo(x = 12.0f, y = 23.6f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 9.59
          verticalLineToRelative(dy = 9.59f)
          // L 6.59 27
          lineTo(x = 6.59f, y = 27.0f)
          // L 11 31.41
          lineTo(x = 11.0f, y = 31.41f)
          // L 15.41 27z
          lineTo(x = 15.41f, y = 27.0f)
          close()
          // M 9.41 27
          moveTo(x = 9.41f, y = 27.0f)
          // L 11 25.41
          lineTo(x = 11.0f, y = 25.41f)
          // L 12.59 27
          lineTo(x = 12.59f, y = 27.0f)
          // L 11 28.59z
          lineTo(x = 11.0f, y = 28.59f)
          close()
        }
        // M18 10 H8.41 L5 6.59 .59 11 5 15.41 8.41 12 H18Z M5 12.59 3.41 11 5 9.41 6.59 11Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 10
          moveTo(x = 18.0f, y = 10.0f)
          // H 8.41
          horizontalLineTo(x = 8.41f)
          // L 5 6.59
          lineTo(x = 5.0f, y = 6.59f)
          // L 0.59 11
          lineTo(x = 0.59f, y = 11.0f)
          // L 5 15.41
          lineTo(x = 5.0f, y = 15.41f)
          // L 8.41 12
          lineTo(x = 8.41f, y = 12.0f)
          // H 18z
          horizontalLineTo(x = 18.0f)
          close()
          // M 5 12.59
          moveTo(x = 5.0f, y = 12.59f)
          // L 3.41 11
          lineTo(x = 3.41f, y = 11.0f)
          // L 5 9.41
          lineTo(x = 5.0f, y = 9.41f)
          // L 6.59 11z
          lineTo(x = 6.59f, y = 11.0f)
          close()
        }
        // M13 3 a2 2 0 0 0 -4 0 2 2 0 0 0 1 1.73 V8 h2 V4.73 A2 2 0 0 0 13 3 m9 24.27 V24 h-2 v3.27 a2 2 0 1 0 2 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 3
          moveTo(x = 13.0f, y = 3.0f)
          // a 2 2 0 0 0 -4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 0 0 1 1.73
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.73f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4.73
          verticalLineTo(y = 4.73f)
          // A 2 2 0 0 0 13 3
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.0f,
            y1 = 3.0f,
          )
          // m 9 24.27
          moveToRelative(dx = 9.0f, dy = 24.27f)
          // V 24
          verticalLineTo(y = 24.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3.27
          verticalLineToRelative(dy = 3.27f)
          // a 2 2 0 1 0 2 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
        }
        // M31.41 21 27 16.59 23.59 20 H14 v2 h9.59 L27 25.41Z M27 19.41 28.59 21 27 22.59 25.41 21Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31.41 21
          moveTo(x = 31.41f, y = 21.0f)
          // L 27 16.59
          lineTo(x = 27.0f, y = 16.59f)
          // L 23.59 20
          lineTo(x = 23.59f, y = 20.0f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 9.59
          horizontalLineToRelative(dx = 9.59f)
          // L 27 25.41z
          lineTo(x = 27.0f, y = 25.41f)
          close()
          // M 27 19.41
          moveTo(x = 27.0f, y = 19.41f)
          // L 28.59 21
          lineTo(x = 28.59f, y = 21.0f)
          // L 27 22.59
          lineTo(x = 27.0f, y = 22.59f)
          // L 25.41 21z
          lineTo(x = 25.41f, y = 21.0f)
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
      .also { _deploymentPattern = it }
  }

@Suppress("ObjectPropertyName")
private var _deploymentPattern: ImageVector? = null

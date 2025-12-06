// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionBearRight02Filled: ImageVector
  get() {
    val current = _directionBearRight02Filled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionBearRight02Filled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 M6 7.41 7.41 6 14 12.59 12.59 14Z M26 16 h-2 V9.41 l-6.54 6.54 A5 5 0 0 0 16 19.49 V26 h-2 v-6.51 a7 7 0 0 1 2.05 -4.95 L22.59 8 H16 V6 h10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
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
          // M 6 7.41
          moveTo(x = 6.0f, y = 7.41f)
          // L 7.41 6
          lineTo(x = 7.41f, y = 6.0f)
          // L 14 12.59
          lineTo(x = 14.0f, y = 12.59f)
          // L 12.59 14z
          lineTo(x = 12.59f, y = 14.0f)
          close()
          // M 26 16
          moveTo(x = 26.0f, y = 16.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 9.41
          verticalLineTo(y = 9.41f)
          // l -6.54 6.54
          lineToRelative(dx = -6.54f, dy = 6.54f)
          // A 5 5 0 0 0 16 19.49
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 19.49f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -6.51
          verticalLineToRelative(dy = -6.51f)
          // a 7 7 0 0 1 2.05 -4.95
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.05f,
            dy1 = -4.95f,
          )
          // L 22.59 8
          lineTo(x = 22.59f, y = 8.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
        }
        // M26 6 v10 h-2 V9.41 l-6.54 6.54 A5 5 0 0 0 16 19.49 V26 h-2 v-6.51 a7 7 0 0 1 2.05 -4.95 L22.59 8 H16 V6Z m-12 6.59 L7.41 6 6 7.41 12.59 14Z
        path {
          // M 26 6
          moveTo(x = 26.0f, y = 6.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 9.41
          verticalLineTo(y = 9.41f)
          // l -6.54 6.54
          lineToRelative(dx = -6.54f, dy = 6.54f)
          // A 5 5 0 0 0 16 19.49
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 19.49f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -6.51
          verticalLineToRelative(dy = -6.51f)
          // a 7 7 0 0 1 2.05 -4.95
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.05f,
            dy1 = -4.95f,
          )
          // L 22.59 8
          lineTo(x = 22.59f, y = 8.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m -12 6.59
          moveToRelative(dx = -12.0f, dy = 6.59f)
          // L 7.41 6
          lineTo(x = 7.41f, y = 6.0f)
          // L 6 7.41
          lineTo(x = 6.0f, y = 7.41f)
          // L 12.59 14z
          lineTo(x = 12.59f, y = 14.0f)
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
      .also { _directionBearRight02Filled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionBearRight02Filled: ImageVector? = null
